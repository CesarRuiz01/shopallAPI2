package com.shopall.shopallAPI.Controller;

import com.shopall.shopallAPI.Entity.CarritoCompras;
import com.shopall.shopallAPI.Entity.DetallesTransaccion;
import com.shopall.shopallAPI.Service.DetallesTransaccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/V0")
public class DetallesTransaccionController {

    @Autowired
    DetallesTransaccionService detallesTransaccionService;


    @GetMapping("/consultardetalles")
    public List<DetallesTransaccion> Consultardetalles() {
        return detallesTransaccionService.Consultadetalle();
    }

    @PostMapping("/creardetalles")
    public DetallesTransaccion crearDetalles(@RequestBody DetallesTransaccion detallesTransaccion) {
        return detallesTransaccionService.creardetalles(detallesTransaccion);
    }

    @PutMapping("/actualizardetalles")
    public DetallesTransaccion actualizardetalles(@RequestBody DetallesTransaccion detallesTransaccion){
        return detallesTransaccionService.actualizardetalles(detallesTransaccion);
    }

    @DeleteMapping("/eliminardetalles/{id}")
    public void eliminardeatlles(@PathVariable int id) {
        detallesTransaccionService.eliminardetalles(id);
    }

}

