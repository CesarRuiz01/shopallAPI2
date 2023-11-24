package com.shopall.shopallAPI.Controller;

import com.shopall.shopallAPI.Entity.ElementosCarrito;
import com.shopall.shopallAPI.Service.ElementosCarritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/V0")
public class ElementosCarritoController {

    @Autowired
    ElementosCarritoService elementosCarritoService;


    @GetMapping("/consultarelementosCarrito")
    public List<ElementosCarrito> consultarElementosCarrito() {
        return elementosCarritoService.ConsultaElementos();
    }


    @PostMapping("/crearElementoscarrito")
    public ElementosCarrito crearElementoCarrito(@RequestBody ElementosCarrito elementosCarrito) {
        return elementosCarritoService.crearElementos(elementosCarrito);
    }

    @PutMapping("/actualizarElementoscarrito")
    public ElementosCarrito actualizarElementoCarrito(@RequestBody ElementosCarrito elementosCarrito) {
        return elementosCarritoService.actualizarElemento(elementosCarrito);
    }

    @DeleteMapping("/eliminarElementoscarrito/{id}")
    public void eliminarElementoCarrito(@PathVariable int id) {
        elementosCarritoService.eliminarElementos(id);
    }
}