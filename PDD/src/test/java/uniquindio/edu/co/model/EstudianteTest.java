package uniquindio.edu.co.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EstudianteTest {
    @Test
    public void validarEdadNegativa(){
        assertThrows(Throwable.class,()-> new Estudiante("luis ",-2,"luis@gmail.com"));


    }
    @Test
    public void validarCorreo(){


    }

}