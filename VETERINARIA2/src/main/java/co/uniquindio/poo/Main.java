package co.uniquindio.poo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Mascota mascota = new Mascota("bob214", "bobby", "french puder", 11);


        Cita cita = new Cita("28/08/2025","armenia","kja2809");

        Propietario propietario = new Propietario("dahiana","dahianaalzate24@gmail.com",32108399,"id36781223");

        Veterinario veterinario = new Veterinario("carlos",1098381928);


        cita.agregarEstudianteCurso(propietario);
        cita.agregarMascotaCurso(mascota);

        System.out.println(cita.toString());
        System.out.println(mascota.toString());
        System.out.println(veterinario.toString());
        System.out.println(propietario.toString());

    }
}