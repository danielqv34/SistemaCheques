package com.dqv.repositories.CuentasContables;

import com.dqv.dto.ObtenerSession;
import com.dqv.Entities.CuentasContables;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by ezequ on 11/11/2016.
 */

@Repository("repoCuentas")
public class CuentasContablesRepoImpl extends ObtenerSession implements CuentaContablesRepo {
    @Override
    public void agregaCuenta(CuentasContables cuentasContables) throws SQLException {
        guardarEnBD(cuentasContables);
    }

    @Override
    public void actualizaCuenta(CuentasContables cuentasContables) throws SQLException {
        actulizarObjeto(cuentasContables);
    }

    @Override
    public void borraCuenta(int idCuenta) throws SQLException {
        borrarObjeto(obtenerCuenta(idCuenta));
    }

    @Override
    public CuentasContables obtenerCuenta(int idCuenta) throws SQLException {
        return (CuentasContables) getSession().get(CuentasContables.class, idCuenta);
    }

    @Override
    public List<CuentasContables> liCuentasContables() throws SQLException {
        return getSession().createQuery("from CuentasContables").list();
    }
}
