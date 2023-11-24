package com.shopall.shopallAPI.Service;


import com.shopall.shopallAPI.Entity.Transaccion;
import com.shopall.shopallAPI.Repository.TransaccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransaccionService implements TransaccionServices {

    @Autowired
    TransaccionRepository transaccionRepository;
    @Override
    public List<Transaccion> ConsultaTransaccion() {
        return transaccionRepository.findAll();
    }

    @Override
    public Transaccion crearTransaccion(Transaccion transaccion) {
        return transaccionRepository.save(transaccion);
    }

    @Override
    public Transaccion actualizarTransaccion(Transaccion transaccion) {
        if (transaccionRepository.existsById(transaccion.getID())) {
            return transaccionRepository.save(transaccion);
        }
        return null;
    }

    @Override
    public void eliminarTransaccion(int id) {
       transaccionRepository.deleteById(id);
    }
}
