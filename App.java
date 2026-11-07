public class App {
    public static void main(String[] args) throws Exception {
        
    Estudiante e1 = new Estudiante("Ana Martinez", "1001234567", "ana@uni.edu", "2024100101", "Ingenieria de sistemas");

    EstudianteGraduado eg1 = new EstudianteGraduado("Carlos Perez", "1009876543", "carlos@uni.edu", "2020100045", "Ingeniera de sistemas", "Ingeniero de sistemas", "Sistema de detección de fraude con ML", "Dr. Ramírez");

    Profesor p1 = new Profesor("Dra. Laura Gomez", "52001234", "lgomez@uni.edu", "Ciencias de la computación", 32, 4500000);

    e1.inscribir("Programacion OOP");
    e1.inscribir("Bases de datos", "2");
    e1.inscribir("Estructura de datos", "1");
    e1.mostrarMaterias();

    eg1.inscribir("Seminario de investigación", "1");

    System.out.println("--- ESTUDIANTE ---");
    e1.presentarse();

    System.out.println("--- ESTUDIANTE GRADUADO ---");
    eg1.presentarse();

    System.out.println("--- PROFESOR ---");
    p1.presentarse();
    p1.calcularSalario();

    e1.actualizarCorreo("ana.martinez@universidad.edu.co");
    p1.actualizarCorreo("Correo-Invalido");

    eg1.mostrarProyecto();

    String comunidad[];

    System.out.println("--- TODOS SE PRESENTAN ---");




    }
}
