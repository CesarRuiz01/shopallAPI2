package com.shopall.shopallAPI.Service;

import com.shopall.shopallAPI.Entity.ElementosCarrito;
import com.shopall.shopallAPI.Repository.ElementosCarritoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ElementosCarritoService implements ElementosCarritoServices {

    @Autowired
    ElementosCarritoRepository elementosCarritoRepository;
    @Override
    public List<ElementosCarrito> ConsultaElementos() {
        return elementosCarritoRepository.findAll();
    }

    @Override
    public ElementosCarrito crearElementos(ElementosCarrito elementosCarrito) {
        return elementosCarritoRepository.save(elementosCarrito);
    }

    @Override
    public ElementosCarrito actualizarElemento(ElementosCarrito elementosCarrito) {
        if (elementosCarritoRepository.existsById(elementosCarrito.getID())) {
            return elementosCarritoRepository.save(elementosCarrito);
        }
        return null;
    }


    @Override
    public void eliminarElementos(int id) {
        elementosCarritoRepository.deleteById(id);
    }
}
