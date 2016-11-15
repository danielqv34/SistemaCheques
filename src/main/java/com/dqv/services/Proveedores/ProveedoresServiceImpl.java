package com.dqv.services.Proveedores;

import com.dqv.Entities.Proveedores;
import com.dqv.repositories.Proveedores.ProveedoresRepo;
import org.hibernate.Criteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by ezequ on 11/11/2016.
 */
@Service("proveedoresService")
public class ProveedoresServiceImpl implements ProveedoresService{

    @Autowired
    private ProveedoresRepo proveedoresRepo;

    @Override
    public void agregaProveedor(Proveedores proveedores) throws SQLException {
        proveedoresRepo.agregaProveedor(proveedores);
    }

    @Override
    public void actualizaProveedor(Proveedores proveedores) throws SQLException {
            proveedoresRepo.actualizaProveedor(proveedores);
    }

    @Override
    public void borraProveedor(int idProveedor) throws SQLException {
         proveedoresRepo.borrarProveedor(idProveedor);
    }

    @Override
    public List<Proveedores> liProveedores() throws SQLException {
        return proveedoresRepo.liProveedores();
    }

}
