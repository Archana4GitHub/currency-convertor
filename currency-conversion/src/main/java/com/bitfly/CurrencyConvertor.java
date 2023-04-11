package com.bitfly;

import java.util.Scanner;


public class CurrencyConvertor {

    public static final double DOLLAR_TO_YEN = 130.90;
    public static final double YEN_TO_DOLLAR = (1 / DOLLAR_TO_YEN);
    public static int DOLLAR_TO_YEN_CONVERSION_TYPE = 0;
    public static int YEN_TO_DOLLAR_CONVERSION_TYPE = 1;

    public double yenToDollar(double fromCurrency){
        double toCurrency = 0d;
        toCurrency = fromCurrency * YEN_TO_DOLLAR;
        return toCurrency;
    }

    public double dollarToYen(double fromCurrency){
        double toCurrency = fromCurrency * DOLLAR_TO_YEN;
        return toCurrency;
    }

    public String isValidConversion(double amount , int currencyConversionType){
        if(amount <= 0 || !(currencyConversionType == DOLLAR_TO_YEN_CONVERSION_TYPE ||
                currencyConversionType ==  YEN_TO_DOLLAR_CONVERSION_TYPE))
            return "INVALID";
        else
            return "VALID";
    }

    public double fromToCurrencyConversion(double amount , int currencyConversionType) {
        if (isValidConversion(amount, currencyConversionType).equals("VALID")) {
            switch (currencyConversionType) {
                case 0:
                    return dollarToYen(amount);
                case 1:
                    return yenToDollar(amount);
                default:
                    return 0.0d;

            }
        }
        return 0.0d;
    }

/*
    public static void main(String[] args) {
        System.out.println("Enter amount for currency_conversion ");
        Scanner sc = new Scanner(System.in);
        double fromAmount = sc.nextDouble();
        CurrencyConvertor cc = new CurrencyConvertor();
        System.out.printf("Currency Conversion from %s Yen to USD \n",fromAmount);
        double convertedAmountYenToUSD = cc.yenToDollar(fromAmount);
        System.out.printf("Currency converted from %s Yen to  %s USD \n",fromAmount, convertedAmountYenToUSD);

        System.out.printf("Currency Conversion from %s USD to Yen \n",fromAmount);
        double convertedAmountUSDToYEN = cc.dollarToYen(fromAmount);
        System.out.printf("Currency converted from %s USD to  %s YEN \n",fromAmount, convertedAmountUSDToYEN);

        //Test using parameterized version
        double convertedAmount = cc.fromToCurrencyConversion(100, 0); //USD_TO_YEN = 0
        System.out.println("Currency USD 100 converted to yen equal to "+convertedAmount);
        convertedAmount = cc.fromToCurrencyConversion(100, 1); //YEN_TO_USD = 1
        System.out.println("Currency YEN 100 converted to USD equal to "+convertedAmount);

    }
*/
}

