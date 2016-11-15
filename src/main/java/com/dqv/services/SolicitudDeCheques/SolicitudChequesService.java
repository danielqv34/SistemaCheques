package com.dqv.services.SolicitudDeCheques;

import com.dqv.Entities.SolicitudDeCheque;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by ezequ on 11/11/2016.
 */
public interface SolicitudChequesService{

        void agregaSolicitud(SolicitudDeCheque solicitudDeCheque) throws SQLException;

        void actualizaSolicitud(SolicitudDeCheque solicitudDeCheque) throws SQLException;

        void borraSolicitud (int idSolicitud) throws SQLException;

        List<SolicitudDeCheque> lisChequeList () throws SQLException;


}
