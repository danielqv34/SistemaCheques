package com.dqv.repositories.SolicitudDeCheque;

import com.dqv.Entities.SolicitudDeCheque;
import com.dqv.dao.ObtenerSession;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by ezequ on 11/11/2016.
 */
@Repository
@Transactional
public class SolicitudesChequesRepoImpl extends ObtenerSession implements SolicitudChequeRepo {
    @Override
    public void agregaSolicitud(SolicitudDeCheque solicitudDeCheque) throws SQLException {
        guardarEnBD(solicitudDeCheque);
    }

    @Override
    public void actualizaSolicitud(SolicitudDeCheque solicitudDeCheque) throws SQLException {
        actulizarObjeto(solicitudDeCheque);
    }

    @Override
    public void borraSolicitud(int idSolicitud) throws SQLException {
        borrarObjeto(obtenerSolicitud(idSolicitud));
    }

    @Override
    public SolicitudDeCheque obtenerSolicitud(int idSolicitud) throws SQLException {
        return (SolicitudDeCheque) getSession().get(SolicitudDeCheque.class, idSolicitud);
    }

    @Override
    public List<SolicitudDeCheque> lisSolicitudDeCheques() throws SQLException {
        return getSession().createQuery("from SolicitudDeCheque ").list();
    }

}
