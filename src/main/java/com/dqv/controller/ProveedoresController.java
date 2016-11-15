package com.dqv.controller;

import com.dqv.Entities.Proveedores;
import com.dqv.services.Proveedores.ProveedoresService;
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
public class ProveedoresController {

    private Proveedores proveedores;

    @Autowired
    private ProveedoresService proveedoresService;


    public void agregaProveedor() throws SQLException {
        //if (!validaCuentaContable(proveedores.getCuentaContable())) {
            proveedoresService.agregaProveedor(proveedores);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Correcto", "Proveedor Agregado"));

           RequestContext.getCurrentInstance().update("frmListaProveedores:tblProveedores");
            proveedores = new Proveedores();

            RequestContext.getCurrentInstance().reset("frmProveedores:panel");
//        } else {
//            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Error", "No existe la Cuenta Contable para este proveedor"));
//        }

    }

    public List<Proveedores> proveedoresList() throws SQLException {
        return proveedoresService.liProveedores();
    }

    public void borraProveedor(int idProveedor) throws SQLException {
        proveedoresService.borraProveedor(idProveedor);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Correcto", "Proveedor Eliminado!"));

        RequestContext.getCurrentInstance().update("frmListaProveedores:tblProveedores");
    }

//    private boolean validaCuentaContable(int idCuenta) throws SQLException {
//        proveedoresService.obtenerCuenta(idCuenta);
//        return true;
//    }

    public ProveedoresController() {
        proveedores = new Proveedores();
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
}
