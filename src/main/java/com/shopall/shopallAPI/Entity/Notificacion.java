package com.shopall.shopallAPI.Entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Notificaciones")
public class Notificacion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private int ID;

    @Column(name = "IDUsuario")
    private int IDUsuario;

    @ManyToOne
    @JoinColumn(name = "IDUsuario", referencedColumnName = "ID", insertable = false, updatable = false)
    private Usuario usuario;

    @Column(name = "TipoNotificacion")
    private String tipoNotificacion;

    @Column(name = "ContenidoNotificacion", columnDefinition = "TEXT")
    private String contenidoNotificacion;

    @Column(name = "FechaHoraNotificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHoraNotificacion;

    @Column(name = "EstadoNotificacion")
    @Enumerated(EnumType.STRING)
    private EstadoNotificacion estadoNotificacion;

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

    public String getTipoNotificacion() {
        return tipoNotificacion;
    }

    public void setTipoNotificacion(String tipoNotificacion) {
        this.tipoNotificacion = tipoNotificacion;
    }

    public String getContenidoNotificacion() {
        return contenidoNotificacion;
    }

    public void setContenidoNotificacion(String contenidoNotificacion) {
        this.contenidoNotificacion = contenidoNotificacion;
    }

    public Date getFechaHoraNotificacion() {
        return fechaHoraNotificacion;
    }

    public void setFechaHoraNotificacion(Date fechaHoraNotificacion) {
        this.fechaHoraNotificacion = fechaHoraNotificacion;
    }

    public EstadoNotificacion getEstadoNotificacion() {
        return estadoNotificacion;
    }

    public void setEstadoNotificacion(EstadoNotificacion estadoNotificacion) {
        this.estadoNotificacion = estadoNotificacion;
    }
}
