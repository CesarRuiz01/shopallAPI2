package com.shopall.shopallAPI.Service;

import com.shopall.shopallAPI.Entity.Usuario;
import com.shopall.shopallAPI.Exception.CorreoElectronicoDuplicadoException;
import com.shopall.shopallAPI.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService implements UsuarioServices {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario crearUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public List<Usuario> ConsultarUsuarios() {
        return (List<Usuario>) this.usuarioRepository.findAll();
    }

    public Usuario actualizarUsuario(Usuario usuario) {
        if (usuarioRepository.existsById(usuario.getID())) {
            return usuarioRepository.save(usuario);
        }
        return null;
    }

    @Override
    public void eliminarUsuario(int ID) {
        this.usuarioRepository.deleteById(ID);
    }
}

