package com.lambda.multibd.profiles.model;

import java.io.Serializable;

public class Habitante implements Serializable {

    private String idHabitante;
    private String nombre;
    private Integer numeroDepartamento;
    private Integer numeroNivel;


    public String getIdHabitante() {
        return idHabitante;
    }

    public void setIdHabitante(String idHabitante) {
        this.idHabitante = idHabitante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNumeroDepartamento() {
        return numeroDepartamento;
    }

    public void setNumeroDepartamento(Integer numeroDepartamento) {
        this.numeroDepartamento = numeroDepartamento;
    }

    public Integer getNumeroNivel() {
        return numeroNivel;
    }

    public void setNumeroNivel(Integer numeroNivel) {
        this.numeroNivel = numeroNivel;
    }
}
