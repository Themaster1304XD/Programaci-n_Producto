public class Producto {
    private int codigo;
    private String nombre;
    private String descripcion;
    private String unidad; 
    private int stock;
    private String estado;
    private double precioCompra;
    private double precioVenta;
    
    public Producto(int codigo, String nombre, String descripcion, String unidad, int stock, String estado, double precioCompra, double precioVenta){
        this.codigo = codigo;
        setNombre(nombre);
        setDescripcion(descripcion);
        setUnidad(unidad);
        setStock(stock);
        setEstado(estado);
        setPrecioCompra(precioCompra);
        setPrecioVenta(precioVenta);
    }

    public int getCodigo() {
        return codigo;
    }
    
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()){ 
            throw new IllegalArgumentException("El nombre no puede estar vacio");
        }
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        if (descripcion == null || descripcion.trim().isEmpty()) {
            throw new IllegalArgumentException("La descripcion no puede estar vacia");
        }
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
        if (stock < 0) {
            throw new IllegalArgumentException("El stock no puede ser negativo");
        }
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
        if (precioCompra < 0) {
            throw new IllegalArgumentException("El precio de compra no puede ser negativo");
        }
        this.precioCompra = precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        if (precioVenta < 0) {
            throw new IllegalArgumentException("El precio de venta no puede ser negativo");
        }
        this.precioVenta = precioVenta;
    }
    
    public void mostrarDatos() {
        System.out.println("Codigo: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Descripcion: " + descripcion);
        System.out.println("Unidad: " + unidad);
        System.out.println("Stock: " + stock);
        System.out.println("Estado: " + estado);
        System.out.println("Precio Compra: S/ " + precioCompra);
        System.out.println("Precio Venta: S/ " + precioVenta);
    }
}
