package com.dqv.Entities;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by ezequ on 11/24/2016.
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
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "NUM_CHEQUE", nullable = true, precision = 0)
    public Integer getNumCheque() {
        return numCheque;
    }

    public void setNumCheque(Integer numCheque) {
        this.numCheque = numCheque;
    }

    @Basic
    @Column(name = "DESCRIPCION_RECHAZO", nullable = true, length = 200)
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
    @Column(name = "ESTADO", nullable = true, length = 2)
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Basic
    @Column(name = "FECHA_RECHAZO", nullable = true)
    public Date getFechaRechazo() {
        return fechaRechazo;
    }

    public void setFechaRechazo(Date fechaRechazo) {
        this.fechaRechazo = fechaRechazo;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        ChequesRechazados that = (ChequesRechazados) object;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (numCheque != null ? !numCheque.equals(that.numCheque) : that.numCheque != null) return false;
        if (descripcionRechazo != null ? !descripcionRechazo.equals(that.descripcionRechazo) : that.descripcionRechazo != null)
            return false;
        if (cuentaContableProveedor != null ? !cuentaContableProveedor.equals(that.cuentaContableProveedor) : that.cuentaContableProveedor != null)
            return false;
        if (cuentaContableBanco != null ? !cuentaContableBanco.equals(that.cuentaContableBanco) : that.cuentaContableBanco != null)
            return false;
        if (montoRechazado != null ? !montoRechazado.equals(that.montoRechazado) : that.montoRechazado != null)
            return false;
        if (montoActual != null ? !montoActual.equals(that.montoActual) : that.montoActual != null) return false;
        if (estado != null ? !estado.equals(that.estado) : that.estado != null) return false;
        if (fechaRechazo != null ? !fechaRechazo.equals(that.fechaRechazo) : that.fechaRechazo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (numCheque != null ? numCheque.hashCode() : 0);
        result = 31 * result + (descripcionRechazo != null ? descripcionRechazo.hashCode() : 0);
        result = 31 * result + (cuentaContableProveedor != null ? cuentaContableProveedor.hashCode() : 0);
        result = 31 * result + (cuentaContableBanco != null ? cuentaContableBanco.hashCode() : 0);
        result = 31 * result + (montoRechazado != null ? montoRechazado.hashCode() : 0);
        result = 31 * result + (montoActual != null ? montoActual.hashCode() : 0);
        result = 31 * result + (estado != null ? estado.hashCode() : 0);
        result = 31 * result + (fechaRechazo != null ? fechaRechazo.hashCode() : 0);
        return result;
    }
}
