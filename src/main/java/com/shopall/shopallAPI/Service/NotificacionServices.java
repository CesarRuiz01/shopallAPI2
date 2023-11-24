package com.shopall.shopallAPI.Service;

import com.shopall.shopallAPI.Entity.Notificacion;

import com.shopall.shopallAPI.Repository.NotificacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificacionServices implements NotificacionService{
    @Autowired
    NotificacionRepository notificacionRepository;
    @Override
    public List<Notificacion> ConsultarNotificacion() {
        return notificacionRepository.findAll();
    }

    @Override
    public Notificacion crearNotificacion(Notificacion notificacion) {
        return notificacionRepository.save(notificacion);
    }

    @Override
    public Notificacion actualizarNotificacion(Notificacion notificacion) {
        if (notificacionRepository.existsById(notificacion.getID())) {
            return notificacionRepository.save(notificacion);
        }
        return null;
    }

    @Override
    public void eliminarNotificacion(int id) {
        notificacionRepository.deleteById(id);
    }
}


