package uniquindio.edu.co.model;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nombre;


    private List<Estudiante> ListEstudiantes;

    /**
     * Metodo constructor de la clase Curso
     * @param nombre
     */
    public Curso (String nombre){
    this.nombre=nombre;
    this.ListEstudiantes=new ArrayList<>();
/**
 * Metodo que permite agregar estudiantes a un Curso
 *@param estudiante
 */
    public void agregarEstudiante(Estudiante estudiante ){
        ListEstudiantes.add(estudiante);

        }

    }
}
