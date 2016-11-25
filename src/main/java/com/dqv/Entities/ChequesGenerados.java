package com.dqv.Entities;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by ezequ on 11/24/2016.
 */
@Entity
@Table(name = "CHEQUES_GENERADOS", schema = "C##DQUIROZ", catalog = "")
public class ChequesGenerados {
    private Integer id;
    private Integer numCheque;
    private Integer cuentaContableProveedor;
    private Integer cuentaContableBanco;
    private Double monto;
    private Double montoRestante;
    private String estado;
    private Date fechaGeneracion;

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
    @Column(name = "MONTO", nullable = false, precision = 2)
    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    @Basic
    @Column(name = "MONTO_RESTANTE", nullable = false, precision = 2)
    public Double getMontoRestante() {
        return montoRestante;
    }

    public void setMontoRestante(Double montoRestante) {
        this.montoRestante = montoRestante;
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
    @Column(name = "FECHA_GENERACION", nullable = true)
    public Date getFechaGeneracion() {
        return fechaGeneracion;
    }

    public void setFechaGeneracion(Date fechaGeneracion) {
        this.fechaGeneracion = fechaGeneracion;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        ChequesGenerados that = (ChequesGenerados) object;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (numCheque != null ? !numCheque.equals(that.numCheque) : that.numCheque != null) return false;
        if (cuentaContableProveedor != null ? !cuentaContableProveedor.equals(that.cuentaContableProveedor) : that.cuentaContableProveedor != null)
            return false;
        if (cuentaContableBanco != null ? !cuentaContableBanco.equals(that.cuentaContableBanco) : that.cuentaContableBanco != null)
            return false;
        if (monto != null ? !monto.equals(that.monto) : that.monto != null) return false;
        if (montoRestante != null ? !montoRestante.equals(that.montoRestante) : that.montoRestante != null)
            return false;
        if (estado != null ? !estado.equals(that.estado) : that.estado != null) return false;
        if (fechaGeneracion != null ? !fechaGeneracion.equals(that.fechaGeneracion) : that.fechaGeneracion != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (numCheque != null ? numCheque.hashCode() : 0);
        result = 31 * result + (cuentaContableProveedor != null ? cuentaContableProveedor.hashCode() : 0);
        result = 31 * result + (cuentaContableBanco != null ? cuentaContableBanco.hashCode() : 0);
        result = 31 * result + (monto != null ? monto.hashCode() : 0);
        result = 31 * result + (montoRestante != null ? montoRestante.hashCode() : 0);
        result = 31 * result + (estado != null ? estado.hashCode() : 0);
        result = 31 * result + (fechaGeneracion != null ? fechaGeneracion.hashCode() : 0);
        return result;
    }
}
