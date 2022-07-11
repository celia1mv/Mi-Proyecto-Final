package com.example.proyecto.entity;

import java.util.Date;

public class ServiciosUsuariosEntity {
    private Integer id;
    private String nombre_usuario;
    private String estado_reserva;
    private Date fecha_creacion;
    private String nombre_servicio;
    private Date fecha_inicio_reserva;
    private Date fecha_final_reserva;

    // Constructores

    public ServiciosUsuariosEntity(Integer id, String nombre_usuario, String estado_reserva, Date fecha_creacion, String nombre_servicio, Date fecha_inicio_reserva, Date fecha_final_reserva) {
        this.id = id;
        this.nombre_usuario = nombre_usuario;
        this.estado_reserva = estado_reserva;
        this.fecha_creacion = fecha_creacion;
        this.nombre_servicio = nombre_servicio;
        this.fecha_inicio_reserva = fecha_inicio_reserva;
        this.fecha_final_reserva = fecha_final_reserva;
    }


    // Getter and Setters


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getEstado_reserva() {
        return estado_reserva;
    }

    public void setEstado_reserva(String estado_reserva) {
        this.estado_reserva = estado_reserva;
    }

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public String getNombre_servicio() {
        return nombre_servicio;
    }

    public void setNombre_servicio(String nombre_servicio) {
        this.nombre_servicio = nombre_servicio;
    }

    public Date getFecha_inicio_reserva() {
        return fecha_inicio_reserva;
    }

    public void setFecha_inicio_reserva(Date fecha_inicio_reserva) {
        this.fecha_inicio_reserva = fecha_inicio_reserva;
    }

    public Date getFecha_final_reserva() {
        return fecha_final_reserva;
    }

    public void setFecha_final_reserva(Date fecha_final_reserva) {
        this.fecha_final_reserva = fecha_final_reserva;
    }
}
