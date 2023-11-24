package com.shopall.shopallAPI.Entity;

import jakarta.persistence.*;

import javax.naming.Name;

@Entity
@Table(name = "CarritoCompras")
public class CarritoCompras {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private int ID;

    @Column(name="IDUsuario")
    private int IDUsuario;
    @ManyToOne
    @JoinColumn(name = "IDUsuario", referencedColumnName = "ID", insertable = false, updatable = false)
    private Usuario usuario;

    @Column(name = "EstadoCarrito", nullable = false)
    private String EstadoCarrito;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getIDUsuario() {
        return IDUsuario;
    }

    public void setIDUsuario(int IDUsuario) {
        this.IDUsuario = IDUsuario;
    }



    public String getEstadoCarrito() {
        return EstadoCarrito;
    }

    public void setEstadoCarrito(String estadoCarrito) {
        EstadoCarrito = estadoCarrito;
    }
}