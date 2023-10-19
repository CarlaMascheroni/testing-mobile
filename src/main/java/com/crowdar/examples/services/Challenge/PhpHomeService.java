package com.crowdar.examples.services.Challenge;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.Challenge.PhpHomeConstants;
import com.crowdar.examples.constants.Challenge.PhpToursConstants;
import org.testng.Assert;

public class PhpHomeService extends MobileActionManager{
    public static void isViewLoaded(){
        waitInvisibility(PhpHomeConstants.BTN_TOUR_XPATH);
    }

    public static void goTour(){
        click(PhpHomeConstants.BTN_TOUR_XPATH);
    }


}
