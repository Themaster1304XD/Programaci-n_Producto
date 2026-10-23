public class Producto {
    private int codigo;
    private String nombre;
    private String descripcion;
    private String unidad; 
    private int stock; //puede peertenecer a inventario
    private String estado; //se puede implementar con enum 
    private double precioCompra;
    private double precioVenta;
    
    public Producto(int codigo, String nombre, String descripcion, String unidad, int stock, String estado, double precioCompra, double precioVenta){
        
        if (nombre == null || nombre == "") throw new IllegalArgumentException("el nombre no puede estar vacio");
        if (stock < 0) throw new IllegalArgumentException("el stock no puede ser negativo");
        if (precioCompra < 0 || precioVenta < 0) throw new IllegalArgumentException("el precio no puede ser negativo");
       
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.unidad = unidad;
        this.stock = stock;
        this.estado = estado;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
    }

    public int getCodigo() {
        return codigo;
    }
//  si se considera modificable el codigo
//    public void setCodigo(int codigo) {
//        this.codigo = codigo;
//    }

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        if (nombre == null || nombre == "") throw new IllegalArgumentException("el nombre no puede estar vacio");
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) { 
        this.unidad = unidad;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        if (precioCompra < 0) throw new IllegalArgumentException("el precio no puede ser negativo");
        this.precioCompra = precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        if (precioVenta < 0) throw new IllegalArgumentException("el precio no puede ser negativo");
        this.precioVenta = precioVenta;
    }
    
}
