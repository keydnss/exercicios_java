package aplicacao;
import entidades.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Triangulo x, y;
        x = new Triangulo();
        y = new Triangulo();

        System.out.println("Insira as medidas do triângulo X:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Insira as medidas do triângulo Y:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double p = (x.a + x.b + x.c) / 2;
        double areaX = Math.sqrt( p * (p - x.a) * (p - x.b) * (p - x.c));

        p = (y.a + y.b + y.c) / 2;
        double areaY = Math.sqrt( p * (p - y.a) * (p - y.b) * (p - y.c));

        System.out.println("Área do triângulo X: " + areaX);
        System.out.println("Área do triângulo Y: " + areaY);

        if (areaX > areaY) {
            System.out.println("O triângulo X possui a maior área");
        }else{
            System.out.println("O triângulo Y possui a maior área");
        }

    }
}