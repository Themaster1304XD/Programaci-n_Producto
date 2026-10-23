public class Categoria {
    
    private String codigo;
    private String nombre;
    private String descripcion;
    
    public Categoria(String codigo, String nombre, String descripcion){
        setCodigo(codigo);
        setNombre(nombre);
        setDescripcion(descripcion);
    }
    
    public String getCodigo(){
        return codigo;
    }
    
    public void setCodigo(String codigo){
        if(codigo == null || codigo.trim().isEmpty()){
            throw new IllegalArgumentException("El codigo no puede estar vacio.");
        }
        this.codigo =codigo;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        if(nombre == null || nombre.trim().isEmpty()){
            throw new IllegalArgumentException("El nombre no pude estar vacio.");
        }
        this.nombre = nombre;
    }
    
    public String getDescripcion(){
        return descripcion;
    }
        
    public void setDescripcion(String descripcion){
        if(descripcion == null || descripcion.trim().isEmpty()){
            throw new IllegalArgumentException("La descripcion no puede estar vacia.");
        }
        this.descripcion = descripcion;
    }
    
    public void mostrarDatos(){
        System.out.println("Codigo: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Descripcion: " + descripcion);
    }
}
