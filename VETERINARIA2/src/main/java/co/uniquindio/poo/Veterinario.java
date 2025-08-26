package co.uniquindio.poo;

public class Veterinario {
    private String nombre;
    private int cedula;


    @Override
    public String toString() {
        return "Veterinario{" +
                "nombre='" + nombre + '\'' +
                ", cedula=" + cedula +
                '}';
    }

    public Veterinario (String nombre, int cedula){
        this.nombre=nombre;
        this.cedula=cedula;
    }
}
