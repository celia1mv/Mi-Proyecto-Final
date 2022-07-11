package com.example.proyecto.entity;

import java.util.Date;

public class UsuariosEntity {
    private Integer id;
    private String doc_identificacion;
    private String nombre;
    private String primer_apellido;
    private String segundo_apellido;
    private String email;
    private String clave;
    private String telefono;
    private Date fecha_nacimiento;

    //Constructores

    public UsuariosEntity(Integer id, String doc_identificacion, String nombre, String primer_apellido, String segundo_apellido, String email, String clave, String telefono, Date fecha_nacimiento) {
        this.id = id;
        this.doc_identificacion = doc_identificacion;
        this.nombre = nombre;
        this.primer_apellido = primer_apellido;
        this.segundo_apellido = segundo_apellido;
        this.email = email;
        this.clave = clave;
        this.telefono = telefono;
        this.fecha_nacimiento = fecha_nacimiento;

    }
    //Getters and Setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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


    }

