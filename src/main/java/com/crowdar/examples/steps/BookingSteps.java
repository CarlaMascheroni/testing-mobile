package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.constants.Booking.HomeBookingConstants;
import com.crowdar.examples.services.Booking.BookingHabitacionService;
import com.crowdar.examples.services.Booking.BookingHomeService;
import com.crowdar.examples.services.Booking.HotelBookingService;
import com.crowdar.examples.services.Challenge.PhpHomeService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BookingSteps extends PageSteps {
    @Given("El usuario se encuentra en la home")
    public void elUsuarioSeEncuentraEnLaHome() {
        BookingHomeService.goHome();
    }

    @And("Completa el formulario con sus requerimientos (.*)")
    public void completaElFormularioConSusRequerimientos(String destino) {
        BookingHomeService.insertDestino(destino);
        BookingHomeService.insertFecha();
        BookingHomeService.insertAdultsHabit();
        BookingHomeService.buscar();
    }

    @And("selecciona un Hotel")
    public void seleccionaUnHotel() {
       HotelBookingService.hotelElegido();
       HotelBookingService.hotelDisponible();
    }

    @When("seleciona una habitacion para reservar")
    public void selecionaUnaHabitacionParaReservar() {
        BookingHabitacionService.selectHabitacion();
    }
}
