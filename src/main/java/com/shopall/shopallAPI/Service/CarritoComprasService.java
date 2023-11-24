package com.shopall.shopallAPI.Service;

import com.shopall.shopallAPI.Entity.CarritoCompras;
import com.shopall.shopallAPI.Entity.Usuario;
import com.shopall.shopallAPI.Repository.CarritoComprasRepository;
import com.shopall.shopallAPI.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarritoComprasService implements CarritoComprasServices{
    @Autowired
    private CarritoComprasRepository carritoComprasRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public List<CarritoCompras> ConsultaCarrito() {
        return (List<CarritoCompras>) this.carritoComprasRepository.findAll();
    }


    public CarritoCompras crearCarrito(CarritoCompras carritoCompras) {
        // Para cargar el usuario relacionado
        Usuario usuario = usuarioRepository.findById(carritoCompras.getIDUsuario()).orElse(null);

        if (usuario != null) {
            carritoCompras.setIDUsuario(usuario.getID()); // Establece el ID del usuario relacionado en el carrito
            return carritoComprasRepository.save(carritoCompras);
        } else {
            // Manejar el caso en el que no se encuentra el usuario
            // Puedes lanzar una excepción o manejarlo de otra manera
            return null;
        }

    }

    @Override
    public CarritoCompras actualizarCarrito(CarritoCompras carritoCompras){
        if (carritoComprasRepository.existsById(carritoCompras.getID())) {
            return carritoComprasRepository.save(carritoCompras);
        }
        return null;
    }


    @Override
    public void eliminarCarrito(int id) {
        this.carritoComprasRepository.deleteById(id);

    }

}

