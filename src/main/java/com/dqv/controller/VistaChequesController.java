package com.dqv.controller;

import com.dqv.Entities.ChequesGenerados;
import com.dqv.Entities.ChequesRechazados;
import com.dqv.services.Cheques.ChequesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by ezequ on 11/30/2016.
 */

@ManagedBean
@Controller
@ViewScoped
public class VistaChequesController {

    private ChequesGenerados chequesGenerados;

    private ChequesRechazados chequesRechazados;

    @Autowired
    private ChequesService chequesService;


    public List<ChequesGenerados> listarChequesGenerados() throws SQLException {
        return chequesService.listarChequesGenerados();
    }

    public List<ChequesRechazados> listarChequesRechazados() throws SQLException {
        return chequesService.listarChequesRechazados();
    }


    public VistaChequesController() {
        chequesGenerados = new ChequesGenerados();
        chequesRechazados = new ChequesRechazados();
    }

    public ChequesGenerados getChequesGenerados() {
        return chequesGenerados;
    }

    public void setChequesGenerados(ChequesGenerados chequesGenerados) {
        this.chequesGenerados = chequesGenerados;
    }

    public ChequesRechazados getChequesRechazados() {
        return chequesRechazados;
    }

    public void setChequesRechazados(ChequesRechazados chequesRechazados) {
        this.chequesRechazados = chequesRechazados;
    }

    public ChequesService getChequesService() {
        return chequesService;
    }

    public void setChequesService(ChequesService chequesService) {
        this.chequesService = chequesService;
    }

}
