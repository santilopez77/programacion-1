package co.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Cita {
    private String fecha, lugar, identificacion;
    private List<Propietario> listPropietario;
    private List<Mascota> listmascota;

    public Cita(String fecha, String lugar, String identificacion) {
        this.fecha = fecha;
        this.lugar = lugar;
        this.identificacion = identificacion;
        this.listPropietario = new ArrayList<>();
        this.listmascota = new ArrayList<>();
    }


    public boolean verificarpropietario(Propietario propietario) {
        boolean centinela = false;
        for (Propietario est : listPropietario) {
            if (est.getidentificacion().equals(propietario.getidentificacion())) {
                centinela = true;
            }
        }
        return centinela;
    }

    public void agregarEstudianteCurso(Propietario propietario) {
        if (!verificarpropietario(propietario)) {
            listPropietario.add(propietario);
            System.out.println("Se agrego");
        } else {
            System.out.println("Ya existe");
        }
    }

    public boolean verificarmascota(Mascota mascota) {
        boolean centinela = false;
        for (Mascota est : listmascota) {
            if (est.getidentificacion().equals(mascota.getidentificacion())) {
                centinela = true;
            }
        }
        return centinela;
    }
    public void agregarMascotaCurso(Mascota mascota) {
        if (!verificarmascota(mascota)) {
            listmascota.add(mascota);
            System.out.println("Se agrego");
        } else {
            System.out.println("Ya existe");
        }
    }

    @Override
    public String toString() {
        return "Cita{" +
                "fecha='" + fecha + '\'' +
                ", lugar='" + lugar + '\'' +
                ", identificacion='" + identificacion + '\'' +
                ", listPropietario=" + listPropietario +
                ", listmascota=" + listmascota +
                '}';
    }
}
