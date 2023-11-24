package com.shopall.shopallAPI.Entity;

import jakarta.persistence.*;



@Entity
@Table(name = "Vendedores")
public class Vendedor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ID;

    @Column(name = "IDUsuario") // Nombre de la columna que hace referencia a IDUsuario
    private int IDUsuario;

    @Column(name = "NombreTienda")
    private String NombreTienda;

    @Column(columnDefinition = "TEXT")
    private String DescripcionTienda;

    @ManyToOne
    @JoinColumn(name = "IDUsuario", referencedColumnName = "ID", insertable = false, updatable = false)
    private Usuario usuario;

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

    public String getNombreTienda() {
        return NombreTienda;
    }

    public void setNombreTienda(String NombreTienda) {
        this.NombreTienda = NombreTienda;
    }

    public String getDescripcionTienda() {
        return DescripcionTienda;
    }

    public void setDescripcionTienda(String DescripcionTienda) {
        this.DescripcionTienda = DescripcionTienda;
    }

}


