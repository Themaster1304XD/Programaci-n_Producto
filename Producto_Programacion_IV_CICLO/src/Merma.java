public class Merma extends Movimiento{
    private String motivoRechazo;
    
    public Merma(int codigo, String fecha, int cantidad, Producto producto, String motivoRechazo) {
        super(codigo, fecha, cantidad, producto);
        setMotivoRechazo(motivoRechazo);
    }
     public String getMotivoRechazo(){
         return motivoRechazo;
     }
     public void setMotivoRechazo(String motivoRechazo){
        if(motivoRechazo == null || motivoRechazo.trim().isEmpty()){
            throw new IllegalArgumentException("El motivo de rechazo no puede estar vacio");
        }
        this.motivoRechazo = motivoRechazo;
     }
     public void apartarProducto(){
         if (producto!=null){
             int nuevoStock=producto.getStock() - getCantidad();
             if (nuevoStock<0){
                 throw new IllegalArgumentException("El stock no puede ser negativo");
             }
             producto.setStock(nuevoStock);
             producto.setEstado("Merma");
             System.out.println("Producto "+producto.getNombre() +" apartado por merma");
         }
     }
     @Override
     public void mostrarDatos(){
         super.mostrarDatos();
         System.out.println("Tipo : Merma - Motivo de rechazo: " +motivoRechazo);
     }
   } 
