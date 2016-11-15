package com.dqv.controller;

import com.dqv.Entities.SolicitudDeCheque;
import com.dqv.services.SolicitudDeCheques.SolicitudChequesService;
import org.primefaces.context.RequestContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
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


    public void creaSolicitud()throws SQLException{
        solicitudChequesService.agregaSolicitud(solicitudDeCheque);

        RequestContext.getCurrentInstance().update("frmListaSolicitudes:tblSolc");

        RequestContext.getCurrentInstance().reset("frmSolicitudes:panel");
    }
    public List<SolicitudDeCheque> chequeList()throws SQLException{
        return solicitudChequesService.lisChequeList();
    }

    public void borraSolicitud(int idSolicitud) throws SQLException{
        solicitudChequesService.borraSolicitud(idSolicitud);
        RequestContext.getCurrentInstance().update("frmListaSolicitudes:tblSolc");
    }

    public SolicitudesController(){
        solicitudDeCheque = new SolicitudDeCheque();
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
}
