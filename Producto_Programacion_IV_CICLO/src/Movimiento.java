public class Movimiento {
    private int codigo; 
    private String fecha;
    private int cantidad;
    private Producto producto;
    
    public Movimiento (int codigo, String fecha, int cantidad, Producto producto){
        this.codigo = codigo;
        setFecha(fecha);
        setCantidad(cantidad);
        setProducto(producto);
    }
        
    public int getCodigo() {
        return codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        if(fecha == null || fecha.trim().isEmpty()){
            throw new IllegalArgumentException("La fecha no puede estar vacia");
        }
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        if (cantidad <= 0){
            throw new IllegalArgumentException("la cantidad no puede ser negativa");
        }  
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        if(producto == null){
            throw new IllegalArgumentException("El producto no puede ser nulo");
        }
        this.producto = producto; 
    }
}
