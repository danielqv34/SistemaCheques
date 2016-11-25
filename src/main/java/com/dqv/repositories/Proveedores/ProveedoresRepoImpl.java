package com.dqv.repositories.Proveedores;

import com.dqv.dto.ObtenerSession;

import com.dqv.Entities.Proveedores;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by ezequ on 11/11/2016.
 */

@Repository
@Transactional
public class ProveedoresRepoImpl extends ObtenerSession implements ProveedoresRepo {


    @Override
    public void agregaProveedor(Proveedores proveedores) throws SQLException {
        System.out.println("Mando a Insertar");
        guardarEnBD(proveedores);
        System.out.println("Termino de Insertar");
    }

    @Override
    public void actualizaProveedor(Proveedores proveedores) throws SQLException {
        actulizarObjeto(proveedores);
    }

    @Override
    public void borrarProveedor(int idProveedor) throws SQLException {
        borrarObjeto(obetnerProveedor(idProveedor));
    }

    @Override
    public Proveedores obetnerProveedor(int idProveedor) throws SQLException {
        return (Proveedores) getSession().get(Proveedores.class, idProveedor);
    }

    @Override
    public List<Proveedores> liProveedores() throws SQLException {
        return getSession().createQuery("from Proveedores ").list();
    }

}
