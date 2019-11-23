package pl.jkon.pp5.creditcard;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class CreditCardTest {

    public static final int INITIAL_LIMIT = 1000;

    @Test
    public void itAllowAssignLimitToCreditCard() {
        //  Arrange   //
        CreditCard CreditCard = new CreditCard();
        //  Act       //
        CreditCard.assignLimit(BigDecimal.valueOf(INITIAL_LIMIT));
        //  Assert    //
        Assert.assertEquals(BigDecimal.valueOf(INITIAL_LIMIT), CreditCard.limit());
    }
}
