package uniquindio.edu.co.model;

import java.util.ArrayList;
import java.util.List;

public class UQfit {
    private String nombre;
    private String direccion;
    private int nit;
    private int telefono;

    private List<Membresia> listMembresias;
    private List<Clase> listClases;
    private List<Persona> listPersonas;

    /**
     *Constructor de la clase UQfit
     * @param nombre
     * @param direccion
     * @param nit
     * @param telefono
     * @param listMembresias
     * @param listClases
     * @param listPersonas
     */
    public UQfit(String nombre, String direccion, int nit, int telefono, List<Membresia> listMembresias, List<Clase> listClases, List<Persona> listPersonas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.nit = nit;
        this.telefono = telefono;
        this.listMembresias = new ArrayList<>();
        this.listClases = new ArrayList<>();
        this.listPersonas = new ArrayList<>();
    }
}
