import java.util.ArrayList;
public class Inventario {
  private ArrayList<Producto> listaProducto;

    public Inventario(){
        this.listaProducto=new ArrayList<>();
    }
    
    public void registrarProducto(Producto producto){
        if(producto==null){
            throw new IllegalArgumentException("El producto es nulo");
        }
        
        for(Producto produc: listaProducto){
            if(produc.getCodigo()==producto.getCodigo()){
                throw new IllegalArgumentException("Producto ya registrado");
            }
        }
        this.listaProducto.add(producto);
        System.out.println("Producto registrado de manera exitosa");
    }
    
    public Producto buscarProducto(int codigo){
        for(Producto produc: listaProducto){
            if(produc.getCodigo()==codigo){
                return produc;
            }
        }
        return null;
    }
    
    public void mostrarInventario(){
        if(listaProducto.isEmpty()){
            System.out.println("El inventario esta vacio");
        } else{
            System.out.println("LISTA DE INVENTARIO");
            for(Producto produc: listaProducto){
                System.out.println("Codigo: "+produc.getCodigo());
                System.out.println("Nombre: "+produc.getNombre());
                System.out.println("Stock: "+produc.getStock());
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
}

