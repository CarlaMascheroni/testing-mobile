Feature: El usuario realiza la reserva  de un Tour en la app de PHPTRAVELS


  Scenario Outline: Realizar reserva de un Tour en phptravels
    Given El usuario se encuentra en la home de la app
    When El usuario tapea la opcion Tours
    And El usuario completa los datos del Tour
    And el usurio tapea el boton Search
    When el usuario selecciona un tour del listado
    And El usuario ingresa los datos Adultos, ninios y bebes
    And el usuario tapea el boton book
    And  El usuario ingresa <firstName>,<lastName>,<email>,<number>,<address>
    And El usuario tapea en el Boton Proceed
    When El usuario selecciona la forma de pago
    And ingresa los datos de la tarjeta <firstNameCard>,<lastNameCard>,<cardNumber>,<cardMonth>,<cardYear>,<cvv>
    And tapea el boton PayNow
    Then verifica que la reserva se realizo con exitoEntrego
    Examples:
      | firstName | lastName   | email                     | number     | address      | firstNameCard | lastNameCard | cardNumber       | cardMonth | cardYear | cvv |
      | Carla     | Mascheroni | carlamascheroni@gmail.com | 3794862238 | santafe 1079 | Carla         | Mascheroni   | 4716987667646991 | 8         | 28       | 161 |