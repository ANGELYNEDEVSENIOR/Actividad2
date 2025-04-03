public class Administrador extends Persona{
 private String correoElectronico;
 private String nivelDeRango;
 
 public Administrador(String nombre, String apellidos, int edad, String correoElectronico, String nivelDeRango) {
    super(nombre, apellidos, edad);
    this.correoElectronico = correoElectronico;
    this.nivelDeRango = nivelDeRango;
}

 public String getCorreoElectronico() {
    return correoElectronico;
}

 public void setCorreoElectronico(String correoElectronico) {
    this.correoElectronico = correoElectronico;
 }

 public String getNivelDeRango() {
    return nivelDeRango;
 }

 public void setNivelDeRango(String nivelDeRango) {
    this.nivelDeRango = nivelDeRango;
 }

 public void mostrarDatos(){
    System.out.println("                                            ");
    System.out.println("ADMINISTRADOR");
    System.out.println("El nombre del administrador es: "+getNombre());
    System.out.println("Los apellidos del administrador son: "+getApellidos());
    System.out.println("La edad del administrador es: "+getEdad());
    System.out.println("El correo electronico del administrador es: "+correoElectronico);
    //el es el dueño de su propio atributo por lo mismo no necesita pedir permiso 
    // para usarlo como en el tema de la nota final o el codigo de estudiante
    System.out.println("El nivel del rango del administrador es: "+nivelDeRango);
}

 
 }
 

