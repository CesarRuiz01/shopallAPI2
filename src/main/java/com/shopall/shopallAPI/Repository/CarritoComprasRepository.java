package com.shopall.shopallAPI.Repository;

import com.shopall.shopallAPI.Entity.CarritoCompras;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarritoComprasRepository extends JpaRepository <CarritoCompras,Integer> {
}
