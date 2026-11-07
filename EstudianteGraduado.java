public class EstudianteGraduado extends Estudiante{

    private String tituloObtenido;
    private String proyectoGrado;
    private String directorTesis;

    public EstudianteGraduado(String nombre, String identificacion, String correo, String codigo, String carrera, String tituloObtenido, String proyectoGrado, String directorTesis){
        super(nombre, identificacion, correo, codigo, carrera);
        this.tituloObtenido = tituloObtenido;
        this.proyectoGrado = proyectoGrado;
        this.directorTesis = directorTesis;
    }

    @Override
    public void presentarse(){
        super.presentarse();
        System.out.println("Título obtenido: " + tituloObtenido);
        System.out.println("Proyecto de grado: " + proyectoGrado);
        System.out.println("Director de tesis: " + directorTesis);
    }

    public void mostrarProyecto(){
        System.out.println("=== Proyecto de Grado ===");
        System.out.println("Autor: " + getNombre());
        System.out.println("Proyecto: " + proyectoGrado);
        System.out.println("Director: " + directorTesis);
        System.out.println("Título al graduarse: " + tituloObtenido);
    }


}