package com.dqv.validations;

import com.dqv.dto.ObtenerSession;
import com.dqv.Entities.ConceptosDePago;
import org.hibernate.Criteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Controller;


/**
 * Created by ezequ on 11/16/2016.
 */
@Controller
public class ConceptosValidator extends ObtenerSession {

    private ConceptosDePago conceptosDePago;


    public boolean existeConcepto(String siglas) {
        boolean existe = false ;

        Criteria criteria = getSession().createCriteria(ConceptosDePago.class);
        criteria.add(Restrictions.eq("siglas", siglas));
        criteria.setProjection(Projections.rowCount());
        long count = (Long) criteria.uniqueResult();

        if (count != 0) {
            System.out.println("Existe::No se puede continuar ");
            existe = true;
        } else {
            System.out.println("No existe:: Continuo la inserccion");
            existe = false;
        }
        return existe;
    }


}
