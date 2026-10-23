public class SalidaInventario {
    private Producto producto;
    private int cantidad;
    private String fecha;
    
    public SalidaInventario(Producto producto, int cantidad, String fecha){
        setProducto(producto);
        setCantidad(cantidad);
        setFecha(fecha);
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
            throw new IllegalArgumentException("La fecha no puede estar vacía.");
        }
        this.fecha=fecha;
    }
}
