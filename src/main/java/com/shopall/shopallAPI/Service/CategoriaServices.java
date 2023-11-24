package com.shopall.shopallAPI.Service;

import com.shopall.shopallAPI.Entity.Categoria;
import com.shopall.shopallAPI.Entity.Usuario;


import java.util.List;

public interface CategoriaServices {

    public List<Categoria> ConsultarCategoria();

    public Categoria crearCategoria(Categoria categoria);

    public Categoria actualizarCategoria(Categoria categoria);

    public void  eliminarCategoria(int id);


}
