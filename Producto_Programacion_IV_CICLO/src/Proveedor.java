public class Proveedor {
    
    private String codigo;
    private String nombreEmpresa;
    private String ruc;
    private String telefono;
    private String direccion;
    
    public Proveedor(String codigo, String nombreEmpresa, String ruc, String telefono, String direccion){
        setCodigo(codigo);
        setNombreEmpresa(nombreEmpresa);
        setRuc(ruc);
        setTelefono(telefono);
        setDireccion(direccion);
    }
    
    public String getCodigo(){
        return codigo;
    }
    
    public void setCodigo(String codigo){
        if(codigo == null || codigo.trim().isEmpty()){
            throw new IllegalArgumentException("El codigo no puede estar vacio.");
        }
        this.codigo = codigo;
    }
    
    public String getNombreEmpresa(){
        return nombreEmpresa;
    }
    
    public void setNombreEmpresa(String nombreEmpresa){
        if(nombreEmpresa == null || nombreEmpresa.trim().isEmpty()){
            throw new IllegalArgumentException("Falta el nombre de la empresa del proveedor.");
        }
        this.nombreEmpresa = nombreEmpresa;
    }
    
    public String getRuc(){
        return ruc;
    }
    
    public void setRuc(String ruc){
        if(ruc == null || !ruc.matches("\\d{11}")){
            throw new IllegalArgumentException("El RUC debe tener 11 digitos.");
        }
        this.ruc = ruc;
    }
    
    public String getTelefono(){
        return telefono;
    }
    
    public void setTelefono(String telefono){
        if(telefono == null || telefono.trim().isEmpty()){
            throw new IllegalArgumentException("Debe ingresar el telefono.");
        }
        this.telefono = telefono;
    }
    
    public String getDireccion(){
        return direccion;
    }
    
    public void setDireccion(String direccion){
        if(direccion == null || direccion.trim().isEmpty()){
            throw new IllegalArgumentException("Debe ingresar su direccion.");
        }
        this.direccion = direccion;
    }
    
    public void mostrarDatos(){
        System.out.println("Codigo: " + codigo);
        System.out.println("Empresa: " + nombreEmpresa);
        System.out.println("RUC: " + ruc);
        System.out.println("Telefono: " + telefono);
        System.out.println("Direccion: " + direccion);
    }
}
