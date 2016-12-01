package com.dqv.controller;

import com.dqv.Entities.ChequesGenerados;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;


/**
 * Created by ezequ on 11/30/2016.
 */
@ManagedBean
@SessionScoped
@RestController
public class AsientosClient implements Serializable {

    private ChequesGenerados chequesGenerados;

    public void envio() {

        final String uri = "http://localhost:8080/springrestexample/employees";

        ChequesGenerados chequesGenerados = new ChequesGenerados();
        chequesGenerados.getDescripcion();
        chequesGenerados.getAuxiliar();
        chequesGenerados.getIdCuentaCont();
        chequesGenerados.getTipoMovimiento();
        chequesGenerados.getMonto();

        RestTemplate restTemplate = new RestTemplate();
        chequesGenerados = restTemplate.postForObject(uri, chequesGenerados, ChequesGenerados.class);

        System.out.println(chequesGenerados);
    }

}
