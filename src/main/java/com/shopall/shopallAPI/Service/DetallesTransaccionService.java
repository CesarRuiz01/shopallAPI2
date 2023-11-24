package com.shopall.shopallAPI.Service;

import com.shopall.shopallAPI.Entity.DetallesTransaccion;
import com.shopall.shopallAPI.Repository.DetallesTransaccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetallesTransaccionService implements DerallesTransaccionServices {
    @Autowired
    DetallesTransaccionRepository detallesTransaccionRepository;

    @Override
    public List<DetallesTransaccion> Consultadetalle() {
        return detallesTransaccionRepository.findAll();
    }

    @Override
    public DetallesTransaccion creardetalles(DetallesTransaccion detallesTransaccion) {
        return detallesTransaccionRepository.save(detallesTransaccion);
    }

    @Override
    public DetallesTransaccion actualizardetalles(DetallesTransaccion detallesTransaccion) {
        if (detallesTransaccionRepository.existsById(detallesTransaccion.getID())) {
            return detallesTransaccionRepository.save(detallesTransaccion);
        }
        return null;
    }

    @Override
    public void eliminardetalles(int id) {
        detallesTransaccionRepository.deleteById(id);
    }

}


