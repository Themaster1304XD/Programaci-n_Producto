public class SalidaInventario {
    private int codigo;
    private Producto producto;
    private int cantidad;
    private String fecha;
    
    public SalidaInventario(int codigo, Producto producto, int cantidad, String fecha){
        this.codigo = codigo;
        setProducto(producto);
        setCantidad(cantidad);
        setFecha(fecha);
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void ejecutarSalida(){
        if(this.cantidad>producto.getStock()){
            throw new IllegalArgumentException("Error: Cantidad solicitada supera el stock disponible");
        }
        int nuevoStock=producto.getStock()-this.cantidad;
        producto.setStock(nuevoStock);
        System.out.println("Salida de inventario exitosa");
        System.out.println("Producto: "+producto.getNombre());
        System.out.println("Cantidad retirada: "+this.cantidad);
    }
    public Producto getProducto(){
        return producto;
    }
    
    public void setProducto(Producto producto){
        if(producto==null){
            throw new IllegalArgumentException("Producto vacio");
        }
        this.producto=producto;
    }
    
    public int getCantidad(){
        return cantidad;
    }
    
    public void setCantidad(int cantidad){
        if(cantidad<=0){
            throw new IllegalArgumentException("La cantidad de salida debe ser mayor a cero.");
        }
        this.cantidad=cantidad;
    }
    public String getFecha(){
        return fecha;
    }
    
    public void setFecha(String fecha){
        if(fecha==null || fecha.isEmpty()){
            throw new IllegalArgumentException("La fecha no puede estar vacia.");
        }
        this.fecha=fecha;
    }
}
