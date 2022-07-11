package com.example.proyecto.entity;

public class CatalogosEntity {

    private String tipo_Servicio;

    //Constructores
    public CatalogosEntity(String tipo_Servicio) {
        this.tipo_Servicio = tipo_Servicio;
    }
    //GetterSetter

    public String getTipo_Servicio() {
        return tipo_Servicio;
    }

    public void setTipo_Servicio(String tipo_Servicio) {
        this.tipo_Servicio = tipo_Servicio;
    }
}
