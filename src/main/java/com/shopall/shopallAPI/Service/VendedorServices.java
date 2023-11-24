package com.shopall.shopallAPI.Service;

import com.shopall.shopallAPI.Entity.Vendedor;

import java.util.List;

public interface VendedorServices {

    public List<Vendedor> ConsultaVendedores();

    public Vendedor crearVendedor(Vendedor vendedor);

    public Vendedor actualizarVendedor(Vendedor Vendedor);

    public void  eliminarVendedor(int id);


}

