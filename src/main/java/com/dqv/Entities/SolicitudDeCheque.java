package com.dqv.Entities;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by ezequ on 11/29/2016.
 */
@Entity
@Table(name = "SOLICITUD_DE_CHEQUE", schema = "C##DQUIROZ", catalog = "")
public class SolicitudDeCheque {
    private Integer id;
    private Integer numeroDeSolicitud;
    private String rncCedulaProveedor;
    private String tipoMovimiento;
    private Integer idCuentaCont;
    private Double monto;
    private Date fechaDeRegistro;
    private String estado;
    private Integer cuentaContableProveedor;
    private Integer cuentaContableBanco;

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
    @Column(name = "NUMERO_DE_SOLICITUD", nullable = true, precision = 0,insertable = false)
    public Integer getNumeroDeSolicitud() {
        return numeroDeSolicitud;
    }

    public void setNumeroDeSolicitud(Integer numeroDeSolicitud) {
        this.numeroDeSolicitud = numeroDeSolicitud;
    }

    @Basic
    @Column(name = "RNC_CEDULA_PROVEEDOR", nullable = false, length = 11)
    public String getRncCedulaProveedor() {
        return rncCedulaProveedor;
    }

    public void setRncCedulaProveedor(String rncCedulaProveedor) {
        this.rncCedulaProveedor = rncCedulaProveedor;
    }

    @Basic
    @Column(name = "TIPO_MOVIMIENTO", nullable = false, length = 2)
    public String getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setTipoMovimiento(String tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    @Basic
    @Column(name = "ID_CUENTA_CONT", nullable = true, precision = 0,insertable = false)
    public Integer getIdCuentaCont() {
        return idCuentaCont;
    }

    public void setIdCuentaCont(Integer idCuentaCont) {
        this.idCuentaCont = idCuentaCont;
    }

    @Basic
    @Column(name = "MONTO", nullable = false, precision = 2)
    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    @Basic
    @Column(name = "FECHA_DE_REGISTRO", nullable = true)
    public Date getFechaDeRegistro() {
        return fechaDeRegistro;
    }

    public void setFechaDeRegistro(Date fechaDeRegistro) {
        this.fechaDeRegistro = fechaDeRegistro;
    }

    @Basic
    @Column(name = "ESTADO", nullable = true, length = 2,insertable = false)
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Basic
    @Column(name = "CUENTA_CONTABLE_PROVEEDOR", nullable = false, precision = 0)
    public Integer getCuentaContableProveedor() {
        return cuentaContableProveedor;
    }

    public void setCuentaContableProveedor(Integer cuentaContableProveedor) {
        this.cuentaContableProveedor = cuentaContableProveedor;
    }

    @Basic
    @Column(name = "CUENTA_CONTABLE_BANCO", nullable = false, precision = 0)
    public Integer getCuentaContableBanco() {
        return cuentaContableBanco;
    }

    public void setCuentaContableBanco(Integer cuentaContableBanco) {
        this.cuentaContableBanco = cuentaContableBanco;
    }


}
