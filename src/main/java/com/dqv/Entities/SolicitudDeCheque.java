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
    @Column(name = "ID_CUENTA_CONT", nullable = false, precision = 0)
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

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        SolicitudDeCheque that = (SolicitudDeCheque) object;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (numeroDeSolicitud != null ? !numeroDeSolicitud.equals(that.numeroDeSolicitud) : that.numeroDeSolicitud != null)
            return false;
        if (rncCedulaProveedor != null ? !rncCedulaProveedor.equals(that.rncCedulaProveedor) : that.rncCedulaProveedor != null)
            return false;
        if (tipoMovimiento != null ? !tipoMovimiento.equals(that.tipoMovimiento) : that.tipoMovimiento != null)
            return false;
        if (idCuentaCont != null ? !idCuentaCont.equals(that.idCuentaCont) : that.idCuentaCont != null) return false;
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
        result = 31 * result + (rncCedulaProveedor != null ? rncCedulaProveedor.hashCode() : 0);
        result = 31 * result + (tipoMovimiento != null ? tipoMovimiento.hashCode() : 0);
        result = 31 * result + (idCuentaCont != null ? idCuentaCont.hashCode() : 0);
        result = 31 * result + (monto != null ? monto.hashCode() : 0);
        result = 31 * result + (fechaDeRegistro != null ? fechaDeRegistro.hashCode() : 0);
        result = 31 * result + (estado != null ? estado.hashCode() : 0);
        result = 31 * result + (cuentaContableProveedor != null ? cuentaContableProveedor.hashCode() : 0);
        result = 31 * result + (cuentaContableBanco != null ? cuentaContableBanco.hashCode() : 0);
        return result;
    }
}
