package com.example.proyecto.entity;

public class RestaurantesEntity {
    private Integer id;
    private String nombre;
    private String telefono;
    private float valoracion;
    private String email;

    // Constructores
    public RestaurantesEntity(Integer id, String nombre, String telefono, float valoracion, String email) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.valoracion = valoracion;
        this.email = email;
    }

    // Getters and Setters


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public float getValoracion() {
        return valoracion;
    }

    public void setValoracion(float valoracion) {
        this.valoracion = valoracion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
