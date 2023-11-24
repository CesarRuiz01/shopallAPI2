package com.shopall.shopallAPI.Controller;


import com.shopall.shopallAPI.Entity.Vendedor;
import com.shopall.shopallAPI.Service.VendedorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vendedores")
public class VendedorController {

    @Autowired
    private VendedorService vendedorService;


    @PostMapping
    @RequestMapping (value= "crearVendedor",method = RequestMethod.POST)
    public Vendedor crearVendedor(@RequestBody Vendedor vendedor) {
        Vendedor Vendedorcreado = this.vendedorService.crearVendedor(vendedor);
        return vendedorService.crearVendedor(vendedor);
    }
    @GetMapping
    @RequestMapping (value= "ConsultarVendedor",method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarVendedor(){
        List<Vendedor> ListaVendedores=this.vendedorService.ConsultaVendedores();
        return ResponseEntity.ok(ListaVendedores);

    }
    @PutMapping
    @RequestMapping (value= "ModificarVendedores",method = RequestMethod.PUT)
    public ResponseEntity<?> ModificarVendedores(@RequestBody Vendedor vendedor){
       Vendedor vendedormodificado =this.vendedorService.actualizarVendedor(vendedor);
        return ResponseEntity.status(HttpStatus.CREATED).body(vendedormodificado);

    }



    @DeleteMapping
    @RequestMapping (value= "Eliminarvendedor/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<?> Eliminarvendedor(@PathVariable int id){
        this.vendedorService.eliminarVendedor(id);
        return ResponseEntity.ok().build();

    }

}
