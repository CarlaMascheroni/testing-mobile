package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.constants.Challenge.PhpDetailsCreditCardConstants;
import com.crowdar.examples.services.Challenge.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ChallengeSteps extends PageSteps {
    @Given("El usuario se encuentra en la home de la app")
    public void elUsuarioSeEncuentraEnLaHomeDeLaApp() {
        PhpHomeService.isViewLoaded();
    }

    @When("El usuario tapea la opcion Tours")
    public void elUsuarioTapeaLaOpcionTours() {
        PhpHomeService.goTour();
    }

    @And("El usuario completa los datos del Tour")
    public void elUsuarioCompletaLosDatosDelTour() {
        PhpTourService.completedTourDetails();
        PhpTourService.selecDate();
        PhpTourService.tourTypes();
       PhpTourService.cantAdults();
    }

    @And("el usurio tapea el boton Search")
    public void elUsurioTapeaElBotonSearch() {
        PhpTourService.searchTour();
    }

    @When("el usuario selecciona un tour del listado")
    public void elUsuarioSeleccionaUnTourDelListado() {
        PhpTourService.selecListadoTour();
    }

    @And("El usuario ingresa los datos Adultos, ninios y bebes")
    public void elUsuarioIngresaLosDatosAdultosNiniosYBebes() {
        PhpDetallesReservService.cargaAdultos();
        PhpDetallesReservService.cargaChilds();
        PhpDetallesReservService.cargaInft();
    }

    @And("el usuario tapea el boton book")
    public void elUsuarioTapeaElBotonBook() {
        PhpDetallesReservService.btnBook();
    }

    @Then("El usuario verrica que fue redireccionado a la pantalla de Formulario Guest")
    public void elUsuarioVerricaQueFueRedireccionadoALaPantallaDeFormularioGuest() {
    }

    @And("El usuario ingresa (.*),(.*),(.*),(.*),(.*)")
    public void elUsuarioIngresaNombreApellidoEmailCelularDireccion(String firstName, String lastName,String email, String number, String address) {
        PhpGuestService.completedDetailGuest(firstName, lastName, email, number, address);
    }

    @And("El usuario tapea en el Boton Proceed")
    public void elUsuarioTapeaEnElBotonProceed() {
        PhpGuestService.clickBtnProceed();
    }

    @When("El usuario selecciona la forma de pago")
    public void elUsuarioSeleccionaLaFormaDePago() {
        PhpPayService.formaDePagoPayNow();
        PhpPayService.credidCard();
    }

    @And("ingresa los datos de la tarjeta (.*),(.*),(.*),(.*),(.*),(.*)")
    public void ingresaLosDatosDeLaTarjetaFirstNameCardLastNameCardCardNumberCardMonthCardYearCvv(String firstNameCard, String lastNameCard, String cardNumber, String cardMonth, String cardYear, String cvv ) {
    PhpDetailsCreditCardService.detailsCreditCard(firstNameCard, lastNameCard, cardNumber, cardMonth, cardYear, cvv);
    }

    @And("tapea el boton PayNow")
    public void tapeaElBotonPayNow() {
        PhpDetailsCreditCardService.clickBotonComfirm();
    }


    @Then("verifica que la reserva se realizo con exito")
    public void verificaQueLaReservaSeRealizoConExito() {
        PhpDetailsCreditCardService.validator();
    }
}
