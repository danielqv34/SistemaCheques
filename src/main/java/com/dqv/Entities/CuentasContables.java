package com.dqv.Entities;

import javax.persistence.*;

/**
 * Created by ezequ on 11/24/2016.
 */
@Entity
@Table(name = "CUENTAS_CONTABLES", schema = "C##DQUIROZ")
public class CuentasContables {
    private Integer id;
    private String codigoBanco;
    private String rncCedulaProveedor;
    private Integer cuentaContable;
    private double montoCuenta;
    private String descripcion;
    private String estado;

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
    @Column(name = "CUENTA_CONTABLE", nullable = false, precision = 0, insertable = false)
    public Integer getCuentaContable() {
        return cuentaContable;
    }

    public void setCuentaContable(Integer cuentaContable) {
        this.cuentaContable = cuentaContable;
    }

    @Basic
    @Column(name = "MONTO_CUENTA", nullable = false, precision = 2)
    public Double getMontoCuenta() {
        return montoCuenta;
    }

    public void setMontoCuenta(Double montoCuenta) {
        this.montoCuenta = montoCuenta;
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
    @Column(name = "ESTADO", nullable = true, length = 2 ,insertable = false)
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
