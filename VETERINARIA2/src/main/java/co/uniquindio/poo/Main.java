package co.uniquindio.poo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Veterinario veterinario1 = new Veterinario("juan",1098493);
        Veterinario veterinario2 = new Veterinario("maria",1098373);

        Mascota mascota1 = new Mascota("sjs123","eddy","golden retriever",21);
        Mascota mascota2 = new Mascota("sfs1432","case","golden retriever",5);
        Mascota mascota3 = new Mascota("sfja874","spike","golden retriever",9);
        Mascota mascota4 = new Mascota("sjs8363","manchas","golden retriever",11);

        Propietario propietario1 = new Propietario("mateo","jsakloen@gmail.com",6351772,"jaj123133");
        Propietario propietario2 = new Propietario("dahiana","jsakloen@gmail.com",7361423,"738281gf");

        Cita cita = new Cita("28/08/2025","armenia","adj3782",veterinario1,mascota3,propietario2);

        System.out.println(cita.toString());


    }
}