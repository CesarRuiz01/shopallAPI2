package com.shopall.shopallAPI.Entity;

import com.shopall.shopallAPI.Entity.Producto;
import com.shopall.shopallAPI.Entity.Usuario;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Resenas")
public class Resena {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private int ID;

    @Column(name = "IDUsuario")
    private int IDUsuario;

    @ManyToOne
    @JoinColumn(name = "IDUsuario", referencedColumnName = "ID", insertable = false, updatable = false)
    private Usuario usuario;

    @Column(name = "IDProducto")
    private int IDProducto;

    @ManyToOne
    @JoinColumn(name = "IDProducto", referencedColumnName = "ID", insertable = false, updatable = false)
    private Producto producto;

    @Column(name = "Puntuacion", nullable = false)
    private int puntuacion;

    @Column(name = "Comentario", columnDefinition = "TEXT")
    private String comentario;

    @Column(name = "FechaResena", nullable = false)
    private Date fechaResena;


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

    public int getIDProducto() {
        return IDProducto;
    }

    public void setIDProducto(int IDProducto) {
        this.IDProducto = IDProducto;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Date getFechaResena() {
        return fechaResena;
    }

    public void setFechaResena(Date fechaResena) {
        this.fechaResena = fechaResena;
    }
}
