package com.dqv.repositories.ConceptosPago;

import com.dqv.Entities.ConceptosDePago;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by ezequ on 11/10/2016.
 */
public interface ConceptoPagoRepo {

    void agregaConcepto(ConceptosDePago conceptosDePago) throws SQLException;

    List<ConceptosDePago> listConceptosDePagos() throws SQLException;

    void actulizaConcepto(ConceptosDePago conceptosDePago) throws SQLException;

    void borraConcepto(int idConcepto) throws SQLException;

    ConceptosDePago getConcepto(int idConcepto) throws SQLException;

}
