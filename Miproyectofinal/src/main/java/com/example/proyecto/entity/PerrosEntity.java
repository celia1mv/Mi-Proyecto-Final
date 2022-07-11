package com.example.proyecto.entity;

public class PerrosEntity {
    private Integer id;
    private String nombre;
    private float peso_kg;
    private String edad;
    private String sexo;
    private String raza;
    private boolean microchip;
    private boolean esterilizado;
    private String inf_adiocional;
    private boolean compatible; // Estre atributo identidica si el perro puede pasar con otros perros (true) o si tiene que pasear solo (false)
    private String alergias;

    // Constructor

    public PerrosEntity(Integer id, String nombre, float peso_kg, String edad, String sexo, String raza, boolean microchip, boolean esterilizado, String inf_adiocional, boolean compatible, String alergias) {
        this.id = id;
        this.nombre = nombre;
        this.peso_kg = peso_kg;
        this.edad = edad;
        this.sexo = sexo;
        this.raza = raza;
        this.microchip = microchip;
        this.esterilizado = esterilizado;
        this.inf_adiocional = inf_adiocional;
        this.compatible = compatible;
        this.alergias = alergias;
    }


    //Getters y Setters

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

    public float getPeso_kg() {
        return peso_kg;
    }

    public void setPeso_kg(float peso_kg) {
        this.peso_kg = peso_kg;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public boolean isMicrochip() {
        return microchip;
    }

    public void setMicrochip(boolean microchip) {
        this.microchip = microchip;
    }

    public boolean isEsterilizado() {
        return esterilizado;
    }

    public void setEsterilizado(boolean esterilizado) {
        this.esterilizado = esterilizado;
    }

    public String getInf_adiocional() {
        return inf_adiocional;
    }

    public void setInf_adiocional(String inf_adiocional) {
        this.inf_adiocional = inf_adiocional;
    }

    public boolean isCompatible() {
        return compatible;
    }

    public void setCompatible(boolean compatible) {
        this.compatible = compatible;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }
}
