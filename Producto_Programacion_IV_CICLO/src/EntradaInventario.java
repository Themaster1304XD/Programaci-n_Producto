public class EntradaInventario extends Movimiento{
    private Proveedor proveedor;
    private String estadoVerificado;
    
    public EntradaInventario(int codigo, String fecha, int cantidad, Producto producto, Proveedor proveedor, String estadoVerificado) {
        super(codigo, fecha, cantidad, producto);
        setProveedor(proveedor);
        setEstadoVerificado(estadoVerificado);
    }
    public Proveedor getProveedor(){
        return proveedor;
    }
    public void setProveedor(Proveedor proveedor) {
        if (proveedor == null) {
             throw new IllegalArgumentException("Proveedor no puede estar vacío");
        }
        this.proveedor=proveedor;
    }
    public String getEstadoVerificado(){
        return estadoVerificado;
    }
    public void setEstadoVerificado(String estadoVerificado) {
    if(estadoVerificado!= null && (estadoVerificado.equals("Optimo") || estadoVerificado.equals("Defectuoso") || estadoVerificado.equals("Merma"))) {
        this.estadoVerificado = estadoVerificado;
    } else {
        throw new IllegalArgumentException("Estado no valido. Use: Optimo, Defectuoso o Merma");
    }
    }
    public void procesarEntrada(){
        if (producto!=null && "Optimo".equalsIgnoreCase(this.estadoVerificado) ){
            producto.setStock(producto.getStock() + getCantidad());
        }
    }
    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Proveedor: " + (proveedor !=null ? proveedor.getNombreEmpresa() : "N/A") +"  Estado verificado: " + estadoVerificado);
    }
}
