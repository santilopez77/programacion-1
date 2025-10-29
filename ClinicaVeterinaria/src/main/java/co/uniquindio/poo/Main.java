package co.uniquindio.poo;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

            ClinicaVeterinaria clinicaVeterinaria = new ClinicaVeterinaria("AB123", "Amigos Peludos", "Calle 2N - 18-144", "+573100000");
            int opcion = -1;

            while (opcion != 0) {
                System.out.println("\n -- Menu interactivo clinica --");
                System.out.println("1. Registrar propietario");
                System.out.println("2. Registrar veterinario");
                System.out.println("3. Registrar mascota");
                System.out.println("4. Agendar cita");
                System.out.println("5. Mostrar citas");
                System.out.println("0. Salir");

                System.out.println("\n Ingrese la opción que desea realizar: ");
                opcion = scanner.nextInt();
                scanner.nextLine().trim();

                if (opcion == 1) {
                    registrarPropietario(clinicaVeterinaria);
                } else if (opcion == 2) {
                    registrarVeterinario(clinicaVeterinaria);
                } else if (opcion == 3) {
                    registrarMascota(clinicaVeterinaria);
                } else if (opcion == 4) {
                    asignarCita(clinicaVeterinaria);
                } else if (opcion == 5) {
                    mostrarCita(clinicaVeterinaria);
                } else if (opcion == 0) {
                    System.out.println("CHAO MUCHACHOS.....");
                } else {
                    System.out.println("Opción invalido");
                }
            }
            scanner.close();
        }

        public static void registrarVeterinario (ClinicaVeterinaria clinicaVeterinaria){
            System.out.println("Ingrese el nombre del veterinario");
            String nombre = scanner.nextLine();

            System.out.println("Ingrese la cedula del veterinario");
            String cedula = scanner.nextLine();

            System.out.println("Ingrese el telefono del veterinario");
            String telefono = scanner.nextLine();

            Veterinario veterinario = new Veterinario(nombre, cedula, telefono);

            clinicaVeterinaria.registrarVeterinario(veterinario);

            System.out.println("Veterinario registrado - OK");

        }

        public static void registrarPropietario (ClinicaVeterinaria clinicaVeterinaria){
            System.out.println("Ingrese el nombre del propietario: ");
            String nombre = scanner.nextLine().trim();

            System.out.println("Ingrese la cedula del propietario: ");
            String cedula = scanner.nextLine().trim();

            System.out.println("Ingrese el telefono del propietario: ");
            String telefono = scanner.nextLine().trim();

            Propietario propietario = new Propietario(nombre, cedula, telefono);

            clinicaVeterinaria.registrarPropietario(propietario);
            System.out.println("Propietario registrado - OK");
        }

        public static void registrarMascota (ClinicaVeterinaria clinicaVeterinaria){

            System.out.println("Ingrese el nombre de la mascota: ");
            String nombre = scanner.nextLine().trim();

            System.out.println("Ingrese la raza de la mascota: ");
            String raza = scanner.nextLine().trim();

            System.out.println("Ingrese el id de la mascota : ");
            int identificacion = scanner.nextInt();
            scanner.nextLine();


            System.out.println("Ingrese el nombre del propietario: ");
            String nombreProp = scanner.nextLine().trim();

            System.out.println("Ingrese la cédula del propietario: ");
            String cedula = scanner.nextLine().trim();

            System.out.println("Ingrese el teléfono del propietario: ");
            String telefono = scanner.nextLine().trim();


            Propietario propietario = new Propietario(nombreProp, cedula, telefono);


            Mascota mascota = new Mascota(nombre, raza, identificacion, propietario);

            
            clinicaVeterinaria.registrarMascota(mascota);

            System.out.println("Mascota registrada con propietario - OK");


        }
            //
        public static void asignarCita (ClinicaVeterinaria clinicaVeterinaria){
            System.out.println("Ingrese la fecha de la cita: ");
            String fecha = scanner.nextLine().trim();

            System.out.println("Ingrese la hora de la cita : ");
            String hora = scanner.nextLine().trim();

            System.out.println("Ingrese la mascota para la cita: ");
            Mascota theMascota = null;

            System.out.println("Ingrese el veterinario para la cita: ");
            Veterinario theVeterinario = null;

            Cita cita = new Cita(fecha,hora,theMascota,theVeterinario);

            clinicaVeterinaria.registrarVeterinario(theVeterinario);

            clinicaVeterinaria.registrarMascota(theMascota);

            System.out.println("cita asignada - OK");



        }

        public static void mostrarCita (ClinicaVeterinaria clinicaVeterinaria){

        }


    }





