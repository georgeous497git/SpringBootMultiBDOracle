package com.lambda.multibd.profiles.model;

import java.io.Serializable;

public class Edificio implements Serializable {

    private String idEdificio;
    private String nombre;
    private String ubicacion;
    private Integer numeroExterior;
    private Integer numeroDepartamentos;
    private Integer numeroNiveles;
    private Integer numeroAmenidades;
    private Integer numeroEstacionamientos;


    public String getIdEdificio() {
        return idEdificio;
    }

    public void setIdEdificio(String idEdificio) {
        this.idEdificio = idEdificio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Integer getNumeroExterior() {
        return numeroExterior;
    }

    public void setNumeroExterior(Integer numeroExterior) {
        this.numeroExterior = numeroExterior;
    }

    public Integer getNumeroDepartamentos() {
        return numeroDepartamentos;
    }

    public void setNumeroDepartamentos(Integer numeroDepartamentos) {
        this.numeroDepartamentos = numeroDepartamentos;
    }

    public Integer getNumeroNiveles() {
        return numeroNiveles;
    }

    public void setNumeroNiveles(Integer numeroNiveles) {
        this.numeroNiveles = numeroNiveles;
    }

    public Integer getNumeroAmenidades() {
        return numeroAmenidades;
    }

    public void setNumeroAmenidades(Integer numeroAmenidades) {
        this.numeroAmenidades = numeroAmenidades;
    }

    public Integer getNumeroEstacionamientos() {
        return numeroEstacionamientos;
    }

    public void setNumeroEstacionamientos(Integer numeroEstacionamientos) {
        this.numeroEstacionamientos = numeroEstacionamientos;
    }
}
