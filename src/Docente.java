public class Docente extends Persona{
 private double sueldo;
//Realizamos el metodo constructor heredando de la clase padre
 public Docente(String nombre, String apellidos, int edad, double sueldo) {
    super(nombre, apellidos, edad);
    this.sueldo = sueldo;
 }
 public double getSueldo() {
    return sueldo;
 }
 public void setSueldo(double sueldo) {
    this.sueldo = sueldo;
 }
 public void mostrarDatos(){
    System.out.println("                                            ");
    System.out.println("DOCENTE");
    System.out.println("El nombre del docente es: "+getNombre());
    System.out.println("Los apellidos del docente son: "+getApellidos());
    System.out.println("La edad del docente es: "+getEdad());
    System.out.println("El sueldo del docente es: "+sueldo);
    //el es el dueño de su propio atributo por lo mismo no necesita pedir permiso para usarlo
    System.out.println(" ");
}

 
 
}
