package com.shopall.shopallAPI.Entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "Productos")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private int ID;

    @Column(name = "NombreProducto")
    private String NombreProducto;

    @Column(columnDefinition = "TEXT")
    private String Descripcion;

    @Column(precision = 10, scale = 2, nullable = false)
    private BigDecimal Precio;

    @Column(name = "IDCategoria")
    private int IDCategoria;

    @Column(name = "IDVendedor")
    private int IDVendedor;

    @ManyToOne
    @JoinColumn(name = "IDCategoria", referencedColumnName = "ID", insertable = false, updatable = false)
    private Categoria categoria;

    @ManyToOne
    @JoinColumn(name = "IDVendedor", referencedColumnName = "ID", insertable = false, updatable = false)
    private Vendedor vendedor;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombreProducto() {
        return NombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        NombreProducto = nombreProducto;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public BigDecimal getPrecio() {
        return Precio;
    }

    public void setPrecio(BigDecimal precio) {
        Precio = precio;
    }

    public int getIDCategoria() {
        return IDCategoria;
    }

    public void setIDCategoria(int IDCategoria) {
        this.IDCategoria = IDCategoria;
    }

    public int getIDVendedor() {
        return IDVendedor;
    }

    public void setIDVendedor(int IDVendedor) {
        this.IDVendedor = IDVendedor;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
}
