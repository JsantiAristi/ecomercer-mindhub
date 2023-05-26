package com.HijasDelMonte.Ecomerce.Models;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class ProductosSeleccionados {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO , generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long id;
    private int cantidad;
    private double precio;
    private boolean activo;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="orden")
    private Orden orden;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="cursos")
    private Cursos cursos;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="accesorios")
    private Accesorios accesorios;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="plantas")
    private Plantas plantas;

    //CONSTRUCTOR

    public ProductosSeleccionados() {}

    public ProductosSeleccionados(int cantidad, double precio, boolean activo) {
        this.cantidad = cantidad;
        this.precio = precio;
        this.activo = activo;
    }

    //GETTER Y SETTER

    public long getId() {return id;}
    public int getCantidad() {return cantidad;}
    public void setCantidad(int cantidad) {this.cantidad = cantidad;}
    public double getPrecio() {return precio;}
    public void setPrecio(double precio) {this.precio = precio;}
    public boolean isActivo() {return activo;}
    public void setActivo(boolean activo) {this.activo = activo;}
}
