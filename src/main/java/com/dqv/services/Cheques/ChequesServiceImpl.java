package com.dqv.services.Cheques;

import com.dqv.Entities.ChequesGenerados;
import com.dqv.Entities.ChequesRechazados;
import com.dqv.repositories.Cheques.VistasChequesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by ezequ on 11/30/2016.
 */
@Service
public class ChequesServiceImpl implements ChequesService {

    @Autowired
    private VistasChequesRepo chequesRepo;

    @Override
    public List<ChequesGenerados> listarChequesGenerados() throws SQLException {
       return chequesRepo.listadeChequesAprobados();
    }

    @Override
    public List<ChequesRechazados> listarChequesRechazados() throws SQLException {
        return chequesRepo.listadeChequesRechazados();
    }
}
