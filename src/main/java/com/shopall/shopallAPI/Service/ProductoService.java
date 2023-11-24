package com.shopall.shopallAPI.Service;

import com.shopall.shopallAPI.Entity.Categoria;
import com.shopall.shopallAPI.Entity.Producto;
import com.shopall.shopallAPI.Entity.Vendedor;
import com.shopall.shopallAPI.Repository.CategoriaRepository;
import com.shopall.shopallAPI.Repository.ProductosRpository;
import com.shopall.shopallAPI.Repository.VendedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService implements ProductoServices {

    @Autowired
    ProductosRpository productosRepository;
    @Autowired
    VendedorRepository vendedorRepository;
    @Autowired
    CategoriaRepository categoriaRepository;
    @Override
    public List<Producto> ConsultarProducto() {
        return (List<Producto>) this.productosRepository.findAll();
    }

    @Override
    public Producto crearProducto(Producto producto) {

            // Verificar si el IDVendedor es válido
            Vendedor vendedor = vendedorRepository.findById(producto.getIDVendedor()).orElse(null);

            // Verificar si el IDCategoria es válido
            Categoria categoria = categoriaRepository.findById(producto.getIDCategoria()).orElse(null);

            if (vendedor != null && categoria != null) {
                // Asignar el vendedor y la categoría al producto
                producto.setVendedor(vendedor);
                producto.setCategoria(categoria);

                // Aquí puedes realizar validaciones adicionales y lógica de negocio si es necesario

                return productosRepository.save(producto);
            } else {
                throw new RuntimeException("El ID de vendedor o categoría no es válido");
            }
        }

    @Override
    public Producto actualizarProducto(Producto producto) {
        if (productosRepository.existsById(producto.getID())) {
            return productosRepository.save(producto);
        }
        return null;
    }

    @Override
    public void eliminarProducto(int ID) {
        this.productosRepository.deleteById(ID);
    }
}
