public class Persona {
    private String nombre;
    private String identificacion;
    private String correo;

    public Persona(String nombre, String identificacion, String correo){
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        }else{
            this.nombre = "No definido";
            System.out.println("nombre no valido, se coloco por defecto No definido");
        }

        if (identificacion != null && !identificacion.isEmpty()) {
            this.identificacion = identificacion;
        }else{
            this.identificacion = "No definido";
            System.out.println("identificación no valida, se coloco por defecto No definido");
        }

        if (correo != null && !correo.isEmpty()) {
            this.correo = correo;
        }else{
            this.correo = "No definido";
            System.out.println("correo no valido, se coloco por defecto No definido");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void actualizarCorreo(String nuevoCorreo){
        if (nuevoCorreo.contains("@") && nuevoCorreo.contains(".")) {
            this.correo = nuevoCorreo;
            System.out.println("Correo actualizado a: " + correo);
        }else{
            System.out.println("Correo inválido. No se realizó el cambio.");
        }
    }

    public void presentarse(){
        System.out.println("Hola, soy" + nombre);
        System.out.println("Identificacion: " + identificacion);
        System.out.println("Correo:" + correo);
    }
}