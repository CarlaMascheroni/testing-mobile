package com.crowdar.examples.services.Booking;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.Booking.HotelBookingConstants;

public class HotelBookingService extends MobileActionManager {
    public static void hotelElegido(){
        click(HotelBookingConstants.SELECT_HOTEL_XPATH);
    }

    public static void hotelDisponible(){
        click(HotelBookingConstants.DISPONIBLE_HOTEL_XPATH);
    }
}
