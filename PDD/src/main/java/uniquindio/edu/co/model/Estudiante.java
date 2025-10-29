package uniquindio.edu.co.model;

public class Estudiante {

    private String nombre;
    private int edad;
    private String correo;

    public Estudiante(String nombre, int edad, String correo) {
        assert edad<0;
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;

    }
}
