import java.util.ArrayList;
public class Inventario {
  private ArrayList<Producto> listaProducto;
  private ArrayList<Movimiento> listaMovimientos;
  
    public Inventario(){
        this.listaProducto=new ArrayList<>();
        this.listaMovimientos=new ArrayList<>();
    }
    
    public void registrarProducto(Producto producto){
        if(producto==null){
            throw new IllegalArgumentException("No se puede registras un producto nulo");
        }
        
        if (buscarProducto(producto.getCodigo()) != null){
            throw new IllegalArgumentException("Ya existe un producto con ese codigo");
        }

        this.listaProducto.add(producto);
        System.out.println("Producto registrado de manera exitosa");
    }
    
    public Producto buscarProducto(int codigo){
        if(codigo<=0){
            throw new IllegalArgumentException("El codigo de busqueda debe ser mayor que cero");
        }
        for(Producto produc: listaProducto){
            if(produc.getCodigo()==codigo){
                return produc;
            }
        }
        return null;
    }
    
    public void mostrarInventario(){
        if(listaProducto==null || listaProducto.isEmpty()){
            System.out.println("No hay productos registrasdos en el inventario");
        } else{
            System.out.println("LISTA DE INVENTARIO");
            for(Producto produc: listaProducto){
                System.out.println("Codigo: "+produc.getCodigo());
                System.out.println("Nombre: "+produc.getNombre());
                System.out.println("Stock: "+produc.getStock());
            }
        }
    }
    
    public void registrarMovimiento(Movimiento movimiento){
        if(movimiento==null){
          throw new IllegalArgumentException("No se puede registrar el movimiento");  
        }
        this.listaMovimientos.add(movimiento);
    }
    
    public void mostrarHistorialMovimientos(){
        if(listaMovimientos==null||listaMovimientos.isEmpty()){
            System.out.println("No hay movimientos registrados");
        }
        for(Movimiento mov: listaMovimientos){
            if(mov!=null){
                mov.mostrarDatos();
            }
        }
    }
    
    public ArrayList<Producto> getListaProducto(){
        return listaProducto;
    }
    
    public void setListaProducto(ArrayList<Producto> listaProducto){
        if(listaProducto==null){
            throw new IllegalArgumentException("Lista de productos nula");
        }
        this.listaProducto=listaProducto;
    }
    
    public ArrayList<Movimiento> getListaMovimientos(){
        return listaMovimientos;
    }
    
    public void setListaMovimientos(ArrayList<Movimiento> listaMovimientos){
        if(listaMovimientos==null){
            throw new IllegalArgumentException("La lista de movimientos no puede ser nula");
        }
        this.listaMovimientos=listaMovimientos;
    }
}

