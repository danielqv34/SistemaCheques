package com.dqv.repositories.Bancos;

import com.dqv.dto.ObtenerSession;
import com.dqv.Entities.Banco;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by ezequ on 11/22/2016.
 */
@Repository
public class BancoRepoImpl extends ObtenerSession implements BancoRepo {
    @Override
    public void guardarBanco(Banco banco) throws SQLException {

    }

    @Override
    public void actualizarBano(Banco banco) throws SQLException {

    }

    @Override
    public void eliminarBanco(int idBanco) throws SQLException {

    }

    @Override
    public Banco obtenerBancoPorId(int idBanco) throws SQLException {
        return null;
    }

    @Override
    public List<Banco> listaDeBancos() throws SQLException {
        return null;
    }
}
