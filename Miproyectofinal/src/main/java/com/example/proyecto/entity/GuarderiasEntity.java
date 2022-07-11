package com.example.proyecto.entity;

public class GuarderiasEntity {

    private String nombre;
    private float precio_noche;
    private String telefono;
    private String email;
    //duda dirección.
    private float valoracion;

    // Constructor

    public GuarderiasEntity(String nombre, float precio_noche, String telefono, String email, float valoracion) {
        this.nombre = nombre;
        this.precio_noche = precio_noche;
        this.telefono = telefono;
        this.email = email;
        this.valoracion = valoracion;
    }

    //GetterSetter


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio_noche() {
        return precio_noche;
    }

    public void setPrecioNoche(float precioNoche) {
        this.precio_noche = precioNoche;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getValoracion() {
        return valoracion;
    }

    public void setValoracion(float valoracion) {
        this.valoracion = valoracion;
    }
}
