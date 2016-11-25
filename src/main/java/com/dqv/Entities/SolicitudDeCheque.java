package com.dqv.Entities;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by ezequ on 11/24/2016.
 */
@Entity
@Table(name = "SOLICITUD_DE_CHEQUE", schema = "C##DQUIROZ", catalog = "")
public class SolicitudDeCheque {
    private Integer id;
    private Integer numeroDeSolicitud;
    private String codigoBanco;
    private Double monto;
    private Date fechaDeRegistro;
    private String estado;
    private Integer cuentaContableProveedor;
    private Integer cuentaContableBanco;

    @Id
    @Column(name = "ID", nullable = false, precision = 0)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "NUMERO_DE_SOLICITUD", nullable = true, precision = 0)
    public Integer getNumeroDeSolicitud() {
        return numeroDeSolicitud;
    }

    public void setNumeroDeSolicitud(Integer numeroDeSolicitud) {
        this.numeroDeSolicitud = numeroDeSolicitud;
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
    @Column(name = "ESTADO", nullable = true, length = 2)
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

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        SolicitudDeCheque that = (SolicitudDeCheque) object;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (numeroDeSolicitud != null ? !numeroDeSolicitud.equals(that.numeroDeSolicitud) : that.numeroDeSolicitud != null)
            return false;
        if (codigoBanco != null ? !codigoBanco.equals(that.codigoBanco) : that.codigoBanco != null) return false;
        if (monto != null ? !monto.equals(that.monto) : that.monto != null) return false;
        if (fechaDeRegistro != null ? !fechaDeRegistro.equals(that.fechaDeRegistro) : that.fechaDeRegistro != null)
            return false;
        if (estado != null ? !estado.equals(that.estado) : that.estado != null) return false;
        if (cuentaContableProveedor != null ? !cuentaContableProveedor.equals(that.cuentaContableProveedor) : that.cuentaContableProveedor != null)
            return false;
        if (cuentaContableBanco != null ? !cuentaContableBanco.equals(that.cuentaContableBanco) : that.cuentaContableBanco != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (numeroDeSolicitud != null ? numeroDeSolicitud.hashCode() : 0);
        result = 31 * result + (codigoBanco != null ? codigoBanco.hashCode() : 0);
        result = 31 * result + (monto != null ? monto.hashCode() : 0);
        result = 31 * result + (fechaDeRegistro != null ? fechaDeRegistro.hashCode() : 0);
        result = 31 * result + (estado != null ? estado.hashCode() : 0);
        result = 31 * result + (cuentaContableProveedor != null ? cuentaContableProveedor.hashCode() : 0);
        result = 31 * result + (cuentaContableBanco != null ? cuentaContableBanco.hashCode() : 0);
        return result;
    }
}
