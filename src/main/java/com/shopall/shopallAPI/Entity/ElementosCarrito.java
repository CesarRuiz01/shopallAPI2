package com.shopall.shopallAPI.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "ElementosCarrito")
public class ElementosCarrito {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private int ID;

    @Column(name="IDCarrito")
    private int IDCarrito;
    @ManyToOne
    @JoinColumn(name = "IDCarrito",referencedColumnName="ID",insertable = false, updatable = false)
    private CarritoCompras carritoCompras;

    @Column(name="IDProducto")
    private int IDProducto;

    @ManyToOne
    @JoinColumn(name = "IDProducto",referencedColumnName="ID",insertable = false, updatable = false)
    private Producto producto;

    @Column(name = "Cantidad")
    private int Cantidad;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getIDCarrito() {
        return IDCarrito;
    }

    public void setIDCarrito(int IDCarrito) {
        this.IDCarrito = IDCarrito;
    }

    public int getIDProducto() {
        return IDProducto;
    }

    public void setIDProducto(int IDProducto) {
        this.IDProducto = IDProducto;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }
}
