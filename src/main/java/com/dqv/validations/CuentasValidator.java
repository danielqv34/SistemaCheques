package com.dqv.validations;


import com.dqv.dto.ObtenerSession;
import org.springframework.stereotype.Controller;

import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;


/**
 * Created by ezequ on 11/29/2016.
 */
@Controller
public class CuentasValidator extends ObtenerSession {

    public boolean callProcesaCheque() {
        boolean resultadoEjecucion = true;
        StoredProcedureQuery query = getSession().createStoredProcedureQuery("SP_INSERTA_CHEQUES");
        query.execute();

        return resultadoEjecucion;
    }

}
