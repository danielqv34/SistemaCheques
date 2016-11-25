package com.dqv.Entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by ezequ on 11/24/2016.
 */
@Entity
public class Roles {
    private Integer id;
    private String descripcion;
    private Integer estado;

    @Id
    @Column(name = "ID", nullable = false, precision = 0)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "DESCRIPCION", nullable = false, length = 150)
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Basic
    @Column(name = "ESTADO", nullable = true, precision = 0)
    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Roles roles = (Roles) object;

        if (id != null ? !id.equals(roles.id) : roles.id != null) return false;
        if (descripcion != null ? !descripcion.equals(roles.descripcion) : roles.descripcion != null) return false;
        if (estado != null ? !estado.equals(roles.estado) : roles.estado != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        result = 31 * result + (estado != null ? estado.hashCode() : 0);
        return result;
    }
}
