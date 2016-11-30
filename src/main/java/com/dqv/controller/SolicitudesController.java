package com.dqv.controller;

import com.dqv.Entities.Proveedores;
import com.dqv.Entities.SolicitudDeCheque;
import com.dqv.services.SolicitudDeCheques.SolicitudChequesService;
import com.dqv.validations.CuentasValidator;
import com.dqv.validations.ProveedoresValidations;
import org.primefaces.context.RequestContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by ezequ on 11/11/2016.
 */
@Controller
@ManagedBean
@ViewScoped
public class SolicitudesController {

    private SolicitudDeCheque solicitudDeCheque;


    @Autowired
    private SolicitudChequesService solicitudChequesService;

    @Autowired
    private ProveedoresValidations validations;

    @Autowired
    private CuentasValidator validator;


    public boolean creaSolicitud() throws SQLException {

        if (validations.validaRnc(solicitudDeCheque.getRncCedulaProveedor()) == true) {

            if (validations.validaCuentaContable(solicitudDeCheque.getCuentaContableProveedor()) == true) {

                solicitudChequesService.agregaSolicitud(solicitudDeCheque);

                RequestContext.getCurrentInstance().update("frmListaSolicitudes:tblSolc");

                RequestContext.getCurrentInstance().reset("frmSolicitudes:panel");


            } else {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Error", "No existe esta cuenta contable para este Proveedor"));
                return false;
            }

        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Error", "No existe este  Proveedor"));
            return false;
        }
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "No se Pudo Crear la Solicitud"));
        return false;
    }

    public void procesaCheque() {
        validator.callProcesaCheque();
        RequestContext.getCurrentInstance().update("frmListaSolicitudes:tblSolc");

    }

    public List<SolicitudDeCheque> chequeList() throws SQLException {
        return solicitudChequesService.lisChequeList();
    }

    public void borraSolicitud(int idSolicitud) throws SQLException {
        solicitudChequesService.borraSolicitud(idSolicitud);
        RequestContext.getCurrentInstance().update("frmListaSolicitudes:tblSolc");
    }

    public SolicitudesController() {
        solicitudDeCheque = new SolicitudDeCheque();
        validations = new ProveedoresValidations();
        validator = new CuentasValidator();
    }

    public SolicitudDeCheque getSolicitudDeCheque() {
        return solicitudDeCheque;
    }

    public void setSolicitudDeCheque(SolicitudDeCheque solicitudDeCheque) {
        this.solicitudDeCheque = solicitudDeCheque;
    }

    public SolicitudChequesService getSolicitudChequesService() {
        return solicitudChequesService;
    }

    public void setSolicitudChequesService(SolicitudChequesService solicitudChequesService) {
        this.solicitudChequesService = solicitudChequesService;
    }

    public ProveedoresValidations getValidations() {
        return validations;
    }

    public void setValidations(ProveedoresValidations validations) {
        this.validations = validations;
    }


    public CuentasValidator getValidator() {
        return validator;
    }

    public void setValidator(CuentasValidator validator) {
        this.validator = validator;
    }

}
