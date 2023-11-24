package com.shopall.shopallAPI.Entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "DetallesTransaccion")
public class DetallesTransaccion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private int ID;

    @Column(name = "IDTransaccion")
    private int IDTransaccion;

    @ManyToOne
    @JoinColumn(name = "IDTransaccion", referencedColumnName = "ID", insertable = false, updatable = false)
    private Transaccion transaccion;

    @Column(name = "IDProducto")
    private int IDProducto;

    @ManyToOne
    @JoinColumn(name = "IDProducto", referencedColumnName = "ID", insertable = false, updatable = false)
    private Producto producto;

    @Column(name = "MontoTotal", precision = 10, scale = 2, nullable = false)
    private BigDecimal montoTotal;

    @Column(name = "DireccionEnvio", columnDefinition = "TEXT", nullable = false)
    private String direccionEnvio;

    @Column(name = "InformacionPago", columnDefinition = "TEXT", nullable = false)
    private String informacionPago;


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getIDTransaccion() {
        return IDTransaccion;
    }

    public void setIDTransaccion(int IDTransaccion) {
        this.IDTransaccion = IDTransaccion;
    }

    public int getIDProducto() {
        return IDProducto;
    }

    public void setIDProducto(int IDProducto) {
        this.IDProducto = IDProducto;
    }

    public BigDecimal getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(BigDecimal montoTotal) {
        this.montoTotal = montoTotal;
    }

    public String getDireccionEnvio() {
        return direccionEnvio;
    }

    public void setDireccionEnvio(String direccionEnvio) {
        this.direccionEnvio = direccionEnvio;
    }

    public String getInformacionPago() {
        return informacionPago;
    }

    public void setInformacionPago(String informacionPago) {
        this.informacionPago = informacionPago;
    }
}
