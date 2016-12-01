package com.dqv.repositories.Cheques;

import com.dqv.Entities.ChequesGenerados;
import com.dqv.Entities.ChequesRechazados;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by ezequ on 11/30/2016.
 */
public interface VistasChequesRepo {

    List<ChequesGenerados> listadeChequesAprobados() throws SQLException;
    List<ChequesRechazados> listadeChequesRechazados() throws SQLException;
}
