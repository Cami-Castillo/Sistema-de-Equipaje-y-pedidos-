/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaequipaje;

/**
 *
 * @author Duoc
 */
public class Producto {
    
    private String codigo;
    private String nombre;
    private String tipo;
    private int precio;

    public Producto() {
    }
    

    public Producto(String codigo, String nombre, String tipo, int precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    @Override
    public String toString() {
        return "Producto {" +
               "codigo='" + codigo + '\'' +
               ", nombre='" + nombre + '\'' +
               ", tipo='" + tipo + '\'' +
               ", precio=" + precio +
               '}';
    }


    
}
