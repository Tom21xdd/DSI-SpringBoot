package com.app.web.entidad;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 * @author SneiderQuintero
 */
@Entity
@Table(name="persona")
public class Persona {
    @Id
    @Column(name="documento", nullable=false)
    private Long documento;
    @Column(name = "nombre", nullable=false, length=100)
    private String nombre;
    
    @Column(name = "apellido", nullable=false, length=100)
    private String apellido;
    
    @Column(name = "sexo", nullable=false, length=20)
    private String sexo;
    
    @Column(name = "fecha_nacimiento", nullable=false, length=50)
    private String fechaNacimiento;
    
    @Column(name="correo", nullable=false, length=50,unique=true)
    private String email;
    
    @Column(name="contrasenia",nullable=false,length = 50)
    private String contrasenia;
            
    
    
    public Persona(){
        
    }

    public Persona(Long documento, String nombre, String apellido, String email, String contrasenia) {
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.contrasenia = contrasenia;
    }

    
    public Long getDocumento() {
        return documento;
    }

    public void setDocumento(Long documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    
    
}
