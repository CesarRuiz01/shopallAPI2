package com.shopall.shopallAPI.Controller;


import com.shopall.shopallAPI.Entity.CarritoCompras;
import com.shopall.shopallAPI.Service.CarritoComprasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/V0")
public class CarritoComprasControler {


    @Autowired
    CarritoComprasService carritoComprasService;


    @GetMapping("/consultarcarritoo")
    public List<CarritoCompras> ConsultarCarrito() {
        return carritoComprasService.ConsultaCarrito();
    }

    @PostMapping("/crearcarritoo")
    public CarritoCompras crearCarrito(@RequestBody CarritoCompras carritoCompras) {
        return carritoComprasService.crearCarrito(carritoCompras);
    }

    @PutMapping("/actualizarcarrito")
    public CarritoCompras actualizarCarrito(@RequestBody CarritoCompras carritoCompras) {
        return carritoComprasService.actualizarCarrito(carritoCompras);
    }

    @DeleteMapping("/eliminarcarrito/{id}")
    public void eliminarCarrito(@PathVariable int id) {
        carritoComprasService.eliminarCarrito(id);
    }
}


