


public class Producto_Programacion_IV_CICLO {

  
    public static void main(String[] args) {
        System.out.println("SISTEMA DE INVENTARIO MINISUPER FAVISA");
        System.out.println("Sede: Nuevo Chimbote");
        System.out.println(" ");
        
        Inventario miInventario = new Inventario();
        
        Proveedor provLocal = new Proveedor("P001", "Distribuidora del Norte", "10203040501", "987654321", "Av. Pacifico");
        
        Producto fideos = new Producto(1, "Fideos Anita", "Paquete 500g", "Paquete", 50, "Optimo", 2.50, 3.50);
        Producto huevos = new Producto(2, "Huevos La Calera", "Plancha x30", "Plancha", 20, "Optimo", 12.00, 15.00);
        
        miInventario.registrarProducto(fideos);
        miInventario.registrarProducto(huevos);
        
        
        System.out.println("\n INVENTARIO INICIAL");
        miInventario.mostrarInventario();
        
        //Caso 1: Entrada de mercaderia (entrada de fideos)
        System.out.println("\n REGISTRANDO ENTRADA DE MERCADERIA");
        EntradaInventario entrada = new EntradaInventario(101, "23/10/2026", 10, fideos, provLocal, "Optimo");
        fideos.setStock(fideos.getStock() + entrada.getCantidad());
        System.out.println("Se ingresaron " + entrada.getCantidad() + " unidades de " + fideos.getNombre());
    }
    
}
