package com.crowdar.examples.services.Booking;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.Booking.HomeBookingConstants;
import com.crowdar.examples.constants.Booking.HotelBookingConstants;

public class BookingHabitacionService extends MobileActionManager {
    public static void selectHabitacion(){
        waitInvisibility(HotelBookingConstants.SELECT_HABITACION);
        click(HotelBookingConstants.SELECT_HABITACION);
        click(HotelBookingConstants.BTN_RESERVA);
    }
}
