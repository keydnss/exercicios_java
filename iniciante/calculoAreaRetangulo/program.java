package calculoAreaRetangulo;
import calculoAreaRetangulo.retangulo;

import java.util.Scanner;

public class program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        retangulo retangulo;
        retangulo = new retangulo();

        System.out.println("Informe a altura do retângulo:");
        retangulo.altura = sc.nextDouble();
        System.out.println("Informe a largura do retângulo:");
        retangulo.largura = sc.nextDouble();

        double areaRetangulo = retangulo.area();

        System.out.println("A área do retângulo é: "+retangulo.area());

    }
}
