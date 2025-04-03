public class App {
    public static void main(String[] args) throws Exception {
     
    Estudiante e1 = new Estudiante("Carla", "Gonzalez Pinto", 
    14, 301, 3.3f);
    e1.mostrarDatos();
    Estudiante e2 = new Estudiante("Madison", "Gomez Figueroa", 
    17, 302, 4.7f);
    e2.mostrarDatos();
    Estudiante e3 = new Estudiante("Enrique", "Buitrago Perez", 
    19, 304, 4.3f);
    e3.mostrarDatos();
    Estudiante e4 = new Estudiante("Roberto", "Lopez Naranjo", 
    15, 309, 5f);
    e4.mostrarDatos();
    Estudiante e5 = new Estudiante("Estefania", "Garcia Bernal", 
    16, 311, 3.5f);
    e5.mostrarDatos();
    // Cuando agregamos la f al final indicamos que es un numero flotante

    //creamos objeto docente, donde instanciamos 
    Docente d1 = new Docente("Alicia", "Sanchez Priss", 23, 1000);
    d1.mostrarDatos();
    Docente d2 = new Docente("Patricia", "Wilches Guedes", 27, 1500);
    d2.mostrarDatos();
    Docente d3 = new Docente("Isabella", "Huertas Cañon", 20, 1450);
    d3.mostrarDatos();
    Docente d4 = new Docente("Victor", "Garcia Leon", 30, 2000);
    d4.mostrarDatos();
    Docente d5 = new Docente("Leonardo","Parra Parra", 32, 2200);
    d5.mostrarDatos();
    }
     
 
}
