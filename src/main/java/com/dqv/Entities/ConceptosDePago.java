package com.dqv.Entities;

import javax.persistence.*;

/**
 * Created by ezequ on 11/24/2016.
 */
@Entity
@Table(name = "CONCEPTOS_DE_PAGO", schema = "C##DQUIROZ", catalog = "")
public class ConceptosDePago {
    private Integer id;
    private Integer codigoPago;
    private String descripcionCorta;
    private String descripcionLarga;
    private String siglas;
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
    @Column(name = "CODIGO_PAGO", nullable = true, precision = 2, insertable = false)
    public Integer getCodigoPago() {
        return codigoPago;
    }

    public void setCodigoPago(Integer codigoPago) {
        this.codigoPago = codigoPago;
    }

    @Basic
    @Column(name = "DESCRIPCION_CORTA", nullable = false, length = 150)
    public String getDescripcionCorta() {
        return descripcionCorta;
    }

    public void setDescripcionCorta(String descripcionCorta) {
        this.descripcionCorta = descripcionCorta;
    }

    @Basic
    @Column(name = "DESCRIPCION_LARGA", nullable = false, length = 150)
    public String getDescripcionLarga() {
        return descripcionLarga;
    }

    public void setDescripcionLarga(String descripcionLarga) {
        this.descripcionLarga = descripcionLarga;
    }

    @Basic
    @Column(name = "SIGLAS", nullable = false, length = 11)
    public String getSiglas() {
        return siglas;
    }

    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }

    @Basic
    @Column(name = "ESTADO", nullable = true, length = 2 , insertable = false)
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
