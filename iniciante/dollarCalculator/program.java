package aprovarAluno;
import aprovarAluno.currencyConverter;

import java.util.Scanner;

public class program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Whats dollar price?");
        double dollarPrice = sc.nextDouble();
        System.out.println("How many dollars will be bought?");
        double dollarQuantity = sc.nextDouble();

        System.out.println("Amout to be paid in reais = "+currencyConverter.calculator(dollarPrice,dollarQuantity));

    }
}
