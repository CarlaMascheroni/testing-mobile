Feature: El usuario realiza la reserva  en la App Booking


  Scenario Outline: Realizar reserva de un Hotel en la app Booking
    Given El usuario se encuentra en la home
    And Completa el formulario con sus requerimientos '<destino>'
    And selecciona un Hotel
    When seleciona una habitacion para reservar

    Examples:
      | destino |
      | Mendoza |