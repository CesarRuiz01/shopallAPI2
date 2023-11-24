package com.shopall.shopallAPI.Service;



import com.shopall.shopallAPI.Entity.Notificacion;


import java.util.List;

public interface NotificacionService {
    public List<Notificacion> ConsultarNotificacion();

    public Notificacion crearNotificacion(Notificacion notificacion);

    public Notificacion actualizarNotificacion(Notificacion notificacion);

    public void  eliminarNotificacion(int id);
}
