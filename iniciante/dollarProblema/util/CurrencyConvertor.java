package util;

public class CurrencyConvertor {

    public static double withIOF(double dollar){
        return dollar * 1.06;
    }

    public static double dollarConvertor(double dollar,double bought){
        return bought * dollar;
    }

}
