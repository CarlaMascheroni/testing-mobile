package com.crowdar.examples.services.Challenge;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.Challenge.PhpGuestConstants;

public class PhpGuestService extends MobileActionManager {
    public static void completedDetailGuest(String firstName, String lastName,String email, String number, String address){
        setInput(PhpGuestConstants.LABEL_FRIST_NAME, firstName);
        setInput(PhpGuestConstants.LABEL_LAST_NAME, lastName);
        setInput(PhpGuestConstants.LABEL_EMAIL, email);
        setInput(PhpGuestConstants.LABEL_ADDRESS, number);
        setInput(PhpGuestConstants.LABEL_NUMBER, address);

    }
    public static void clickBtnProceed(){
        click(PhpGuestConstants.BTN_PROCEED);
    }


}
