package com.dqv.controller;

import com.dqv.Entities.Banco;
import com.dqv.services.Bancos.BancoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.faces.bean.ManagedBean;
import java.sql.SQLException;

/**
 * Created by ezequ on 11/26/2016.
 */
@Controller
@ManagedBean(name = "bancoController")
public class BancoController {

    private Banco banco;

    @Autowired
    private BancoService bancoService;

    public boolean agregaBanco() throws SQLException {
        bancoService.agregaBanco(banco);

        return true;
    }


    public BancoController() {
        banco = new Banco();
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public BancoService getBancoService() {
        return bancoService;
    }

    public void setBancoService(BancoService bancoService) {
        this.bancoService = bancoService;
    }
}
