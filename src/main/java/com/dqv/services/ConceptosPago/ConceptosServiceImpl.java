package com.dqv.services.ConceptosPago;

import com.dqv.Entities.ConceptosDePago;
import com.dqv.repositories.ConceptosPago.ConceptoPagoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by ezequ on 11/10/2016.
 */
@Service
@ComponentScan
public class ConceptosServiceImpl implements ConceptosService {

    @Autowired
    private ConceptoPagoRepo conceptoPagoRepo;

    @Override
    @Transactional
    public void agregaConcepto(ConceptosDePago conceptosDePago) throws SQLException {
           conceptoPagoRepo.agregaConcepto(conceptosDePago);
    }

    @Override
    @Transactional
    public void actualizaConcepto(ConceptosDePago conceptosDePago) throws SQLException {
        conceptoPagoRepo.actulizaConcepto(conceptosDePago);
    }

    @Override
    @Transactional
    public void borraConcepto(int idConcepto) throws SQLException {
         conceptoPagoRepo.borraConcepto(idConcepto);
    }

    @Override
    @Transactional
    public List<ConceptosDePago> listarConceptosDePagos() throws SQLException {
        return conceptoPagoRepo.listConceptosDePagos();
    }
}
