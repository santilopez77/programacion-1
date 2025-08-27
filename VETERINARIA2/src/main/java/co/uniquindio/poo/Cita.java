package co.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Cita {
    private String fecha, lugar, identificacion;
    private Veterinario veterinario;
    private Mascota mascota;
    private Propietario propietario;


    @Override
    public String toString() {
        return "Cita{" +
                "fecha='" + fecha + '\'' +
                ", lugar='" + lugar + '\'' +
                ", identificacion='" + identificacion + '\'' +
                ", veterinario=" + veterinario +
                ", mascota=" + mascota +
                ", propietario=" + propietario +
                '}';
    }

    public Cita(String fecha, String lugar, String identificacion, Veterinario veterinario, Mascota mascota, Propietario propietario) {
        this.fecha = fecha;
        this.lugar = lugar;
        this.identificacion = identificacion;
        this.veterinario=veterinario;
        this.mascota=mascota;
        this.propietario=propietario;





    }



    }

