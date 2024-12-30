package aplication;
import util.CurrencyConvertor;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("What is the dollar price?");
        double dollar = sc.nextDouble();
        dollar = CurrencyConvertor.withIOF(dollar);
        System.out.println("How many dollars will be bought?");
        double bought = sc.nextDouble();
        double amount = CurrencyConvertor.dollarConvertor(dollar, bought);
        System.out.println("Amount to be paided in reais = "+ amount);

    }
}