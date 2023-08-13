package Entidad;

import java.time.LocalDate;
import java.util.UUID;

public class Reserva {

    private String ID;
    private String habitacion;
    private Integer cantPersonas;
    private LocalDate fechaIngreso;
    private LocalDate fechaEgreso;

    public Reserva() {
    }

    public Reserva(String habitacion, Integer cantPersonas, LocalDate fechaIngreso, LocalDate fechaEgreso) {
        this.ID = UUID.randomUUID().toString();
        this.habitacion = habitacion;
        this.cantPersonas = cantPersonas;
        this.fechaIngreso = fechaIngreso;
        this.fechaEgreso = fechaEgreso;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(String habitacion) {
        this.habitacion = habitacion;
    }

    public Integer getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(Integer cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public LocalDate getFechaEgreso() {
        return fechaEgreso;
    }

    public void setFechaEgreso(LocalDate fechaEgreso) {
        this.fechaEgreso = fechaEgreso;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "ID='" + ID + '\'' +
                ", habitacion='" + habitacion + '\'' +
                ", cantPersonas=" + cantPersonas +
                ", fechaIngreso=" + fechaIngreso +
                ", fechaEgreso=" + fechaEgreso +
                '}';
    }
}
