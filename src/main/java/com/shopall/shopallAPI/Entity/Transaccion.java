package com.shopall.shopallAPI.Entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Transacciones")
public class Transaccion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private int ID;


    @Column(name="IDUsuario")
    private int IDUsuario;

    @Column(name = "FechaHoraTransaccion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHoraTransaccion;

    @Column(name = "EstadoTransaccion")
    private String estadoTransaccion;


    @ManyToOne
    @JoinColumn(name = "IDUsuario",referencedColumnName="ID",insertable = false, updatable = false)
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

    public Date getFechaHoraTransaccion() {
        return fechaHoraTransaccion;
    }

    public void setFechaHoraTransaccion(Date fechaHoraTransaccion) {
        this.fechaHoraTransaccion = fechaHoraTransaccion;
    }

    public String getEstadoTransaccion() {
        return estadoTransaccion;
    }

    public void setEstadoTransaccion(String estadoTransaccion) {
        this.estadoTransaccion = estadoTransaccion;
    }
}
