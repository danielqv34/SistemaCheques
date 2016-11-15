package com.dqv.repositories.SolicitudDeCheque;

import com.dqv.Entities.SolicitudDeCheque;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by ezequ on 11/11/2016.
 */
public interface SolicitudChequeRepo {

    void agregaSolicitud(SolicitudDeCheque solicitudDeCheque) throws SQLException;

    void actualizaSolicitud(SolicitudDeCheque solicitudDeCheque) throws SQLException;

    void borraSolicitud(int idSolicitud) throws SQLException;

    SolicitudDeCheque obtenerSolicitud(int idSolicitud) throws SQLException;

    List<SolicitudDeCheque> lisSolicitudDeCheques() throws SQLException;


}
