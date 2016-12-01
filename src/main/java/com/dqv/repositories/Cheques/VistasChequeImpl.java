package com.dqv.repositories.Cheques;

import com.dqv.Entities.ChequesGenerados;
import com.dqv.Entities.ChequesRechazados;
import com.dqv.dto.ObtenerSession;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by ezequ on 11/30/2016.
 */
@Repository
public class VistasChequeImpl extends ObtenerSession implements VistasChequesRepo {
    @Override
    public List<ChequesGenerados> listadeChequesAprobados() throws SQLException {
        return getSession().createQuery("from ChequesGenerados order by fechaGeneracion desc").list();
    }

    @Override
    public List<ChequesRechazados> listadeChequesRechazados() throws SQLException {
        return getSession().createQuery("from ChequesRechazados order by fechaRechazo desc ").list();
    }
}
