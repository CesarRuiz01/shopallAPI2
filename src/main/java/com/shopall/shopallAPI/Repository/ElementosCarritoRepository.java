package com.shopall.shopallAPI.Repository;


import com.shopall.shopallAPI.Entity.ElementosCarrito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElementosCarritoRepository extends JpaRepository <ElementosCarrito,Integer> {
}
