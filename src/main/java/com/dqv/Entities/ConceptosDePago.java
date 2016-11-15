package com.dqv.Entities;

import javax.persistence.*;

/**
 * Created by ezequ on 11/10/2016.
 */
@Entity
@Table(name = "CONCEPTOS_DE_PAGO", schema = "C##DQUIROZ", catalog = "")
public class ConceptosDePago {
    private int id;
    private int codigoPago;
    private String descripcionCorta;
    private String descripcionLarga;
    private String siglas;
    private int estado;

    @Id
    @Column(name = "ID", nullable = false, precision = 0)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "CODIGO_PAGO", nullable = false, precision = 2,insertable = true)
    @SequenceGenerator(name="COD_CONCP_PAGOS", sequenceName="COD_CONCP_PAGOS",allocationSize=1 ,initialValue = 100,schema = "C##DQUIROZ")
    public int getCodigoPago() {
        return codigoPago;
    }

    public void setCodigoPago(int codigoPago) {
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
    @Column(name = "ESTADO", nullable = false, precision = 0)
    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

}
