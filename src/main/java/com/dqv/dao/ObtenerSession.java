package com.dqv.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * Created by ezequ on 10/26/2016.
 */

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
