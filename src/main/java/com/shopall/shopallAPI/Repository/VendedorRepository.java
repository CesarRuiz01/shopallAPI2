package com.shopall.shopallAPI.Repository;

import com.shopall.shopallAPI.Entity.Vendedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendedorRepository extends JpaRepository <Vendedor, Integer> {
}
