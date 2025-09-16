/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemaequipaje;
import java.util.Date;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

        
 public class SistemaEquipaje{

    public static void main(String[] args) {
        //Variables a usar
        Scanner leer = new Scanner(System.in);
        int opcion = 0;
        int numero;
        String linea;
        double nota;
        
        //Creacion de objetos 
        
        Cliente cliente1 = new Cliente();
        Pedido pedido1= new Pedido();
        Producto producto1 = new Producto();
        Vendedor vendedor1= new Vendedor();
        Zona zona1 = new Zona();
        
        
        do{
            System.out.println("===SISTEA DE PEDIDOS DE EQUIPAJE Y ACCESORIOS DE VIAJE===");
            System.out.println("1. Ingrese Cliente ");
            System.out.println("2. Ingrese Vendedor");
            System.out.println("3. Ingrese Producto");
            System.out.println("4. Generar pedido ");
            System.out.println("5. Salir ");
            System.out.println("Seleccione una opcion: ");
            opcion = leer.nextInt();
            
            switch(opcion){
                case 1: 
                    System.out.println("Ingreso Cliente: ");
                    
                    System.out.print("Ingrese el Rut del cliente: ");
                    leer.nextLine();
                    linea = leer.nextLine();
                    cliente1.setRut(linea);
                    
                    do{
                        System.out.print("Ingrese el nombre del Cliente: ");
                        linea = leer.nextLine();
                        if(linea.equals("")){
                            System.out.println("Error el nombre esta vacio");
                        }
                    }while(linea.equals(""));
                    
                    cliente1.setNombre(linea);
                    
                    
                    do{
                        System.out.print("Ingrese la edad del cliente :");
                        numero = leer.nextInt();
                        leer.nextLine();
                        if(numero <18 || numero >=80){
                            System.out.println("Error la edad debe ser entre 18 y 80 años");
                        }
                       
                    }while(numero <18 || numero >=80);
                    
                    cliente1.setEdad(numero);
                    System.out.print("Ingrese la fecha de nacimiento (yyyy-MM-dd): ");
                    linea = leer.nextLine();
                    cliente1.setFechaNaci(linea);
       
                    System.out.println(cliente1);

                    break;
                    
                case 2:
                    // INGRESO DE VENDEDOR
                    System.out.println("-- INGRESO DE VENDEDOR --");

                    leer.nextLine();  
                    System.out.print("Ingrese RUT del vendedor: ");
                    linea = leer.nextLine();  
                    vendedor1.setRut(linea); 

                    System.out.print("Ingrese numero del vendedor: ");
                    numero = leer.nextInt();  
                    leer.nextLine();  // Limpiar el buffer
                    vendedor1.setNroVendedor(numero);                

                    do {
                        System.out.print("Ingrese nombre del vendedor: ");
                        linea = leer.nextLine();  
                        if (linea.equals("")) {  // Validar que el nombre no esté vacío
                            System.out.println("Error: El nombre no puede estar vacío.");
                        }
                    } while (linea.equals("")); 

                    vendedor1.setNombre(linea);  
                    
                    
                    Date date;   
                    Date hoy = new Date();
                    LocalDate fecha = null;

                    do {
                        System.out.print("Ingrese fecha de ingreso del vendedor (yyyy-MM-dd): ");
                        String fechaIngreso = leer.nextLine();

                        fecha = LocalDate.parse(fechaIngreso);
                        date = Date.from(fecha.atStartOfDay(ZoneId.systemDefault()).toInstant());

                        if (date.after(hoy)) {
                            System.out.println("La fecha de ingreso no puede ser posterior a hoy.");
                        }

                    } while (date.after(hoy));

                    vendedor1.setFechaIngreso(date);  
                
                    System.out.print("Ingrese zona en la que trabaja: ");
                    linea = leer.nextLine(); 
                    vendedor1.setZona(linea);
                   
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                    System.out.println(vendedor1 + ", fechaIngreso=" + fecha.format(formatter));
                    break;

                case 3:
                    // INGRESO DE PRODUCTO
                    System.out.println("-- INGRESO DE PRODUCTO --");
                    
                    System.out.print("Ingrese el codigo unico del producto: ");
                    leer.nextLine();
                    linea = leer.nextLine();
                    producto1.setCodigo(linea);

                    System.out.print("Ingrese el nombre del producto: ");
                    linea = leer.nextLine();  
                    producto1.setNombre(linea);  

                   
                     do {
                        System.out.print("Ingrese tipo del producto: ");
                        linea = leer.nextLine();  
                        if (!linea.equalsIgnoreCase("maleta") && !linea.equalsIgnoreCase("bolso") && !linea.equalsIgnoreCase("mochila")) {  // Validar que el nombre no esté vacío
                            System.out.println("Error: Ingrese un tipo de producto válido");
                        }
                    } while (!linea.equalsIgnoreCase("maleta") && !linea.equalsIgnoreCase("mochila") && !linea.equalsIgnoreCase("bolso")); 
                     
                    producto1.setTipo(linea); 

                    System.out.print("Ingrese el precio del producto: ");
                    numero = leer.nextInt();  
                    producto1.setPrecio(numero);
                    
                    System.out.println(producto1);
                    
                    break;
                    
                case 4:
                    System.out.println("Generar pedido: ");
                    pedido1.setCliente(cliente1);
                    pedido1.setProducto(producto1);
                    pedido1.setVendedor(vendedor1);

                    System.out.print("Ingrese la cantidad solicitada: ");
                    numero = leer.nextInt();
                    leer.nextLine();
                    pedido1.setCantidad(numero);

                    Date hoyPedido = new Date();
                    Date datePedido;
                    LocalDate fechaPedido = null;

                    do {
                        System.out.print("Ingrese fecha de ingreso del pedido (yyyy-MM-dd): ");
                        String fechaIngreso = leer.nextLine();

                        fechaPedido = LocalDate.parse(fechaIngreso);
                        datePedido = Date.from(fechaPedido.atStartOfDay(ZoneId.systemDefault()).toInstant());

                        if (datePedido.after(hoyPedido)) {
                            System.out.println("La fecha de ingreso no puede ser posterior a hoy.");
                        }

                    } while (datePedido.after(hoyPedido));

                    pedido1.setFechaPedido(datePedido);  
                   
                    DateTimeFormatter formatterPedido = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                    System.out.println(pedido1 + ", fechaPedido=" + fechaPedido.format(formatterPedido));

                    System.out.println("-------------------------------------");
                    System.out.println("Total bruto: " + pedido1.totalBruto());
                    System.out.println("Total neto: " + pedido1.descValor());
                    System.out.println("Total por mayor a 65: " + pedido1.descEdad());
                    System.out.println("-------------------------------------");
                    pedido1.estado();

                    break;


                case 5:
                    System.out.println("Saliendo del sistema...");  // Mensaje al salir del sistema
                    break;

                default:
                    System.out.println("Error: Ingrese una opción válida.");  // Mensaje en caso de que el usuario ingrese una opción inválida
                    break;
            }

         
        
        
        } while(opcion!=5);
        leer.close();
    }
    
}

