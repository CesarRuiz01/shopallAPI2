package com.shopall.shopallAPI.Service;

import com.shopall.shopallAPI.Entity.Usuario;

import java.util.List;

public interface UsuarioServices {


    public List<Usuario> ConsultarUsuarios();

    public Usuario crearUsuario(Usuario usuario);

    public Usuario actualizarUsuario(Usuario usuario);

    public void  eliminarUsuario(int id);


}
