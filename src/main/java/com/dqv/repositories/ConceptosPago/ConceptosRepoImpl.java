package com.dqv.repositories.ConceptosPago;

import com.dqv.Entities.ConceptosDePago;
import com.dqv.dao.ObtenerSession;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.xml.transform.stream.StreamResult;
import java.sql.SQLException;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by ezequ on 11/10/2016.
 */
@Repository("repoConceptos")
@Transactional
public class ConceptosRepoImpl extends ObtenerSession implements ConceptoPagoRepo {


    @Override
    public void agregaConcepto(ConceptosDePago conceptosDePago) throws SQLException {
        System.out.println("Inicio de Insercion");
        guardarEnBD(conceptosDePago);
        System.out.println("Termino Insercion");
    }


    @Override
    public List<ConceptosDePago> listConceptosDePagos() throws SQLException {
        return getSession().createQuery("from ConceptosDePago").list();
    }

    @Override
    public void actulizaConcepto(ConceptosDePago conceptosDePago) throws SQLException {
        actulizarObjeto(conceptosDePago);
    }

    @Override
    public void borraConcepto(int idConcepto) throws SQLException {
        borrarObjeto(getConcepto(idConcepto));
    }

    @Override
    public ConceptosDePago getConcepto(int idConcepto) throws SQLException {
        return (ConceptosDePago) getSession().get(ConceptosDePago.class, idConcepto);
    }
}
