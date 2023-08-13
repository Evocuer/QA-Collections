package Servicio;

import Entidad.Habitacion;
import Entidad.Persona;
import Utils.Setup;

import java.util.Scanner;

public class HotelServicio extends Setup {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public String verificarRegistro() {

        System.out.println("Ingrese su DNI");
        String dni = leer.next();

            if (!buscarPersona(dni)) {
                crearPersona(dni);
            }
        return dni;
    }
    public boolean buscarPersona(String dni) {

        boolean dniExist = false;
        for (Persona auxp: listper) {
            if (dni.equalsIgnoreCase(auxp.getDni())){
                dniExist = true;
                break;
            }
        }
        return dniExist;
    }

    public void crearPersona(String dni) {

        Persona p;
        System.out.println("Ingresa el nombre completo");
        String nombre = leer.next();
        System.out.println("Indique el pais de nacimiento");
        String nacionalidad = leer.next();
        System.out.println("Indique la edad");
        Integer edad = leer.nextInt();

        p= new Persona(dni, nombre, nacionalidad, edad);
        listper.add(p);

    }

    public void actualizarInformacion(String dni) {

        for (Persona auxp: listper) {
            if (dni.equalsIgnoreCase(auxp.getDni())) {
                System.out.println("Ingrese el nombre");
                String nom = leer.next();
                auxp.setNombre(nom);
                System.out.println("Ingrese la nacionalidad");
                String nac = leer.next();
                auxp.setNacionalidad(nac);
                System.out.println("ingrese la edad");
                Integer edad = leer.nextInt();
                auxp.setEdad(edad);
            }
        }
    }

    public boolean eliminarInformacion(String dni) {

        return listper.removeIf(persona -> dni.equalsIgnoreCase(persona.getDni()));
    }


    public void listarHabitaciones() {

        for (Habitacion auxh: listhab) {
            System.out.println(auxh.toString());
        }

    }

    public void crearReserva() {

        System.out.println("Para cuantas personas la reserva?");
        int perRes = leer.nextInt();
        switch (perRes) {
            case 1: 
            
            
        }
        

    }
    
    public String returnHabitacion(int perRes) {

        for (:
             ) {
            
        }
        
    }

}
