package com.dqv.controller;


import com.dqv.Entities.ConceptosDePago;
import com.dqv.services.ConceptosPago.ConceptosService;
import org.primefaces.context.RequestContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by ezequ on 11/9/2016.
 */

@Controller
@ManagedBean(name = "conceptosController")
@ViewScoped
public class ConceptosController implements Serializable {

    private ConceptosDePago conceptosDePago;


    @Autowired
    private ConceptosService conceptosService;

    public void agregaConcepeto() throws SQLException {
        conceptosService.agregaConcepto(conceptosDePago);

        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Correcto", "Concepto Agregado"));

        RequestContext.getCurrentInstance().update("frmListaConcetpos:tblConceptos");

        RequestContext.getCurrentInstance().reset("frmConceptos:panel");
    }

    public List<ConceptosDePago> listarConceptos() throws SQLException {
        return conceptosService.listarConceptosDePagos();
    }

    public void borraConcepto(int idConcepto) throws SQLException {
        conceptosService.borraConcepto(idConcepto);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Correcto", "Concepto Eliminado!"));

        RequestContext.getCurrentInstance().update("frmListaConcetpos:tblConceptos");
    }


    public ConceptosController() {
        conceptosDePago = new ConceptosDePago();
    }

    public ConceptosDePago getConceptosDePago() {
        return conceptosDePago;
    }

    public void setConceptosDePago(ConceptosDePago conceptosDePago) {
        this.conceptosDePago = conceptosDePago;
    }

    public ConceptosService getConceptosService() {
        return conceptosService;
    }

    public void setConceptosService(ConceptosService conceptosService) {
        this.conceptosService = conceptosService;
    }

}
