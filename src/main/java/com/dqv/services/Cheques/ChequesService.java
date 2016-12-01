package com.dqv.services.Cheques;

import com.dqv.Entities.ChequesGenerados;
import com.dqv.Entities.ChequesRechazados;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by ezequ on 11/30/2016.
 */
public interface ChequesService {

    List<ChequesGenerados> listarChequesGenerados() throws SQLException;
    List<ChequesRechazados> listarChequesRechazados() throws SQLException;
}
