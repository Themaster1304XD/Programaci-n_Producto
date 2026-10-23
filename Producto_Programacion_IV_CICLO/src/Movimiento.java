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
        this.fecha = fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        if (cantidad < 0) throw new IllegalArgumentException("la cantidad no puede ser negativa");
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
}
