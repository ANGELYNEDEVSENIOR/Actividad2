public class Estudiante extends Persona{
    //Hacemos una extencion donde heredamos de clase padre
    private int codigoEstudiante;
    private float notaFinal;
    //Realizamos el constructor 
    public Estudiante(String nombre, String apellidos, int edad, int codigoEstudiante, float notaFinal) {
        super(nombre, apellidos, edad);
        // con la palabra super heredamos de la clase padre
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal;
    }
    //realizamos metodos accesores
    public int getCodigoEstudiante() {
        return codigoEstudiante;
    }
    public void setCodigoEstudiante(int codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }
    public float getNotaFinal() {
        return notaFinal;
    }
    public void setNotaFinal(float notaFinal) {
        this.notaFinal = notaFinal;
    }
    public void mostrarDatos(){
        System.out.println("                                            ");
        System.out.println("ESTUDIANTE");
        System.out.println("El nombre del estudiante es: "+getNombre());
        System.out.println("Los apellidos del estudiante son: "+getApellidos());
        System.out.println("La edad del estudiante es: "+getEdad());
        System.out.println("El codigo del estudiante es: "+codigoEstudiante);
        //el es el dueño de su propio atributo por lo mismo no necesita pedir permiso 
        // para usarlo como en el tema de la nota final o el codigo de estudiante
        System.out.println("La nota final del estudiante es: "+notaFinal);
    }
    

 

}
