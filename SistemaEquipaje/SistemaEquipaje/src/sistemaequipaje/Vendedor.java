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
public class Vendedor {
    
    private String rut;
    private int nroVendedor;
    private String nombre;
    private Date fechaIngreso;
    private String zona;
    
    //Constructor

    public Vendedor() {
    }
    
    

    public Vendedor(String rut, int nroVendedor, String nombre, Date fechaIngreso, String zona) {
        this.rut = rut;
        this.nroVendedor = nroVendedor;
        this.nombre = nombre;
        this.fechaIngreso = fechaIngreso;
        this.zona = zona;
    }

    public String getRut() {
        return rut;
    }

    public int getNroVendedor() {
        return nroVendedor;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public String getZona() {
        return zona;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setNroVendedor(int nroVendedor) {
        this.nroVendedor = nroVendedor;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }
    @Override
    public String toString() {
        return "Vendedor {" +
               "RUT='" + rut + '\'' +
               ", numero=" + nroVendedor +
               ", nombre='" + nombre + '\'' +
               ", zona='" + zona + '\''+
               '}';
    }

    
    
    
   
    
}
