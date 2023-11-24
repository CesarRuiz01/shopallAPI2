package com.shopall.shopallAPI.Service;

import com.shopall.shopallAPI.Entity.Categoria;

import com.shopall.shopallAPI.Repository.CategoriaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService implements  CategoriaServices{

    @Autowired
    private CategoriaRepository categoriaRepository;


    @Override
    public List<Categoria> ConsultarCategoria() {
        return (List<Categoria>) this.categoriaRepository.findAll();
    }

    @Override
    public Categoria crearCategoria(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    @Override
    public Categoria actualizarCategoria(Categoria categoria) {
        if (categoriaRepository.existsById(categoria.getId())) {
            return categoriaRepository.save(categoria);
        }
        return null;
    }



    @Override
    public void eliminarCategoria(int id) {
        this.categoriaRepository.deleteById(id);
    }
}
