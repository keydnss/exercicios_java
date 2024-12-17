package aplicacao;
import entidades.Retangulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();

        System.out.print("Determine a altura do retângulo: ");
        retangulo.altura = sc.nextDouble();
        System.out.print("Determine a largura do retângulo: ");
        retangulo.largura = sc.nextDouble();
        System.out.println();

        double area = retangulo.Area();
        double perimetro = retangulo.Perimetro();
        double diagonal = retangulo.Diagonal();

        System.out.println("Área: " + area);
        System.out.println("Perimetro: " + perimetro);
        System.out.println("Diagonal: " + diagonal);

    }
}