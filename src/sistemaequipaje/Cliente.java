/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaequipaje;
import java.util.Date;

/**
 *
 * @author Duoc
 */
public class Cliente {
    public String rut;
    public String nombre;
    public int edad;
    public String fechaNaci;
    
    // CONSTRUCTOR
    
    public Cliente() {
    }

    public Cliente(String rut, String nombre, int edad, String fechaNaci) {
        this.rut = rut;
        this.nombre = nombre;
        this.edad = edad;
        this.fechaNaci = fechaNaci;
    }
    
    //GETTERS Y SETTERS

    public String getRut() {
        return rut;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getFechaNaci() {
        return fechaNaci;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setFechaNaci(String fechaNaci) {
        this.fechaNaci = fechaNaci;
    }
    
    @Override
    public String toString() {
        return "Cliente {" +
               "RUT='" + rut + '\'' +
               ", nombre='" + nombre + '\'' +
               ", edad=" + edad +
               ", fechaNacimiento='" + fechaNaci + '\''
               +'}';
    }

    
    
}
