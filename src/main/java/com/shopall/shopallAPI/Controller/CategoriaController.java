package com.shopall.shopallAPI.Controller;

import com.shopall.shopallAPI.Entity.Categoria;
import com.shopall.shopallAPI.Service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/V0")
public class CategoriaController {

    @Autowired
    CategoriaService categoriaService;

    @GetMapping
    @RequestMapping (value= "ConsultarCategoria",method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarCategoria(){
        List<Categoria> ListaCategoria=this.categoriaService.ConsultarCategoria();
        return ResponseEntity.ok(ListaCategoria);

    }

    @PostMapping
    @RequestMapping (value= "crearCategoria",method = RequestMethod.POST)
    public Categoria crearcategoria(@RequestBody Categoria categoria) {
        Categoria categoriacreada = this.categoriaService.crearCategoria(categoria);
        return categoriaService.crearCategoria(categoria);
    }

    @PutMapping
    @RequestMapping (value= "ModificarCategoria",method = RequestMethod.PUT)
    public ResponseEntity<?> ModificarCategoria(@RequestBody Categoria categoria){
        Categoria categoriamodificada =this.categoriaService.actualizarCategoria(categoria);
        return ResponseEntity.status(HttpStatus.CREATED).body(categoriamodificada);

    }
    @DeleteMapping
    @RequestMapping (value= "EliminarCategoria/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<?> EliminarCategoriao(@PathVariable int id){
        this.categoriaService.eliminarCategoria(id);
        return ResponseEntity.ok().build();

    }
}



