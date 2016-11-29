package com.dqv.services.Bancos;

import com.dqv.Entities.Banco;
import com.dqv.repositories.Bancos.BancoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by ezequ on 11/26/2016.
 */
@Service
public class BancoServiceImpl implements BancoService {


    @Autowired
    private BancoRepo bancoRepo;

    @Override
    public void agregaBanco(Banco banco) throws SQLException {
        System.out.println("Mando a Insertar Banco");
        bancoRepo.guardarBanco(banco);
    }

    @Override
    public void actualizabanco(Banco banco) throws SQLException {
         bancoRepo.actualizarBano(banco);
    }

    @Override
    public void borrarBanco(int idBanco) throws SQLException {
        bancoRepo.eliminarBanco(idBanco);
    }

    @Override
    public List<Banco> listaBancos() throws SQLException {
        return bancoRepo.listaDeBancos();
    }
}
