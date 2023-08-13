package Utils;

import Entidad.Alojamiento;
import Entidad.Habitacion;
import Entidad.Persona;
import Entidad.Reserva;

import java.util.ArrayList;

public class Setup {

    protected ArrayList<Alojamiento> listaaloj = new ArrayList<>();
    protected ArrayList<Habitacion> listhab = new ArrayList<>();
    protected ArrayList<Persona> listper = new ArrayList<>();
    protected ArrayList<Reserva> listres = new ArrayList<>();

    public Setup() {

        Habitacion h1 = new Habitacion("101", 2, true);
        Habitacion h2 = new Habitacion("102", 2, true);
        Habitacion h3 = new Habitacion("103", 2, true);
        Habitacion h4 = new Habitacion("104", 2, true);
        Habitacion h5 = new Habitacion("105", 2, true);

        Habitacion h6 = new Habitacion("106", 3, true);
        Habitacion h7 = new Habitacion("107", 3, true);
        Habitacion h8 = new Habitacion("108", 3, true);

        Habitacion h9 = new Habitacion("109", 1, true);
        Habitacion h10 = new Habitacion("110", 1, true);

        listhab.add(h1);
        listhab.add(h2);
        listhab.add(h3);
        listhab.add(h4);
        listhab.add(h5);
        listhab.add(h6);
        listhab.add(h7);
        listhab.add(h8);
        listhab.add(h9);
        listhab.add(h10);

    }


}
