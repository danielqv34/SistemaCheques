package com.dqv.repositories.CuentasContables;

import com.dqv.Entities.CuentasContables;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by ezequ on 11/11/2016.
 */
public interface CuentaContablesRepo {

    void agregaCuenta(CuentasContables cuentasContables) throws SQLException;

    void actualizaCuenta(CuentasContables cuentasContables) throws SQLException;

    void borraCuenta(int idCuenta) throws SQLException;

    CuentasContables obtenerCuenta(int idCuenta) throws SQLException;

    List<CuentasContables> liCuentasContables () throws SQLException;
}
