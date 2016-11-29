package com.dqv.Entities;

import javax.persistence.*;

/**
 * Created by ezequ on 11/24/2016.
 */
@Entity
public class Banco {
    private Integer id;
    private String codigoBanco;
    private String razonSocial;
    private String estado;

    @Id
    @Column(name = "ID", nullable = false, precision = 0)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "CODIGO_BANCO", nullable = false, length = 10)
    public String getCodigoBanco() {
        return codigoBanco;
    }

    public void setCodigoBanco(String codigoBanco) {
        this.codigoBanco = codigoBanco;
    }

    @Basic
    @Column(name = "RAZON_SOCIAL", nullable = false, length = 50)
    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    @Basic
    @Column(name = "ESTADO", nullable = true, length = 2, insertable = false)
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }


}
