package com.example.proyecto.entity;

import java.util.Date;

public class PaseadoresEntity {
    private String doc_identificacion;
    private String nombre;
    private String primer_apellido;
    private String segundo_apellido;
    private String email;
    private String clave;
    private String telefono;
    private Date fecha_nacimiento;
    private String disponibilidad;
    private String direccion;
    private Integer max_cant_perros;
    private String peso_perro;
    private boolean esterilizado;
    private String resena;
    private float valoracion;
    private float precio_paseo;
    // Duda de como poner las fotos
    private String foto_perfil;
    private String galeria;

    // Constructor

    public PaseadoresEntity(String doc_identificacion, String nombre, String primer_apellido, String segundo_apellido, String email, String clave, String telefono, Date fecha_nacimiento, String disponibilidad, String direccion, Integer max_cant_perros, String peso_perro, boolean esterilizado, String resena, float valoracion, float precio_paseo, String foto_perfil, String galeria) {
        this.doc_identificacion = doc_identificacion;
        this.nombre = nombre;
        this.primer_apellido = primer_apellido;
        this.segundo_apellido = segundo_apellido;
        this.email = email;
        this.clave = clave;
        this.telefono = telefono;
        this.fecha_nacimiento = fecha_nacimiento;
        this.disponibilidad = disponibilidad;
        this.direccion = direccion;
        this.max_cant_perros = max_cant_perros;
        this.peso_perro = peso_perro;
        this.esterilizado = esterilizado;
        this.resena = resena;
        this.valoracion = valoracion;
        this.precio_paseo = precio_paseo;
        this.foto_perfil = foto_perfil;
        this.galeria = galeria;
    }

    // Getters y Setters

    public String getDoc_identificacion() {
        return doc_identificacion;
    }

    public void setDoc_identificacion(String doc_identificacion) {
        this.doc_identificacion = doc_identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimer_apellido() {
        return primer_apellido;
    }

    public void setPrimer_apellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }

    public String getSegundo_apellido() {
        return segundo_apellido;
    }

    public void setSegundo_apellido(String segundo_apellido) {
        this.segundo_apellido = segundo_apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getMax_cant_perros() {
        return max_cant_perros;
    }

    public void setMax_cant_perros(Integer max_cant_perros) {
        this.max_cant_perros = max_cant_perros;
    }

    public String getPeso_perro() {
        return peso_perro;
    }

    public void setPeso_perro(String peso_perro) {
        this.peso_perro = peso_perro;
    }

    public boolean isEsterilizado() {
        return esterilizado;
    }

    public void setEsterilizado(boolean esterilizado) {
        this.esterilizado = esterilizado;
    }

    public String getResena() {
        return resena;
    }

    public void setResena(String resena) {
        this.resena = resena;
    }

    public float getValoracion() {
        return valoracion;
    }

    public void setValoracion(float valoracion) {
        this.valoracion = valoracion;
    }

    public float getPrecio_paseo() {
        return precio_paseo;
    }

    public void setPrecio_paseo(float precio_paseo) {
        this.precio_paseo = precio_paseo;
    }

    public String getFoto_perfil() {
        return foto_perfil;
    }

    public void setFoto_perfil(String foto_perfil) {
        this.foto_perfil = foto_perfil;
    }

    public String getGaleria() {
        return galeria;
    }

    public void setGaleria(String galeria) {
        this.galeria = galeria;
    }
}
