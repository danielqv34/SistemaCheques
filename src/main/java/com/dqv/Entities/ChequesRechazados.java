package com.dqv.Entities;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by ezequ on 11/30/2016.
 */
@Entity
@Table(name = "CHEQUES_RECHAZADOS", schema = "C##DQUIROZ", catalog = "")
public class ChequesRechazados {
    private Integer id;
    private Integer numCheque;
    private String descripcionRechazo;
    private Integer cuentaContableProveedor;
    private Integer cuentaContableBanco;
    private Double montoRechazado;
    private Double montoActual;
    private String estado;
    private Date fechaRechazo;

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
    @Column(name = "NUM_CHEQUE", nullable = true, precision = 0 ,insertable = false)
    public Integer getNumCheque() {
        return numCheque;
    }

    public void setNumCheque(Integer numCheque) {
        this.numCheque = numCheque;
    }

    @Basic
    @Column(name = "DESCRIPCION_RECHAZO", nullable = true, length = 200,insertable = false)
    public String getDescripcionRechazo() {
        return descripcionRechazo;
    }

    public void setDescripcionRechazo(String descripcionRechazo) {
        this.descripcionRechazo = descripcionRechazo;
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

    @Basic
    @Column(name = "MONTO_RECHAZADO", nullable = false, precision = 2)
    public Double getMontoRechazado() {
        return montoRechazado;
    }

    public void setMontoRechazado(Double montoRechazado) {
        this.montoRechazado = montoRechazado;
    }

    @Basic
    @Column(name = "MONTO_ACTUAL", nullable = false, precision = 2)
    public Double getMontoActual() {
        return montoActual;
    }

    public void setMontoActual(Double montoActual) {
        this.montoActual = montoActual;
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
    @Column(name = "FECHA_RECHAZO", nullable = true,insertable = false)
    public Date getFechaRechazo() {
        return fechaRechazo;
    }

    public void setFechaRechazo(Date fechaRechazo) {
        this.fechaRechazo = fechaRechazo;
    }


}
