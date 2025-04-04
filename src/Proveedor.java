public class Proveedor extends Persona{
    private String nombreEmpresa;
    private String telefono;
    private String direccion; 
    private String correoElectronico;
    private String producto;


    public Proveedor(String nombre, String apellidos, int edad, String nombreEmpresa, String telefono, String direccion,
            String correoElectronico, String producto) {
        super(nombre, apellidos, edad);
        this.nombreEmpresa = nombreEmpresa;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correoElectronico = correoElectronico;
        this.producto = producto;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }
        
    public void mostrarDatos(){
        System.out.println("----PROVEEDORES-----");
        System.out.println("El nombre del administrador es: "+getNombre());
        System.out.println("Los apellidos del administrador son: "+getApellidos());
        System.out.println("La edad del administrador es: "+getEdad());
        System.out.println("Nombre Del Proveedor: "+nombreEmpresa);
        System.out.println("Telefono: "+telefono);
        System.out.println("Direccion: "+direccion);
        System.out.println("Correo electronico: "+correoElectronico);
        System.out.println("Producto: "+producto);
        System.out.println("");
    }
        
}
