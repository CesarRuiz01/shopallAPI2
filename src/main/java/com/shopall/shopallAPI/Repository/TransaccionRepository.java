package com.shopall.shopallAPI.Repository;

import com.shopall.shopallAPI.Entity.Transaccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransaccionRepository extends JpaRepository <Transaccion,Integer> {
}
