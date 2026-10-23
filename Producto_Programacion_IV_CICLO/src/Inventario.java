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
    
}

