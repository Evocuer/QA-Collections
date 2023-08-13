package Entidad;

import java.time.LocalDate;

public class Habitacion {

    private String codHab;
    private int capacidad;
    private boolean disponibilidad;

    public Habitacion() {
    }

    public Habitacion(String codHab, int capacidad, boolean disponibilidad) {
        this.codHab = codHab;
        this.capacidad = capacidad;
        this.disponibilidad = disponibilidad;
    }

    public String getCodHab() {
        return codHab;
    }

    public void setCodHab(String codHab) {
        this.codHab = codHab;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    @Override
    public String toString() {
        return "Habitacion{" +
                "codHab='" + codHab + '\'' +
                ", capacidad=" + capacidad +
                ", disponibilidad=" + disponibilidad +
                '}';
    }
}
