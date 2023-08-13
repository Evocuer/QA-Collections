package Servicio;

import Entidad.Reserva;
import Utils.TestAsker;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class HotelServicioTest {
    @Mock
    TestAsker mentiris;

    @InjectMocks
    HotelServicio hs;


    @Test
    void verificarRegistro() {
    }

    @Test
    void buscarPersona() {
    }

    @Test
    void crearPersona() {
    }

    @Test
    void actualizarInformacion() {
    }

    @Test
    void eliminarInformacion() {
    }

    @Test
    void listarHabitaciones() {
    }

    @Test
    @DisplayName("Test habitacion valida")
    void crearReserva() {
        //arrange
        when(mentiris.intAsk("Para cuantas personas la reserva?")).thenReturn(3);
        when(mentiris.stringAsk("Indique la fecha de ingreso MM/DD/AAAA")).thenReturn("09/10/2023");
        when(mentiris.stringAsk("Indique la fecha de egreso MM/DD/AAAA")).thenReturn("09/12/2023");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        Reserva expected = new Reserva("106",3, LocalDate.parse("09/10/2023",formatter),LocalDate.parse("09/12/2023",formatter));

        //act
        Reserva actual = hs.crearReserva();


        //assert
        assertEquals(expected.getHabitacion(), actual.getHabitacion());
        assertEquals(expected.getCantPersonas(),actual.getCantPersonas());
        assertEquals(expected.getFechaIngreso(),actual.getFechaIngreso());
        assertEquals(expected.getFechaEgreso(),actual.getFechaEgreso());

    }

    @Test
    @DisplayName("Prueba asignacion de habitacion")
    void returnHabitacionA() {
        //arrange
        int perRes = 2;
        String expected = "101";

        //act
        String actual = hs.returnHabitacion(perRes);


        //assert
        assertEquals(expected,actual);

    }

    @Test
    @DisplayName("Prueba asignacion de habitacion al fallo")
    void returnHabitacionB() {
        //arrange
        int perRes = 4;

        //act
        RuntimeException exception = assertThrows(RuntimeException.class,()->hs.returnHabitacion(perRes));

        //assert
        assertEquals(exception.getMessage(), "no disponible");
    }

}