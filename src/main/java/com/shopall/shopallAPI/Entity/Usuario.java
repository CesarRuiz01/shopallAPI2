package com.shopall.shopallAPI.Entity;

import jakarta.persistence.*;



@Entity
@Table(name="Usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name= "ID")
    private int ID;


    @Column(name= "NombreUsuario")

    private String NombreUsuario;

    @Column(name="Contraseña")
    private String Contraseña;

    @Column(name="NombreCompleto")
    private String  NombreCompleto;

    @Column(name="CorreoElectronico")
    private String CorreoElectronico;

    @Enumerated(EnumType.STRING)
    @Column(name="TipoUsuario")
    private TipoUsuario TipoUsuario;

    public Usuario() {
    }

    public  int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public  String getNombreUsuario() {
        return NombreUsuario;
    }

    public void setNombreUsuario(String NombreUsuario) {
        this.NombreUsuario = NombreUsuario;
    }

    public  String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public  String getNombreCompleto() {
        return NombreCompleto;
    }

    public void setNombreCompleto(String NombreCompleto) {
        this.NombreCompleto = NombreCompleto;
    }

    public String getCorreoElectronico() {
        return CorreoElectronico;
    }

    public void setCorreoElectronico(String CorreoElectronico) {
        this.CorreoElectronico = CorreoElectronico;
    }

    public TipoUsuario getTipoUsuario() {
        return TipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario TipoUsuario) {
        this.TipoUsuario = TipoUsuario;
    }


}
