package com.shopall.shopallAPI.Repository;

import com.shopall.shopallAPI.Entity.DetallesTransaccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetallesTransaccionRepository extends JpaRepository <DetallesTransaccion,Integer> {
}
