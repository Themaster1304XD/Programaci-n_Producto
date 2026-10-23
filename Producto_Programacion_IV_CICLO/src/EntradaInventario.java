public class EntradaInventario {
    private int codigo;
    private String fecha;
    private int cantidad;
    private Producto producto;
    private Proveedor proveedor;
    private String estadoVerificado;
    
    public EntradaInventario(int codigo, String fecha, int cantidad, Producto producto, Proveedor proveedor, String estadoVerificado) {
        this.codigo=codigo;
        this.fecha=fecha;
        setCantidad(cantidad);
        setProducto(producto);
        setProveedor(proveedor);
        this.estadoVerificado=estadoVerificado;
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
    public void setFecha(String fecha) {
        this.fecha=fecha;
    }
    public int getCantidad(){
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        if (cantidad <=0) {
             throw new IllegalArgumentException("La cantidad debe ser mayor a 0");
        }
        this.cantidad=cantidad;
    }
    public Producto getProducto() {
        return producto;
    }
    public void setProducto(Producto producto){
        if (producto==null){
             throw new IllegalArgumentException("Producto vacío");
        }
        this.producto=producto;
    }
    public Proveedor getProveedor(){
        return proveedor;
    }
    public void setProveedor(Proveedor proveedor) {
        if (proveedor == null) {
             throw new IllegalArgumentException("Proveedor vacío");
        }
        this.proveedor=proveedor;
    }
    public String getEstadoVerificado(){
        return estadoVerificado;
    }
    public void setEstadoVerificado(String estadoVerificado) {
    if(estadoVerificado.equals("Optimo") || estadoVerificado.equals("Defectuoso") || estadoVerificado.equals("Merma")) {
        this.estadoVerificado = estadoVerificado;
    } else {
        throw new IllegalArgumentException("Estado no valido. Use: Optimo, Defectuoso o Merma");
    }
    }
}
