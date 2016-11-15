package com.dqv.Entities;

import javax.persistence.*;

/**
 * Created by ezequ on 11/12/2016.
 */
@Entity
@Table(name = "CUENTAS_CONTABLES", schema = "C##DQUIROZ", catalog = "")
public class CuentasContables {
    private int id;
    private String codigoBanco;
    private String rncCedulaProveedor;
    private int cuentaContable;
    private String descripcion;
    private int estado;

    @Id
    @Column(name = "ID", nullable = false, precision = 0)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "RNC_CEDULA_PROVEEDOR", nullable = false, length = 11)
    public String getRncCedulaProveedor() {
        return rncCedulaProveedor;
    }

    public void setRncCedulaProveedor(String rncCedulaProveedor) {
        this.rncCedulaProveedor = rncCedulaProveedor;
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
    @Column(name = "DESCRIPCION", nullable = false, length = 150)
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Basic
    @Column(name = "ESTADO", nullable = false, precision = 0)
    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        CuentasContables that = (CuentasContables) object;

        if (id != that.id) return false;
        if (cuentaContable != that.cuentaContable) return false;
        if (estado != that.estado) return false;
        if (codigoBanco != null ? !codigoBanco.equals(that.codigoBanco) : that.codigoBanco != null) return false;
        if (rncCedulaProveedor != null ? !rncCedulaProveedor.equals(that.rncCedulaProveedor) : that.rncCedulaProveedor != null)
            return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (codigoBanco != null ? codigoBanco.hashCode() : 0);
        result = 31 * result + (rncCedulaProveedor != null ? rncCedulaProveedor.hashCode() : 0);
        result = 31 * result + cuentaContable;
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        result = 31 * result + estado;
        return result;
    }
}
