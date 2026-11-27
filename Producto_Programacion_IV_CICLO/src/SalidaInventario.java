public class SalidaInventario extends Movimiento {
    
    private String destino;
    
    public SalidaInventario(int codigo, String fecha, int cantidad, Producto producto, String destino){
        super(codigo,fecha,cantidad,producto);
        setDestino(destino);
    }
    
    public SalidaInventario(int codigo, int cantidad, String fecha, Producto producto){
        this(codigo,fecha, cantidad, producto, "Zona de ventas");
    }

    public void ejecutarSalida(){
        if(this.producto==null){
            throw new IllegalArgumentException("El movimiento de salida no tiene producto asociado");
        }
        if(this.cantidad<=0){
            throw new IllegalArgumentException("La cantidad de salida debe ser mayor a cero");
        }
        if(this.cantidad>this.producto.getStock()){
            throw new IllegalArgumentException("Error: Cantidad solicitada supera el stock disponible");
        }
        int nuevoStock=producto.getStock()-this.cantidad;
        this.producto.setStock(nuevoStock);
        System.out.println("Salida de inventario exitosa");
        System.out.println("Producto: "+producto.getNombre());
        System.out.println("Cantidad retirada: "+this.cantidad);
    }
    
    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("-> Tipo: Salida");
        System.out.println("Destino: "+ destino);
    }
    public String getDestino(){
        return destino;
    }
    public void setDestino(String destino){
        if(destino==null||destino.trim().isEmpty()){
            throw new IllegalArgumentException("El destino de la salida no puede estar vacio");
        }
        this.destino = destino.trim();
    }
}
