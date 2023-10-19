package com.crowdar.examples.services.Challenge;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.Challenge.PhpDetailsCreditCardConstants;
import org.testng.Assert;

public class PhpDetailsCreditCardService extends MobileActionManager {
    public static void detailsCreditCard(String firstNameCard, String lastNameCard, String cardNumber, String cardMonth, String cardYear, String cvv) {
        setInput(PhpDetailsCreditCardConstants.LABEL_FIRST_NAME_ID,firstNameCard);
        setInput(PhpDetailsCreditCardConstants.LABEL_LAST_NAME_ID,lastNameCard);
        setInput(PhpDetailsCreditCardConstants.LABEL_CARD_NUMBER_ID,cardNumber);
        clickOptionSpinner(PhpDetailsCreditCardConstants.SCROLL_MONTH_XPATH,cardMonth);
        clickOptionSpinner(PhpDetailsCreditCardConstants.SCROLL_YEAR_XPATH,cardYear);
        setInput(PhpDetailsCreditCardConstants.CVV_ID,cvv);
    }

    public static void clickBotonComfirm(){
        click(PhpDetailsCreditCardConstants.BTN_CONFIRM_PAY_XPATH);
    }

    public static void validator(){
        Assert.assertTrue(isVisible(PhpDetailsCreditCardConstants.TEXT_SUMMARY_XPATH));
    }
}