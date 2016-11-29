package com.dqv.services.Bancos;

import com.dqv.Entities.Banco;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by ezequ on 11/26/2016.
 */
public interface BancoService {

    void agregaBanco(Banco banco) throws SQLException;

    void actualizabanco(Banco banco)throws SQLException;

    void borrarBanco(int idBanco) throws SQLException;

    List<Banco> listaBancos() throws SQLException;


}
