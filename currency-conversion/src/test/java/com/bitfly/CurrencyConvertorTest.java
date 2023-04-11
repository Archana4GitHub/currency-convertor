package com.bitfly;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class CurrencyConvertorTest {

    static double DOLLAR_TO_YEN;
    static double YEN_TO_DOLLAR;

    @BeforeAll
    public static void setup(){
        System.out.println("Initialize the Exchange Rate");
        DOLLAR_TO_YEN = 130.90;
        YEN_TO_DOLLAR = (1 / DOLLAR_TO_YEN);
    }

    @Test
    public void givenAmount_whenConversion_yen_to_dollar_thenNotNull(){
        CurrencyConvertor cc = new CurrencyConvertor();
        double fromYenAmount =  100.0;
        double convertedToDollarAmount = fromYenAmount * YEN_TO_DOLLAR;
        assertEquals(convertedToDollarAmount, cc.yenToDollar(fromYenAmount));
        assertNotNull(cc.yenToDollar(fromYenAmount));
    }

    @Test
    public void givenAmount_whenConversion_dollar_to_yen_thenNotNull(){
        CurrencyConvertor cc = new CurrencyConvertor();
        double fromYenAmount =  100.0;
        double convertedToDollarAmount = fromYenAmount * DOLLAR_TO_YEN;
        assertEquals(convertedToDollarAmount, cc.dollarToYen(fromYenAmount));
        assertNotNull(cc.dollarToYen(fromYenAmount));
    }

    @Test
    public void givenAmountZero_whenConversion_yen_to_dollar_thenZero(){
        CurrencyConvertor cc = new CurrencyConvertor();
        double fromYenAmount =  0.0;
        double convertedToDollarAmount = fromYenAmount * YEN_TO_DOLLAR;
        assertEquals(convertedToDollarAmount, cc.yenToDollar(fromYenAmount));
        assertNotNull(cc.yenToDollar(fromYenAmount));
    }

    @Test
    public void givenAmountZero_whenConversion_dollar_to_yen_thenZero(){
        CurrencyConvertor cc = new CurrencyConvertor();
        double fromYenAmount =  0.0;
        double convertedToDollarAmount = fromYenAmount * DOLLAR_TO_YEN;
        assertEquals(convertedToDollarAmount, cc.dollarToYen(fromYenAmount));
        assertNotNull(cc.dollarToYen(fromYenAmount));
    }

    @Test
    public void givenAmount_whenConversion_yen_to_dollar_thenNull(){
        CurrencyConvertor cc = new CurrencyConvertor();
        double fromYenAmount =  100.0;
        double convertedToDollarAmount = fromYenAmount * YEN_TO_DOLLAR;
        assertEquals(convertedToDollarAmount, cc.yenToDollar(fromYenAmount));
        assertNotNull(cc.yenToDollar(fromYenAmount));
    }

    @Test
    public void givenAmount_whenConversion_dollar_to_yen_thenNull(){
        CurrencyConvertor cc = new CurrencyConvertor();
        double fromYenAmount =  100.0;
        double convertedToDollarAmount = fromYenAmount * DOLLAR_TO_YEN;
        assertEquals(convertedToDollarAmount, cc.dollarToYen(fromYenAmount));
        assertNotNull(cc.dollarToYen(fromYenAmount));
    }

    @Test
    public void givenConversionTypeIsDollarToYen_isValid(){
        CurrencyConvertor cc = new CurrencyConvertor();
        assertEquals("VALID", cc.isValidConversion(100,0));
    }

    @Test
    public void givenConversionTypeIsYenToDollar_isValid(){
        CurrencyConvertor cc = new CurrencyConvertor();
        assertEquals("VALID", cc.isValidConversion(100,1));
    }

    @Test
    public void givenConversionTypeIsDollarToYen_with_less_than_zero_amt_isInValid(){
        CurrencyConvertor cc = new CurrencyConvertor();
        assertEquals("INVALID", cc.isValidConversion(-10,0));
    }

    @Test
    public void givenConversionTypeIsYenToDollar_with_less_than_zero_amt_isValid(){
        CurrencyConvertor cc = new CurrencyConvertor();
        assertEquals("INVALID", cc.isValidConversion(-10,1));
    }


    @Test
    public void givenConversionTypeIsDollarToYen_with_zero_amt_isInValid(){
        CurrencyConvertor cc = new CurrencyConvertor();
        assertEquals("INVALID", cc.isValidConversion(0,0));
    }

    @Test
    public void givenConversionTypeIsYenToDollar_with_zero_amt__isInValid(){
        CurrencyConvertor cc = new CurrencyConvertor();
        assertEquals("INVALID", cc.isValidConversion(0,1));
    }


    @Test
    public void givenConversionTypeIsDollarToYen_with_minus_conversionType_isInValid(){
        CurrencyConvertor cc = new CurrencyConvertor();
        assertEquals("INVALID", cc.isValidConversion(100,-10));
    }

    @Test
    public void givenConversionTypeIsYenToDollar_with_plus_conversionType_isInValid(){
        CurrencyConvertor cc = new CurrencyConvertor();
        assertEquals("INVALID", cc.isValidConversion(100,10));
    }

    @Test
    public void givenConversionTypeIsDollarToYen_isInValid(){
        CurrencyConvertor cc = new CurrencyConvertor();
        assertEquals("INVALID", cc.isValidConversion(0,-10));
    }

    @Test
    public void givenConversionTypeIsYenToDollar_isInValid(){
        CurrencyConvertor cc = new CurrencyConvertor();
        assertEquals("INVALID", cc.isValidConversion(0,10));
    }

    @Test
    public void givenConversionTypeIsYenToDollar_with_more_than_zero_amt_isValid(){
        CurrencyConvertor cc = new CurrencyConvertor();
        String isValid = cc.isValidConversion(100,0);
        assertEquals("VALID", isValid);
        assertEquals(100* DOLLAR_TO_YEN, cc.fromToCurrencyConversion(100,0));
    }

    @Test
    public void givenConversionTypeIsDollarToYen_with_more_than_zero_amt_isValid(){
        CurrencyConvertor cc = new CurrencyConvertor();
        String isValid = cc.isValidConversion(100,0);
        assertEquals("VALID", isValid);
        assertEquals(100* DOLLAR_TO_YEN, cc.fromToCurrencyConversion(100,0));
    }

    @Test
    public void givenFromToCurrencyConversion_with_less_than_zero_amt_in_isInValid(){
        CurrencyConvertor cc = new CurrencyConvertor();
        String isValid = cc.isValidConversion(-10,0);
        assertEquals("INVALID", isValid);
        assertEquals(0.0d, cc.fromToCurrencyConversion(-10,0));
    }

    @Test
    public void givenFromToCurrencyConversion_with_invalid_conversionType_in_isInValid(){
        CurrencyConvertor cc = new CurrencyConvertor();
        String isValid = cc.isValidConversion(100,10);
        assertEquals("INVALID", isValid);
        assertEquals(0.0d, cc.fromToCurrencyConversion(100,10));
    }

}

