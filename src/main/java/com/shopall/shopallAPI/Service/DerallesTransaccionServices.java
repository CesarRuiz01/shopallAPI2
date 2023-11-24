package com.shopall.shopallAPI.Service;

import com.shopall.shopallAPI.Entity.DetallesTransaccion;
import com.shopall.shopallAPI.Entity.ElementosCarrito;

import java.util.List;

public interface DerallesTransaccionServices {

    public List<DetallesTransaccion> Consultadetalle();

    public DetallesTransaccion creardetalles(DetallesTransaccion detallesTransaccion);

    public DetallesTransaccion actualizardetalles(DetallesTransaccion detallesTransaccion);

    public void  eliminardetalles(int id);


}
