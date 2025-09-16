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
public class Pedido {
    
    private Cliente cliente;
    private Producto producto;
    private Vendedor vendedor;
    private int cantidad;
    private Date fechaPedido;

    public Pedido() {
    }
    

    public Pedido(Cliente cliente, Producto producto, Vendedor vendedor, int cantidad, Date fechaPedido) {
        this.cliente = cliente;
        this.producto = producto;
        this.vendedor = vendedor;
        this.cantidad = cantidad;
        this.fechaPedido = fechaPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto getProducto() {
        return producto;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }
    
    public int totalBruto(){
        return cantidad*(producto.getPrecio());
    
    }
    
    public double descValor(){
        if(totalBruto() > 60000 && totalBruto() <= 120000){
            return (totalBruto() - totalBruto()*0.15);
        }
        else if(totalBruto() > 120000){
            return (totalBruto() - totalBruto()*0.25);
        }
        else{
            return totalBruto();
        }
    }
    
    
    
    public double descEdad(){
        if(cliente.getEdad() > 65){
            return descValor() - descValor()*0.5;
        }
        return descValor();
    }
    
    public void estado(){
        boolean edadValida = cliente.getEdad() >= 18 && cliente.getEdad() < 80;
        boolean fechaValida = !cliente.getFechaNaci().equals("");
        boolean nombreValido = !cliente.getNombre().equals("");
        boolean rutValido = !cliente.getRut().equals("");

        if (edadValida && fechaValida && nombreValido && rutValido) {
            System.out.println("Pedido confirmado");
        } 
        else {
            System.out.println("Pedido pendiente. Revise sus datos ingresados.");
        }
    }
    
    @Override
    public String toString() {
        return "Pedido {" +
               "cliente=" + cliente.getNombre() +
               ", vendedor=" + vendedor.getNombre() +
               ", producto=" + producto.getNombre() +
               ", cantidad=" + cantidad+
              '}';
    }

    
}
