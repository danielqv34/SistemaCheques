package com.dqv.validations;


import com.dqv.Entities.Usuarios;
import com.dqv.dto.ObtenerSession;
import org.hibernate.Criteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Controller;

/**
 * Created by ezequ on 11/28/2016.
 */
@Controller
public class LoginValidator extends ObtenerSession {

    public boolean validaUsuario(String nombreUsuario, String clave) {
        boolean existe = false ;

        Criteria criteria = getSession().createCriteria(Usuarios.class);
        criteria.add(Restrictions.eq("nombreUsuario", nombreUsuario));
        criteria.add(Restrictions.eq("clave", clave));
        criteria.setProjection(Projections.rowCount());
        long count = (Long) criteria.uniqueResult();

        if (count != 0) {
            System.out.println("Usuario Autenticado:: Login S ");
            existe = true;
        } else {
            System.out.println("Usuario No existe ::Login N");
            existe = false;
        }
        return existe;
    }
}
