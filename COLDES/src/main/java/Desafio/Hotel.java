package Desafio;

import Servicio.HotelServicio;
import Utils.TestAsker;

import java.util.Scanner;

public class Hotel {

    static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    static HotelServicio hs = new HotelServicio(new TestAsker(System.in,System.out));

    public static void main(String[] args) {

        System.out.println("=== BIENVENIDO AL HOTEL CALIFORNIA ===");
        String dni = hs.verificarRegistro();
        menuPrincipal(dni);

    }

    public static void menuPrincipal(String dni) {



        boolean flag = true;

        while (flag) {

            System.out.println("Que desea realizar?");
            System.out.println("1. Editar informacion personal");
            System.out.println("2. Habitaciones");
            System.out.println("3. Reservar");
            System.out.println("4. Alojamiento");
            System.out.println("5. Salir");
            int menuOut = leer.nextInt();
            switch (menuOut) {
                case 1 -> flag = menuPersona(dni);
                case 2 -> hs.listarHabitaciones();
                case 3 -> menuReservas();
            }
        }
    }

    public static boolean menuPersona(String dni) {

        do {
            System.out.println("Seleccione la opcion a realizar");
            System.out.println("1. Editar informacion");
            System.out.println("2. Eliminar informacion");
            System.out.println("3. Menu Anterior");
            int menuPerOut = leer.nextInt();
            switch (menuPerOut) {
                case 1 -> {hs.actualizarInformacion(dni); return true;}
                case 2 -> {return !hs.eliminarInformacion(dni);}
                case 3 -> {return true;}
                default -> System.out.println("Opcion invalida");
            }
        } while( true );
    }

    public static boolean menuReservas() {

        do {
            System.out.println("Seleccione la opcion a realizar");
            System.out.println("1. Crear Reserva");
            System.out.println("2. Editar Reserva");
            System.out.println("2. Eliminar Reseva");
            System.out.println("3. Menu Anterior");
            int menuPerOut = leer.nextInt();
            switch (menuPerOut) {
                case 1 -> hs.crearReserva();
            }
        } while( true );
    }



}
