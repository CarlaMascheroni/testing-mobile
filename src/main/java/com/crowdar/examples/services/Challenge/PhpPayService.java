package com.crowdar.examples.services.Challenge;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.Challenge.PhpHomeConstants;
import com.crowdar.examples.constants.Challenge.PhpPayConstants;

import javax.swing.plaf.basic.BasicSliderUI;

public class PhpPayService extends MobileActionManager {
    public static void formaDePagoPayNow(){
        click(PhpPayConstants.BTN_PAY_NOW_XPATH);
    }
    public static void formaDePagoPayOnArriva(){
        click(PhpPayConstants.BTN_PAY_ON_ARRIVA_XPATH);
    }

   public static void credidCard(){
        click(PhpPayConstants.COOKIE_MENSAJE_XPATH);
       scrollIOS(PhpPayConstants.SCROLL_PAY_BY_XPATH);
       click(PhpPayConstants.OP_CREDI_CARD_XPATH);
   }
}
