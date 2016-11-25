package com.dqv.services.Proveedores;

import com.dqv.Entities.Proveedores;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by ezequ on 11/11/2016.
 */
public interface ProveedoresService {

    void agregaProveedor(Proveedores proveedores) throws SQLException;

    void actualizaProveedor(Proveedores proveedores) throws SQLException;

    void borraProveedor(int idProveedor) throws SQLException;

    List<Proveedores> liProveedores() throws SQLException;

}
