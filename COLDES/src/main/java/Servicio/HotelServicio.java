package Servicio;

import Entidad.Habitacion;
import Entidad.Persona;
import Entidad.Reserva;
import Utils.Setup;
import Utils.TestAsker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HotelServicio extends Setup {

    TestAsker leer;

    public HotelServicio(TestAsker leer) {
        this.leer = leer;
    }

    public String verificarRegistro() {

        String dni = leer.stringAsk("Ingrese su DNI");

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
        String nombre = leer.stringAsk("Ingresa el nombre completo");
        String nacionalidad = leer.stringAsk("Indique el pais de nacimiento");
        Integer edad = leer.intAsk("Indique la edad");

        p = new Persona(dni, nombre, nacionalidad, edad);
        listper.add(p);

    }

    public void actualizarInformacion(String dni) {

        for (Persona auxp: listper) {
            if (dni.equalsIgnoreCase(auxp.getDni())) {
                String nom = leer.stringAsk("Ingrese el nombre");
                auxp.setNombre(nom);
                String nac = leer.stringAsk("Ingrese la nacionalidad");
                auxp.setNacionalidad(nac);
                Integer edad = leer.intAsk("ingrese la edad");
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

    public Reserva crearReserva() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        Reserva r;

        int perRes = leer.intAsk("Para cuantas personas la reserva?");
        // TODO evaluar sistema de asignacion para reservasde mas de 3 personas
        String hab = returnHabitacion(perRes);
        LocalDate fechaIng = LocalDate.parse(leer.stringAsk("Indique la fecha de ingreso MM/DD/AAAA"), formatter);
        LocalDate fechaEgr = LocalDate.parse(leer.stringAsk("Indique la fecha de egreso MM/DD/AAAA"),formatter);

        r = new Reserva(hab, perRes, fechaIng, fechaEgr);
        listres.add(r);

        return r;
    }
    
    public String returnHabitacion(int perRes) {

        for (Habitacion auxH: listhab) {
            if (perRes == auxH.getCapacidad()){
                return auxH.getCodHab();
            }
        }
        throw new RuntimeException("no disponible");
    }


}
