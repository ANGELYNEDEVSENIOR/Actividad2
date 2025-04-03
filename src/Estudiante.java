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
    
    

 

}
