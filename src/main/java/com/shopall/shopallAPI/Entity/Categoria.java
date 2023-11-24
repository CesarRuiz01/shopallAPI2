package com.shopall.shopallAPI.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="Categoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="Id")
    private int id;

    @Column(name="NombreCategoria")
    private String NombreCategoria;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreCategoria() {
        return NombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        NombreCategoria = nombreCategoria;
    }
}
