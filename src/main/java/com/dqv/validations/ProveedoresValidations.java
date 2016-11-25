package com.dqv.validations;

import com.dqv.Entities.CuentasContables;
import com.dqv.dto.ObtenerSession;
import org.hibernate.Criteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Controller;

import java.sql.SQLException;

/**
 * Created by ezequ on 11/24/2016.
 */
@Controller
public class ProveedoresValidations extends ObtenerSession {
    public boolean validaCuentaContable(int cuentaContable) throws SQLException {
        boolean existe = false;

        Criteria criteria = getSession().createCriteria(CuentasContables.class);
        criteria.add(Restrictions.eq("cuentaContable", cuentaContable));
        criteria.setProjection(Projections.rowCount());

        long count = (Long) criteria.uniqueResult();
        if (count != 0) {
            System.out.println("Existe:: sigo insertando");
            existe = true;
        } else {
            System.out.println("No existe:: detengo inserccion");
            existe = false;
        }
        System.out.println(existe);


        return existe;
    }
}
