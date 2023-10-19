package com.crowdar.examples.services.Challenge;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.Challenge.PhpDetallesReservaConstants;

public class PhpDetallesReservService extends MobileActionManager {
    public static void cargaAdultos(){
        click(PhpDetallesReservaConstants.DROP_ADULT_XPATH);
        click(PhpDetallesReservaConstants.SELECT_ADULT_XPATH);
    }
    public static void cargaChilds(){
        click(PhpDetallesReservaConstants.DROP_CHILD_XPATH);
        click(PhpDetallesReservaConstants.SELECT_CHILD_XPATH);
    }
    public static void cargaInft(){
        click(PhpDetallesReservaConstants.DROP_INFT_XPATH);
        click(PhpDetallesReservaConstants.SELECT_INFT_XPATH);
    }
    public static void btnBook(){
        click(PhpDetallesReservaConstants.BTN_BOOK);

    }

}
