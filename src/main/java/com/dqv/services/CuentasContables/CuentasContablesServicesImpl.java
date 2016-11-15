package com.dqv.services.CuentasContables;

import com.dqv.Entities.CuentasContables;
import com.dqv.repositories.CuentasContables.CuentaContablesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by ezequ on 11/11/2016.
 */
@Service
public class CuentasContablesServicesImpl implements CuentasContablesServices {

    @Autowired
    private CuentaContablesRepo cuentaContablesRepo;

    @Override
    public void agregarCuenta(CuentasContables cuentasContables) throws SQLException {
        cuentaContablesRepo.agregaCuenta(cuentasContables);
    }

    @Override
    public void actualizaCuenta(CuentasContables cuentasContables) throws SQLException {
        cuentaContablesRepo.agregaCuenta(cuentasContables);
    }

    @Override
    public void borrarCuenta(int idCuenta) throws SQLException {
        cuentaContablesRepo.borraCuenta(idCuenta);
    }

    @Override
    public List<CuentasContables> liCuentasContables() throws SQLException {
        return cuentaContablesRepo.liCuentasContables();
    }
}
