package com.dqv.controller;

import com.dqv.Entities.CuentasContables;
import com.dqv.services.CuentasContables.CuentasContablesServices;
import org.primefaces.context.RequestContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by ezequ on 11/24/2016.
 */
@Controller
@ManagedBean(name = ("cuentasContablesController"))
public class CuentasContablesController {

    private CuentasContables cuentasContables;

    @Autowired
    private CuentasContablesServices cuentasContablesServices;

    public void agregaCuenta() throws SQLException {
        cuentasContablesServices.agregarCuenta(cuentasContables);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Correcto", "Cuenta Creada"));
        RequestContext.getCurrentInstance().reset("frmCuentas:panelCuentas");
        RequestContext.getCurrentInstance().update("frmListaCuentas:tblCuentas");

    }

    public List<CuentasContables> listarCuentas() throws SQLException {
       return cuentasContablesServices.liCuentasContables();
    }


    public void eliminaCuenta(int idCuenta) throws SQLException {
        cuentasContablesServices.borrarCuenta(idCuenta);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Correcto", "Cuenta Eliminada!"));

       RequestContext.getCurrentInstance().update("frmListaCuentas:tblCuentas");
    }




    public CuentasContablesController() {
        cuentasContables = new CuentasContables();
    }

    public CuentasContables getCuentasContables() {
        return cuentasContables;
    }

    public void setCuentasContables(CuentasContables cuentasContables) {
        this.cuentasContables = cuentasContables;
    }

    public CuentasContablesServices getCuentasContablesServices() {
        return cuentasContablesServices;
    }

    public void setCuentasContablesServices(CuentasContablesServices cuentasContablesServices) {
        this.cuentasContablesServices = cuentasContablesServices;
    }
}
