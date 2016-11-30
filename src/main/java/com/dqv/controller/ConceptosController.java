package com.dqv.controller;



import com.dqv.Entities.ConceptosDePago;
import com.dqv.services.ConceptosPago.ConceptosService;
import com.dqv.validations.ConceptosValidator;
import org.primefaces.context.RequestContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import java.io.IOException;
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

    @Autowired
    private ConceptosValidator conceptosValidator;


    public boolean agregaConcepeto() throws SQLException, IOException {
        if (conceptosValidator.existeConcepto(conceptosDePago.getSiglas()) == true) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Error", "Ya existe este de Concepto de Pago"));
            RequestContext.getCurrentInstance().reset("frmConceptos:panelConceptos");
            return false;

        } else {
            conceptosService.agregaConcepto(conceptosDePago);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Correcto", "Concepto Agregado"));
            RequestContext.getCurrentInstance().update("frmListaConcetpos:tblConceptos");
            RequestContext.getCurrentInstance().reset("frmConceptos:panelConceptos");
            return true;
        }
    }

    public List<ConceptosDePago> listarConceptos() throws SQLException {
        return conceptosService.listarConceptosDePagos();
    }

    public void borraConcepto(int idConcepto) throws SQLException {
        conceptosService.borraConcepto(idConcepto);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Correcto", "Concepto Eliminado!"));

        RequestContext.getCurrentInstance().update("frmListaConcetpos:tblConceptos");
    }


    public ConceptosController() {
        conceptosDePago = new ConceptosDePago();
        conceptosValidator = new ConceptosValidator();
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

    public ConceptosValidator getConceptosValidator() {
        return conceptosValidator;
    }

    public void setConceptosValidator(ConceptosValidator conceptosValidator) {
        this.conceptosValidator = conceptosValidator;
    }
}
