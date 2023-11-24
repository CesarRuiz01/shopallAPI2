package com.shopall.shopallAPI.Controller;

import com.shopall.shopallAPI.Entity.Resena;

import com.shopall.shopallAPI.Service.ResenaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/V0")
public class ResenaController {
    @Autowired
    ResenaServices resenaServices;

    @GetMapping("/consultarResena")
    public List<Resena> ConsultarResena() {
        return resenaServices.ConsultarResena();
    }


    @PostMapping("/crearResena")
    public Resena crearResena(@RequestBody Resena resena) {
        return resenaServices.crearResena(resena);
    }

    @PutMapping("/actualizarResena")
    public Resena actualizarResena(@RequestBody Resena resena) {
        return resenaServices.actualizarResena(resena);
    }

    @DeleteMapping("/eliminarResena/{id}")
    public void eliminarResena(@PathVariable int id) {
        resenaServices.eliminarResena(id);
    }
}

