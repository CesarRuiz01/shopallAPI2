package com.shopall.shopallAPI.Repository;

import com.shopall.shopallAPI.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    boolean existsByCorreoElectronico(String correoElectronico);

}
