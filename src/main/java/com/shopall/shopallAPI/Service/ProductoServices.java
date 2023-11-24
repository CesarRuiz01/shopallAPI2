package com.shopall.shopallAPI.Service;

import com.shopall.shopallAPI.Entity.Categoria;
import com.shopall.shopallAPI.Entity.Producto;

import java.util.List;

public interface ProductoServices {

    public List<Producto> ConsultarProducto();

    public Producto crearProducto(Producto producto);

    public Producto actualizarProducto(Producto producto);

    public void  eliminarProducto(int ID);

}
