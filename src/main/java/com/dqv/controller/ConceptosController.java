package com.dqv.controller;


import com.dqv.Entities.ConceptosDePago;
import com.dqv.dao.ObtenerSession;
import com.dqv.services.ConceptosPago.ConceptosService;
import org.hibernate.Criteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;
import org.primefaces.context.RequestContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

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
public class ConceptosController extends ObtenerSession implements Serializable {

    private ConceptosDePago conceptosDePago;


    @Autowired
    private ConceptosService conceptosService;

    public boolean agregaConcepeto() throws SQLException {

        if (existeConcepto() == true) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Error", "Ya existe este de Concepto de Pago"));
            return false;

        } else {

            conceptosService.agregaConcepto(conceptosDePago);

            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Correcto", "Concepto Agregado"));

            RequestContext.getCurrentInstance().update("frmListaConcetpos:tblConceptos");

            RequestContext.getCurrentInstance().reset("frmConceptos:panel");

            return true;
        }


    }

    public List<ConceptosDePago> listarConceptos() throws SQLException {
        return conceptosService.listarConceptosDePagos();
    }

    public void borraConcepto(int idConcepto) throws SQLException {
        conceptosService.borraConcepto(idConcepto);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Correcto", "Concepto Eliminado!"));

        RequestContext.getCurrentInstance().update("frmListaConcetpos:tblConceptos");
    }

    public boolean existeConcepto() {
        Criteria criteria = getSession().createCriteria(ConceptosDePago.class);
        criteria.add(Restrictions.eq("siglas", conceptosDePago.getSiglas()));
        criteria.setProjection(Projections.rowCount());
        long count = (Long) criteria.uniqueResult();
        if (count != 0) {
            System.out.println("Exite sigla pago");
            return true;
        } else {
            System.out.println("No existe:: Continuo la inserccion");
            return false;
        }
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
