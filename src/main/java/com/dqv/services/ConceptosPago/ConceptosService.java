package com.dqv.services.ConceptosPago;

import com.dqv.Entities.ConceptosDePago;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by ezequ on 11/10/2016.
 */
public interface ConceptosService {
    void agregaConcepto(ConceptosDePago conceptosDePago) throws SQLException;

    void actualizaConcepto(ConceptosDePago conceptosDePago) throws SQLException;

    void borraConcepto(int idConcepto) throws SQLException;

    List<ConceptosDePago> listarConceptosDePagos() throws SQLException;
}
