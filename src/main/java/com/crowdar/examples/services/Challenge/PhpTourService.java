package com.crowdar.examples.services.Challenge;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.Challenge.PhpToursConstants;

public class PhpTourService extends MobileActionManager {
    public static void completedTourDetails(){
         waitClickable(PhpToursConstants.IMPUT_LOCATION_XPATH);
        click(PhpToursConstants.IMPUT_LOCATION_XPATH);
         waitInvisibility(PhpToursConstants.SELEC_LOCATION_XPATH);
        setInput(PhpToursConstants.SELEC_LOCATION_XPATH, "cairo");
        click(PhpToursConstants.TOUR_SEARCH_XPATH);
    }
    public static void selecDate(){
        click(PhpToursConstants.DEPARTURE_IMPUT_XPATH);
        click(PhpToursConstants.BTN_NEXT_MONTH_XPATH);
        click(PhpToursConstants.DATE_XPATH);
        click(PhpToursConstants.BTN_OK_XPATH);
    }

    public static void tourTypes(){
      click(PhpToursConstants.IMPUT_TYPE_XPATH);
      click(PhpToursConstants.SELEC_TYPE_XPATH);

    }

    public static void cantAdults(){
        click(PhpToursConstants.IMPUT_ADULTS_XPATH);
        click(PhpToursConstants.SELEC_ADULTS_XPATH);
    }

    public static void searchTour(){
        click(PhpToursConstants.BTN_SEARCH_XPATH);
    }

    public static void selecListadoTour(){
        click(PhpToursConstants.OP_LISTADO_TOUR_XPATH);
    }

}
