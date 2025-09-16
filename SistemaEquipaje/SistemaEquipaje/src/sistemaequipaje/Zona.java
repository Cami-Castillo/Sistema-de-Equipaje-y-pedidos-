/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaequipaje;

/**
 *
 * @author Duoc
 */
public class Zona {
    
    private int nroZona;
    private String nombre;
    private String ciudad;

    public Zona() {
    }
    
   
    public Zona(int nroZona, String nombre, String ciudad) {
        this.nroZona = nroZona;
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    public int getNroZona() {
        return nroZona;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setNroZona(int nroZona) {
        this.nroZona = nroZona;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    
    
    
}
