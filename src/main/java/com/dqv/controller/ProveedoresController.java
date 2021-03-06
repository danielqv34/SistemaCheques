package com.dqv.controller;


import com.dqv.dto.ObtenerSession;
import com.dqv.Entities.CuentasContables;
import com.dqv.Entities.Proveedores;
import com.dqv.services.Proveedores.ProveedoresService;
import com.dqv.validations.ProveedoresValidations;
import org.primefaces.context.RequestContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by ezequ on 11/11/2016.
 */
@Controller
@ManagedBean
@RequestScoped
public class ProveedoresController extends ObtenerSession {

    private Proveedores proveedores;

    private CuentasContables cuentasContables;

    @Autowired
    private ProveedoresService proveedoresService;

    @Autowired
    private ProveedoresValidations proveedoresValidations;


    public boolean agregaProveedor() throws SQLException {

        if (proveedoresValidations.existeRegistro(proveedores.getCuentaContable()) != true) {

            if (proveedoresValidations.validaCuentaContable(proveedores.getCuentaContable()) == true) {

                if (proveedoresValidations.validaRnc(proveedores.getRncCedula()) == true) {
                    proveedoresService.agregaProveedor(proveedores);
                    FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Correcto", "Proveedor Agregado"));

                    RequestContext.getCurrentInstance().update("frmListaProveedores:tblProveedores");
                    proveedores = new Proveedores();

                    RequestContext.getCurrentInstance().reset("frmProveedores:panel");

                    return true;

                } else {
                    FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Error", "No existe este  Proveedor"));
                    return false;
                }

            } else {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Error", "No existe esta cuenta contable para este Proveedor"));
                return false;

            }

        }else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Error", "Existe esta cuenta para este proveedor"));
            return false;
        }
    }

    public List<Proveedores> proveedoresList() throws SQLException {
        return proveedoresService.liProveedores();
    }

    public void borraProveedor(int idProveedor) throws SQLException {
        proveedoresService.borraProveedor(idProveedor);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Correcto", "Proveedor Eliminado!"));

        RequestContext.getCurrentInstance().update("frmListaProveedores:tblProveedores");
    }


    public ProveedoresController() {
        proveedores = new Proveedores();
        cuentasContables = new CuentasContables();
        proveedoresValidations = new ProveedoresValidations();
    }

    public Proveedores getProveedores() {
        return proveedores;
    }

    public void setProveedores(Proveedores proveedores) {
        this.proveedores = proveedores;
    }

    public ProveedoresService getProveedoresService() {
        return proveedoresService;
    }

    public void setProveedoresService(ProveedoresService proveedoresService) {
        this.proveedoresService = proveedoresService;
    }

    public CuentasContables getCuentasContables() {
        return cuentasContables;
    }

    public void setCuentasContables(CuentasContables cuentasContables) {
        this.cuentasContables = cuentasContables;
    }

    public ProveedoresValidations getProveedoresValidations() {
        return proveedoresValidations;
    }

    public void setProveedoresValidations(ProveedoresValidations proveedoresValidations) {
        this.proveedoresValidations = proveedoresValidations;
    }
}
