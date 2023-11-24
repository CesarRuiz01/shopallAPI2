package com.shopall.shopallAPI.Repository;

import com.shopall.shopallAPI.Entity.Resena;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResenaRepository extends JpaRepository <Resena,Integer> {
}
