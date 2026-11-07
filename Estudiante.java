public class Estudiante extends Persona {
    private String codigo;
    private String carrera;
    private String[] materiasInscritas;
    private int totalMaterias;

    public Estudiante(String nombre, String identificacion, String correo, String codigo, String carrera){
        super(nombre, identificacion, correo);
        this.codigo = codigo;
        this.carrera = carrera;
        this.materiasInscritas = new materia[10];
        this.totalMaterias = 0;
    }
    
    @Override
    public void presentarse(){
        System.out.println("Soy estudiante de: " + carrera);
        System.out.println("Código estudiantil: " + codigo);
        System.out.println("Materias inscritas: " + materiasInscritas);
    }

    public void inscribir(String materia){
        if (totalMaterias >= 10) {
            System.out.println("Limite de materias alcanzadas (maximo 10)");
            return;
        }

        materiasInscritas[totalMaterias] = materia;
        totalMaterias = totalMaterias + 1;
        System.out.println("Materia inscrita: " + materia + " (sin grupo especifico)");
    }

    public void inscribir(String materia, String grupo){
        if (totalMaterias >= 10) {
            System.out.println("Limite de materias alcanzadas (maximo 10)");
            return;
        }

        String registro = materia + "- Grupo " + grupo;
        materiasInscritas[totalMaterias] = materia;
        totalMaterias = totalMaterias + 1;
        System.out.println("Materia inscrita: " + registro);
    }

    public void mostrarMaterias(){
        if (totalMaterias == 0) {
            System.out.println("No hay materias inscritas");
            return ;
        }

        System.out.println("Materias de " + getNombre() + ":");

        for (int i = 0; i < totalMaterias - 1; i++){
            System.out.println(" " + (i+1) + ". " + materiasInscritas[i]);
        }
    }
}

