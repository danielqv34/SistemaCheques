package com.dqv.Entities;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by ezequ on 11/12/2016.
 */
@Entity
public class Proveedores {
    private int id;
    private String nombre;
    private String descripcion;
    private String tipoPersona;
    private String rncCedula;
    private int cuentaContable;
    private Double balance;
    private String direccion;
    private String telefono;
    private String correo;
    private Date fechaInscripcion;
    private Date fechaModificacion;
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
    @Column(name = "NOMBRE", nullable = false, length = 100)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
    @Column(name = "TIPO_PERSONA", nullable = false, length = 150)
    public String getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(String tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

    @Basic
    @Column(name = "RNC_CEDULA", nullable = false, length = 11)
    public String getRncCedula() {
        return rncCedula;
    }

    public void setRncCedula(String rncCedula) {
        this.rncCedula = rncCedula;
    }

    @Basic
    @Column(name = "CUENTA_CONTABLE", nullable = false, precision = 0)
    public int getCuentaContable() {
        return cuentaContable;
    }

    public void setCuentaContable(int cuentaContable) {
        this.cuentaContable = cuentaContable;
    }

    @Basic
    @Column(name = "BALANCE", nullable = true, precision = 2)
    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Basic
    @Column(name = "DIRECCION", nullable = true, length = 150)
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Basic
    @Column(name = "TELEFONO", nullable = false, length = 10)
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Basic
    @Column(name = "CORREO", nullable = false, length = 100)
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Basic
    @Column(name = "FECHA_INSCRIPCION", nullable = true,insertable = false)
    public Date getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(Date fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    @Basic
    @Column(name = "FECHA_MODIFICACION", nullable = true,insertable = false)
    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
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
