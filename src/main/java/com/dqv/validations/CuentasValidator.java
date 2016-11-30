package com.dqv.validations;


import com.dqv.dto.ObtenerSession;
import org.hibernate.query.Query;
import org.springframework.stereotype.Controller;

import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;
import java.util.List;

/**
 * Created by ezequ on 11/29/2016.
 */
@Controller
public class CuentasValidator extends ObtenerSession {

    public boolean validaBalance(String cedula, double monto) {
        boolean montoAprobado = false;

        String hql = " SELECT PROV.balance, SOL.monto  FROM Proveedores PROV JOIN SolicitudDeCheque SOL ON PROV.rncCedula = :cedula  where SOL.monto = :monto";
        Query criteria = getSession().createQuery(hql);
        criteria.setParameter("cedula", cedula);
        criteria.setParameter("monto", monto);
        List list = criteria.list();

        if (monto < 1000) {
            montoAprobado = true;
            System.out.println(monto);
        } else {
            montoAprobado = false;
        }
        return montoAprobado;
    }

    public void callProcesaCheque(){
        StoredProcedureQuery query = getSession().createStoredProcedureQuery("SP_INSERTA_CHEQUES");
       // .registerStoredProcedureParameter("cedula", cedula);
        query.execute();
    }

}
