package com.shopall.shopallAPI.Repository;

import com.shopall.shopallAPI.Entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductosRpository extends JpaRepository <Producto,Integer> {
}
