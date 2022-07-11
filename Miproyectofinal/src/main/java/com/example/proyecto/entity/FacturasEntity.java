package com.example.proyecto.entity;
import java.util.Date;

public class FacturasEntity {

    private Date fecha_creacion;
    private float total_a_pagar;
    private String estado;

    //Constructor

    public FacturasEntity(Date fecha_creacion, float total_a_pagar, String estado) {
        this.fecha_creacion = fecha_creacion;
        this.total_a_pagar = total_a_pagar;
        this.estado = estado;
    }

    //GetterSetter


    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public float getTotal_a_pagar() {
        return total_a_pagar;
    }

    public void setTotal_a_pagar(float total_a_pagar) {
        this.total_a_pagar = total_a_pagar;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}