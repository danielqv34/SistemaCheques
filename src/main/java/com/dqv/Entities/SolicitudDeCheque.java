package com.dqv.Entities;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by ezequ on 11/12/2016.
 */
@Entity
@Table(name = "SOLICITUD_DE_CHEQUE", schema = "C##DQUIROZ", catalog = "")
public class SolicitudDeCheque {
    private int id;
    private int númeroDeSolicitud;
    private String codigoBanco;
    private double monto;
    private Date fechaDeRegistro;
    private String estado;
    private int cuentaContableProveedor;
    private int cuentaContableBanco;

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
    @Column(name = "NÚMERO_DE_SOLICITUD", nullable = false, precision = 0 , insertable = true)
    @SequenceGenerator(name="NUM_SOLICITUD", sequenceName="NUM_SOLICITUD",allocationSize=1 ,initialValue = 10,schema = "C##DQUIROZ")
    public int getNúmeroDeSolicitud() {
        return númeroDeSolicitud;
    }

    public void setNúmeroDeSolicitud(int númeroDeSolicitud) {
        this.númeroDeSolicitud = númeroDeSolicitud;
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
    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
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
    @Column(name = "ESTADO", nullable = true, length = 15)
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Basic
    @Column(name = "CUENTA_CONTABLE_PROVEEDOR", nullable = false, precision = 0)
    public int getCuentaContableProveedor() {
        return cuentaContableProveedor;
    }

    public void setCuentaContableProveedor(int cuentaContableProveedor) {
        this.cuentaContableProveedor = cuentaContableProveedor;
    }

    @Basic
    @Column(name = "CUENTA_CONTABLE_BANCO", nullable = false, precision = 0)
    public int getCuentaContableBanco() {
        return cuentaContableBanco;
    }

    public void setCuentaContableBanco(int cuentaContableBanco) {
        this.cuentaContableBanco = cuentaContableBanco;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        SolicitudDeCheque that = (SolicitudDeCheque) object;

        if (id != that.id) return false;
        if (númeroDeSolicitud != that.númeroDeSolicitud) return false;
        if (Double.compare(that.monto, monto) != 0) return false;
        if (cuentaContableProveedor != that.cuentaContableProveedor) return false;
        if (cuentaContableBanco != that.cuentaContableBanco) return false;
        if (codigoBanco != null ? !codigoBanco.equals(that.codigoBanco) : that.codigoBanco != null) return false;
        if (fechaDeRegistro != null ? !fechaDeRegistro.equals(that.fechaDeRegistro) : that.fechaDeRegistro != null)
            return false;
        if (estado != null ? !estado.equals(that.estado) : that.estado != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + númeroDeSolicitud;
        result = 31 * result + (codigoBanco != null ? codigoBanco.hashCode() : 0);
        temp = Double.doubleToLongBits(monto);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (fechaDeRegistro != null ? fechaDeRegistro.hashCode() : 0);
        result = 31 * result + (estado != null ? estado.hashCode() : 0);
        result = 31 * result + cuentaContableProveedor;
        result = 31 * result + cuentaContableBanco;
        return result;
    }
}
