package com.crowdar.examples.services.Booking;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.Booking.HomeBookingConstants;

public class BookingHomeService extends MobileActionManager {
    public static void goHome(){
        isPresent(HomeBookingConstants.BANNER_HOME_XPATH);
    }

    public static void insertDestino(String destino){
        click(HomeBookingConstants.INPUT_DESTINO_XPATH);
        setInput(HomeBookingConstants.SEARCH_DESTINO_XPATH, destino);
        waitVisibility(HomeBookingConstants.SELECT_DESTINO_XPATH);
        click(HomeBookingConstants.SELECT_DESTINO_XPATH);
    }

    public static void insertFecha(){
       // click(HomeBookingConstants.INPUT_FECHA_XPATH);
        click(HomeBookingConstants.SELECT_FECHA_IDA_XPATH);
        click(HomeBookingConstants.SELECT_FECHA_VUELTA_XPATH);
        click(HomeBookingConstants.BTN_CONFIRM_FECHA_ID);
    }

    public static void insertAdultsHabit(){
        click(HomeBookingConstants.INPUT_ADULTSHABI_ID);
        click(HomeBookingConstants.BTN_MAS_HABI_XPATH);
        click(HomeBookingConstants.BTN_CONFIRM_ID);

    }

    public static void buscar(){
        click(HomeBookingConstants.HOMEBUSCAR);
    }




}
