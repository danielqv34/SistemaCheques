package com.dqv.Entities;

import org.springframework.web.context.annotation.SessionScope;

import javax.faces.bean.ManagedBean;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by ezequ on 11/24/2016.
 */
@Entity
@ManagedBean
@SessionScope
public class Usuarios {
    private Integer id;
    private Integer idRol;
    private String nombreUsuario;
    private String clave;
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
    @Column(name = "ID_ROL", nullable = true, precision = 0)
    public Integer getIdRol() {
        return idRol;
    }

    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }

    @Basic
    @Column(name = "NOMBRE_USUARIO", nullable = true, length = 150)
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    @Basic
    @Column(name = "CLAVE", nullable = true, length = 100)
    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
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

        Usuarios usuarios = (Usuarios) object;

        if (id != null ? !id.equals(usuarios.id) : usuarios.id != null) return false;
        if (idRol != null ? !idRol.equals(usuarios.idRol) : usuarios.idRol != null) return false;
        if (nombreUsuario != null ? !nombreUsuario.equals(usuarios.nombreUsuario) : usuarios.nombreUsuario != null)
            return false;
        if (clave != null ? !clave.equals(usuarios.clave) : usuarios.clave != null) return false;
        if (estado != null ? !estado.equals(usuarios.estado) : usuarios.estado != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (idRol != null ? idRol.hashCode() : 0);
        result = 31 * result + (nombreUsuario != null ? nombreUsuario.hashCode() : 0);
        result = 31 * result + (clave != null ? clave.hashCode() : 0);
        result = 31 * result + (estado != null ? estado.hashCode() : 0);
        return result;
    }
}
