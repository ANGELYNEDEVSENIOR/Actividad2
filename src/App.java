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



    //creamos objeto de administrador y instanciamos para mostrar datos
    Administrador a1 = new Administrador("Manrique", "Gomez Cardenas", 34,
     "Manrique123@gmail.com", "Basico");
     a1.mostrarDatos();
     Administrador a2 = new Administrador("Libardo", "Trujillo Caldas", 36,
     "Libardo67caldas@gmail.com", "Superior");
     a2.mostrarDatos();
     Administrador a3 = new Administrador("Marcela", "Rubio Jaramillo", 28,
     "Mace56la23@gmail.com", "Inferior");
     a3.mostrarDatos();
     Administrador a4 = new Administrador("Carmen", "Hurtado Osorio", 32,
     "Carm.osorio.@gmail.com", "Basico");
     a4.mostrarDatos();
     Administrador a5 = new Administrador("Teresa", "Caicedo Vera", 39,
     "VeraveraTeresa.com", "Superior");
     a5.mostrarDatos();

     Proveedor P1 = new Proveedor("Martín", "Gutiérrez", 45, "", "5512356780", "Av. Universidad 123, Ciudad de México, México", "mgutierrez@saguti.com", "Material de oficina, papel, bolígrafos, carpetas, impresoras");
        P1.mostrarDatos();
        Proveedor P2 = new Proveedor("Andrea", "Lopez",38 , " López Tech Solutions", "311234567", " C/ Gran Vía 45, Madrid, España", "andrea.lopez@lopeztech.com", "Equipos de cómputo, software académico, servidores, proyectores");
        P2.mostrarDatos();
        Proveedor P3 = new Proveedor("Javier", "Rojas", 50, "Rojas Mantenimiento Integral", "311456789", "Cra 15 #45-23, Bogotá, Colombia", "jrojas@rojasmi.com", " Servicios de mantenimiento, plomería, electricidad, pintura");
        P3.mostrarDatos();
        Proveedor P4 = new Proveedor("Mariana", "Perez", 42, "Catering Universitario Pérez", "305987654", " 789 College St, Miami, FL, EE.UU.", "mperez@cateringperez.com", "Servicio de cafetería, catering para eventos, snacks saludables");
        P4.mostrarDatos();
        Proveedor P5 = new Proveedor("Ricardo", "Fernandez", 48, "Editorial Fernández y Asociados", "321226658", " Av. Corrientes 765, Buenos Aires, Argentina", "rfernandez@editorialfya.com", "Libros académicos, revistas científicas, material didáctico");
        P5.mostrarDatos();
    }
     

 
}
