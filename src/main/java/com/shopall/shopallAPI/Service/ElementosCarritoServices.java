package com.shopall.shopallAPI.Service;

import com.shopall.shopallAPI.Entity.ElementosCarrito;

import java.util.List;

public interface ElementosCarritoServices {

    public List<ElementosCarrito> ConsultaElementos();

    public ElementosCarrito crearElementos(ElementosCarrito elementosCarrito);

    public ElementosCarrito actualizarElemento(ElementosCarrito elementosCarrito);

    public void  eliminarElementos(int id);


}
