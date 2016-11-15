package com.dqv.services.SolicitudDeCheques;

import com.dqv.Entities.SolicitudDeCheque;
import com.dqv.repositories.SolicitudDeCheque.SolicitudChequeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by ezequ on 11/11/2016.
 */
@Service("servicioSolicitudes")
public class SolicitudDeChequesServiceImpl implements SolicitudChequesService {

    @Autowired
    private SolicitudChequeRepo solicitudChequeRepo;


    @Override
    public void agregaSolicitud(SolicitudDeCheque solicitudDeCheque) throws SQLException {
       solicitudChequeRepo.agregaSolicitud(solicitudDeCheque);
    }

    @Override
    public void actualizaSolicitud(SolicitudDeCheque solicitudDeCheque) throws SQLException {
        solicitudChequeRepo.actualizaSolicitud(solicitudDeCheque);
    }

    @Override
    public void borraSolicitud(int idSolicitud) throws SQLException {
        solicitudChequeRepo.borraSolicitud(idSolicitud);
    }

    @Override
    public List<SolicitudDeCheque> lisChequeList() throws SQLException {
        return solicitudChequeRepo.lisSolicitudDeCheques();
    }




}
