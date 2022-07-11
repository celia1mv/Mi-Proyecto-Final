package com.example.proyecto.entity;

public class HotelesEntity {
    private Integer id;
    private String nombre;
    private boolean piscina;
    private float valoracion;
    private float precio_noche;
    private String email;
    private String telefono;

    // Constructor
    public HotelesEntity(Integer id, String nombre, boolean piscina, float valoracion, float precio_noche, String email, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.piscina = piscina;
        this.valoracion = valoracion;
        this.precio_noche = precio_noche;
        this.email = email;
        this.telefono = telefono;
    }

    // Getter y Setters
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

    public boolean isPiscina() {
        return piscina;
    }

    public void setPiscina(boolean piscina) {
        this.piscina = piscina;
    }

    public float getValoracion() {
        return valoracion;
    }

    public void setValoracion(float valoracion) {
        this.valoracion = valoracion;
    }

    public float getPrecio_noche() {
        return precio_noche;
    }

    public void setPrecio_noche(float precio_noche) {
        this.precio_noche = precio_noche;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
