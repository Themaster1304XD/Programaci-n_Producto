public abstract class Movimiento { //puede no ser abstract si se necesita instanciar objetos
    private int codigo; 
    private String fecha;//se puede implementar con LocalDate
    private int cantidad;
    private Producto producto;
    
    public Movimiento (int codigo, String fecha, int cantidad, Producto producto){
        if (cantidad < 0) throw new IllegalArgumentException("la cantidad no puede ser negativa");
        this.codigo = codigo;
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.producto = producto;
    }
    
    //asumiendo codigo no modificable
    
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
