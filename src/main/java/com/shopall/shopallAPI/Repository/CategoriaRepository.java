package com.shopall.shopallAPI.Repository;

import com.shopall.shopallAPI.Entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository <Categoria,Integer> {
}
