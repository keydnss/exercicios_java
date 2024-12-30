package aplicação;

import utilitaria.Calculador;

import java.util.Locale;
import java.util.Scanner;

public class Program{
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o raio: ");
        double raio = sc.nextDouble();

        double c = Calculador.circunferencia(raio);
        double v = Calculador.volume(raio);

        System.out.printf("Cincuferência: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("Valor do PI: %.2f%n", Calculador.PI);

        sc.close();
    }

}
