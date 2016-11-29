package com.dqv.validations;


import com.dqv.Entities.CuentasContables;
import com.dqv.Entities.Proveedores;
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

    public boolean existeRegistro(int cuentaContable) throws SQLException{
        boolean existe = false;
        Criteria criteria = getSession().createCriteria(Proveedores.class);
        criteria.add(Restrictions.eq("cuentaContable", cuentaContable));
        criteria.setProjection(Projections.rowCount());
        long count = (Long) criteria.uniqueResult();

        if (count != 0) {
            System.out.println("Existe Registro::No se puede continuar ");
            existe = true;
        } else {
            System.out.println("No existe:: Continuo la inserccion");
            existe = false;
        }
        return existe;
    }

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
    public boolean validaRnc(String rncCedulaProveedor) throws SQLException{
        boolean existePro = false;

        Criteria criteria = getSession().createCriteria(CuentasContables.class);
        criteria.add(Restrictions.eq("rncCedulaProveedor",rncCedulaProveedor));
        criteria.setProjection(Projections.rowCount());
        long cuenta = (Long) criteria.uniqueResult();
        if (cuenta != 0) {
            System.out.println("Existe::: sigo insertando");
            existePro = true;
        } else {
            System.out.println("No existe::: detengo inserccion");
            existePro = false;
        }
        System.out.println(existePro);


        return existePro;

    }

}
