public class Merma {
    private int codigo;
    private String fecha;
    private int cantidad;
    private Producto producto;
    private String motivoRechazo;
    
    public Merma(int codigo, String fecha, int cantidad, Producto producto, String motivoRechazo) {
        this.codigo=codigo;
        this.fecha=fecha;
        this.cantidad=cantidad;
        this.producto=producto;
        this.motivoRechazo=motivoRechazo;
    }
    public int getCodigo(){
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo=codigo;
    }
    public String getFecha(){
        return fecha;
    }
    public int getCantidad(){
        return cantidad;
    }
    public void setCantida(int cantidad) {
        if (cantidad <=0) {
             throw new IllegalArgumentException("La cantidad debe ser mayor a 0");
        }
        this.cantidad=cantidad;
    }
    public Producto getProducto(){
            return producto;
    }
     public void setProducto(Producto producto){
        if (producto==null){
             throw new IllegalArgumentException("Producto vacío");
        }
        this.producto=producto;
    }
     public String getMotivoRechazo(){
         return motivoRechazo;
     }
     public void setMotivoRechazo(String motivoRechazo){
         this.motivoRechazo=motivoRechazo;
     }
     public void apartarProducto(){
         if (producto!=null){
             System.out.println("Producto "+producto.getNombre() +" apartado por merma");
         }
     }
   } 
