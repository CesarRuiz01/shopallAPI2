package com.shopall.shopallAPI.Repository;

import com.shopall.shopallAPI.Entity.Notificacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificacionRepository extends JpaRepository <Notificacion,Integer> {
}
