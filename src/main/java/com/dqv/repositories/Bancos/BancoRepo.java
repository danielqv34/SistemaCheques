package com.dqv.repositories.Bancos;


import com.dqv.Entities.Banco;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by ezequ on 11/22/2016.
 */
public interface BancoRepo {

    void guardarBanco(Banco banco) throws SQLException;

    void actualizarBano(Banco banco) throws SQLException;

    void eliminarBanco(int idBanco) throws SQLException;

    Banco obtenerBancoPorId(int idBanco) throws SQLException;

    List<Banco> listaDeBancos() throws SQLException;
}
