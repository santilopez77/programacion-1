package co.uniquindio.poo;

public class Mascota {
    private String identificacion,nombre,raza;
    private int edad;


    @Override
    public String toString() {
        return "Mascota{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    public Mascota(String identificacion, String nombre, String raza, int edad){
        this.identificacion=identificacion;
        this.nombre=nombre;
        this.raza=raza;
        this.edad=edad;





    }



}
