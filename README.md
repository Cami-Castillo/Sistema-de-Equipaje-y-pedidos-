# Sistema de Gestión de Pedidos de Equipaje y Accesorios

Este proyecto es un programa en **Java** que permite gestionar pedidos de equipaje y accesorios de viaje (maletas, mochilas y bolsos) para una tienda online. El sistema guarda datos de **clientes, vendedores, productos y pedidos**, calcula totales y aplica descuentos según reglas de negocio.

## Funcionalidades

- **Clientes**: almacenar rut, nombre, edad y fecha de nacimiento.  
  - **Validación**: edad entre 18 y 79 años, nombre no vacío.  
  - Descuento automático del 50% si el cliente tiene más de 65 años.

- **Vendedores**: rut, nombre, número de vendedor, fecha de ingreso y zona.  
  - **Validación**: nombre no vacío, fecha de ingreso no posterior a hoy.

- **Productos**: código, nombre, tipo (**Maleta**, **Mochila** o **Bolso**) y precio unitario.  
  - **Validación**: tipo válido.

- **Pedidos**: vincula cliente, vendedor y producto; registra cantidad y fecha.  
  - Calcula **total bruto**, **descuento por monto**, **total neto** y determina si el pedido está **confirmado** o **pendiente**.

## Reglas de negocio

- Descuento por monto:  
  - Total > $60.000 → 15%  
  - Total > $120.000 → 25%  

- Descuento por edad >65 años: 50% sobre total bruto, antes del descuento por monto.  
- Pedido confirmado si el cliente tiene datos completos y edad válida.

## Menú principal

=== SISTEMA DE PEDIDOS ===
1. Ingresar Cliente
2. Ingresar Vendedor
3. Ingresar Producto
4. Generar Pedido
5. Salir


## Uso

1. Abrir el proyecto en **Java**.  
2. Ejecutar `Main.java`.  
3. Seguir el menú para ingresar datos y generar pedidos.

> **Nota:** Los datos se almacenan solo en memoria y se pierden al cerrar el programa.
