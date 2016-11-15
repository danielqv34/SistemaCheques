package com.dqv.repositories.Proveedores;

import com.dqv.Entities.Proveedores;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by ezequ on 11/11/2016.
 */
public interface ProveedoresRepo {

    void agregaProveedor(Proveedores proveedores) throws SQLException;

    void actualizaProveedor(Proveedores proveedores) throws SQLException;

    void borrarProveedor(int idProveedor) throws SQLException;

    Proveedores obetnerProveedor(int idProveedor) throws SQLException;

    List<Proveedores> liProveedores() throws SQLException;
}
