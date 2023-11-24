package com.shopall.shopallAPI.Service;

import com.shopall.shopallAPI.Entity.Transaccion;

import java.util.List;

public interface TransaccionServices {

    public List<Transaccion> ConsultaTransaccion();

    public Transaccion crearTransaccion(Transaccion transaccion);

    public Transaccion actualizarTransaccion(Transaccion transaccion);

    public void  eliminarTransaccion(int id);


}
