package com.dqv.dto;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;


/**
 * Created by ezequ on 10/26/2016.
 */
@Transactional
public  abstract class ObtenerSession {

    @Autowired
    private SessionFactory sessionFactory;

    protected Session getSession(){
        return sessionFactory.getCurrentSession();
    }

    public void guardarEnBD(Object object){
        getSession().save(object);
    }
    public void actulizarObjeto(Object object){
        getSession().update(object);
    }


    public void borrarObjeto(Object object){
        getSession().delete(object);
    }
}
