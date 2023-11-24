package com.shopall.shopallAPI.Controller;

import com.shopall.shopallAPI.Entity.Transaccion;
import com.shopall.shopallAPI.Service.TransaccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/V0")
public class TransaccionController {

    @Autowired
    TransaccionService transaccionService;

    @GetMapping("/consultartransaccion")
    public List<Transaccion> consultarTransaccion() {
        return transaccionService.ConsultaTransaccion();
    }


    @PostMapping("/creartransaccion")
    public Transaccion crearTransaccion(@RequestBody Transaccion transaccion) {
        return transaccionService.crearTransaccion(transaccion);
    }

    @PutMapping("/actualizartransaccion")
    public Transaccion actualizarTransaccion(@RequestBody Transaccion transaccion) {
        return transaccionService.actualizarTransaccion(transaccion);
    }

    @DeleteMapping("/eliminartransaccion/{id}")
    public void eliminartransacciono(@PathVariable int id) {
        transaccionService.eliminarTransaccion(id);
    }
}
