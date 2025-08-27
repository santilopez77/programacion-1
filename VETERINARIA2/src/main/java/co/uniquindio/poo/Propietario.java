package co.uniquindio.poo;

public class Propietario {
    private String nombre,email,identificacion;
    private int telefono;


    @Override
    public String toString() {
        return "Propietario{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    public Propietario(String nombre, String email, int telefono, String identificacion){
           this.nombre=nombre;
           this.email=email;
           this.telefono=telefono;
           this.identificacion=identificacion;




    }


}
