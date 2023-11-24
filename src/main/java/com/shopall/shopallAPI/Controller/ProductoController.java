package com.shopall.shopallAPI.Controller;

import com.shopall.shopallAPI.Entity.Producto;

import com.shopall.shopallAPI.Service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/V0")
public class ProductoController {

    @Autowired
    ProductoService productoService;

    @PostMapping
    @RequestMapping (value= "crearProducto",method = RequestMethod.POST)
    public Producto crearProducto(@RequestBody Producto producto) {
       Producto productorcreado = this.productoService.crearProducto(producto);
        return productoService.crearProducto(producto);
    }
    @GetMapping
    @RequestMapping (value= "ConsultarProducto",method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarProducto(){
        List<Producto> Listaproductos=this.productoService.ConsultarProducto();
        return ResponseEntity.ok(Listaproductos);

    }
    @PutMapping
    @RequestMapping (value= "ModificarProductos",method = RequestMethod.PUT)
    public ResponseEntity<?> ModificarProductos(@RequestBody Producto producto){
       Producto productomodificado =this.productoService.actualizarProducto(producto);
        return ResponseEntity.status(HttpStatus.CREATED).body(productomodificado);

    }



    @DeleteMapping
    @RequestMapping (value= "EliminarProducto/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<?> EliminarProducto(@PathVariable int ID){
        this.productoService.eliminarProducto(ID);
        return ResponseEntity.ok().build();

    }


}
