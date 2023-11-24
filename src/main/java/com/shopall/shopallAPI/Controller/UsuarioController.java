package com.shopall.shopallAPI.Controller;

import com.shopall.shopallAPI.Entity.Usuario;
import com.shopall.shopallAPI.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/V0")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    @RequestMapping (value= "crearUsuario",method = RequestMethod.POST)
    public Usuario crearUsuario(@RequestBody Usuario usuario) {
        Usuario usuariocreado = this.usuarioService.crearUsuario(usuario);
        return usuarioService.crearUsuario(usuario);
    }
    @GetMapping
    @RequestMapping (value= "ConsultarUsuarios",method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarUsuarios(){
        List<Usuario> ListaUsuarios=this.usuarioService.ConsultarUsuarios();
        return ResponseEntity.ok(ListaUsuarios);

    }
    @PutMapping
    @RequestMapping (value= "ModificarUsuarios",method = RequestMethod.PUT)
    public ResponseEntity<?> ModificarUsuarios(@RequestBody Usuario usuario){
        Usuario usuariomodificado =this.usuarioService.actualizarUsuario(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(usuariomodificado);

    }



    @DeleteMapping
    @RequestMapping (value= "Eliminarusuario/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<?> Eliminarusuario(@PathVariable int id){
        this.usuarioService.eliminarUsuario(id);
        return ResponseEntity.ok().build();

    }
}
