package com.shopall.shopallAPI.Service;


import com.shopall.shopallAPI.Entity.Resena;
import com.shopall.shopallAPI.Repository.ResenaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResenaServices implements ResenaService{

    @Autowired
    ResenaRepository resenaRepository;
    @Override
    public List<Resena> ConsultarResena() {
        return resenaRepository.findAll();
    }

    @Override
    public Resena crearResena(Resena resena) {
        return resenaRepository.save(resena);
    }

    @Override
    public Resena actualizarResena(Resena resena) {
        if (resenaRepository.existsById(resena.getID())) {
            return resenaRepository.save(resena);
        }
        return null;
    }

    @Override
    public void eliminarResena(int id) {
        resenaRepository.deleteById(id);
    }


}






