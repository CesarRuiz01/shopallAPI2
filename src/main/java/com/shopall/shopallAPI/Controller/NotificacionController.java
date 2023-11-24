package com.shopall.shopallAPI.Controller;

import com.shopall.shopallAPI.Entity.Notificacion;
import com.shopall.shopallAPI.Service.NotificacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/V0")
public class NotificacionController {

    @Autowired
    private NotificacionService notificacionService;

    @GetMapping("/consultarNotificaciones")
    public List<Notificacion> consultarNotificaciones() {
        return notificacionService.ConsultarNotificacion();
    }

    @PostMapping("/crearNotificaciones")
    public Notificacion crearNotificacion(@RequestBody Notificacion notificacion) {
        return notificacionService.crearNotificacion(notificacion);
    }

    @PutMapping("/actualizarNotificaciones")
    public Notificacion actualizarNotificacion(@RequestBody Notificacion notificacion) {
        return notificacionService.actualizarNotificacion(notificacion);
    }

    @DeleteMapping("/eliminarNotificaciones/{id}")
    public void eliminarNotificacion(@PathVariable int id) {
        notificacionService.eliminarNotificacion(id);
    }
}
