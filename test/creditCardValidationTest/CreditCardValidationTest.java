package creditCardValidationTest;
import creditCard.CreditCard;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CreditCardValidationTest {
    CreditCard creditCard;
    //CreditCard creditCard1;
    @BeforeEach
    void alwaysDoThisFirst(){
        creditCard = new CreditCard(4388576018402626L);  //();
        //
    }
@Test
    void testThatCreditCardExists(){
    assertNotNull(creditCard);
}
    @Test
    void testForSumOfDoubleOfEvenPlaceNumber(){
        int sumOfDoubleOfEvenPlaceCardNumbers = creditCard.getDoubledSumOfEverySecondDigit();
        assertEquals(37, sumOfDoubleOfEvenPlaceCardNumbers);
    }
    @Test
    void testForSumOfOddPlaceCardNumbers(){
        int sumOffOddPlaceCardNumbers = creditCard.getSumOfOddPlacedDigits();
        assertEquals(38, sumOffOddPlaceCardNumbers);
    }
    @Test
    void testForSumOfDoubleOfEvenPlaceNumberAndOddPlaceCardNumbers(){
        int sumOfDoubleOfEvenPlaceNumberAndOddPlaceCardNumbers = creditCard.getSum();
        assertEquals(75, sumOfDoubleOfEvenPlaceNumberAndOddPlaceCardNumbers);
    }
    @Test
    void testThatCardIsInvalid(){
        boolean theCardIsInvalid = creditCard.isDivisibleByTen();
        assertFalse(theCardIsInvalid);
    }
    @Test
    void testThatCardIsValid(){
        CreditCard creditCard1 = new CreditCard(4388576018410707L);
        boolean theCardIsValid = creditCard1.isDivisibleByTen();
        assertTrue(theCardIsValid);

    }
}
