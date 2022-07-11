package com.example.proyecto.entity;

public class TiposDePagosEntity {
    private Integer id;
    private String descripcion;

    //Constructores

    public TiposDePagosEntity(Integer id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    //Getters and Setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
