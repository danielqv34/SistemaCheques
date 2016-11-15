package com.dqv.services.CuentasContables;

import com.dqv.Entities.CuentasContables;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by ezequ on 11/11/2016.
 */

public interface CuentasContablesServices {

    void agregarCuenta(CuentasContables cuentasContables) throws SQLException;

    void actualizaCuenta(CuentasContables cuentasContables) throws SQLException;

    void borrarCuenta(int idCuenta) throws SQLException;

    List<CuentasContables> liCuentasContables() throws SQLException;

}
