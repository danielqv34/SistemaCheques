package com.dqv.Entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

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
    @Column(name = "ESTADO", nullable = true, length = 2)
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Banco banco = (Banco) object;

        if (id != null ? !id.equals(banco.id) : banco.id != null) return false;
        if (codigoBanco != null ? !codigoBanco.equals(banco.codigoBanco) : banco.codigoBanco != null) return false;
        if (razonSocial != null ? !razonSocial.equals(banco.razonSocial) : banco.razonSocial != null) return false;
        if (estado != null ? !estado.equals(banco.estado) : banco.estado != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (codigoBanco != null ? codigoBanco.hashCode() : 0);
        result = 31 * result + (razonSocial != null ? razonSocial.hashCode() : 0);
        result = 31 * result + (estado != null ? estado.hashCode() : 0);
        return result;
    }
}
