package com.shopall.shopallAPI.Service;

import com.shopall.shopallAPI.Entity.TipoUsuario;
import com.shopall.shopallAPI.Entity.Usuario;
import com.shopall.shopallAPI.Entity.Vendedor;
import com.shopall.shopallAPI.Repository.UsuarioRepository;
import com.shopall.shopallAPI.Repository.VendedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VendedorService implements VendedorServices{

    @Autowired
    VendedorRepository vendedorRepository;
    @Autowired
    UsuarioRepository usuarioRepository;
    @Override
    public List<Vendedor> ConsultaVendedores() {
        return (List<Vendedor>) this.vendedorRepository.findAll();
    }

    @Override
    public Vendedor crearVendedor(Vendedor vendedor) {
        // Recupera el usuario asociado al vendedor por su ID
        Usuario usuario = usuarioRepository.findById(vendedor.getIDUsuario()).orElse(null);

        if (usuario != null && usuario.getTipoUsuario() == TipoUsuario.Vendedor) {
            return vendedorRepository.save(vendedor);
        } else {
            throw new RuntimeException("El usuario no es un vendedor");
        }
    }


    @Override
    public Vendedor actualizarVendedor(Vendedor vendedor){
            if (vendedorRepository.existsById(vendedor.getID())) {
                return vendedorRepository.save(vendedor);
            }
            return null;
        }


    @Override
    public void eliminarVendedor(int id) {
        this.vendedorRepository.deleteById(id);

    }
}
