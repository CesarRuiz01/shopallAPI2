package com.shopall.shopallAPI.Service;

import com.shopall.shopallAPI.Entity.CarritoCompras;



import java.util.List;

public interface CarritoComprasServices {
    public List<CarritoCompras> ConsultaCarrito();

    public CarritoCompras crearCarrito(CarritoCompras carritoCompras);

    public CarritoCompras actualizarCarrito(CarritoCompras carritoCompras);

    public void  eliminarCarrito(int id);


}
