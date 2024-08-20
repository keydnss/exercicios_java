//Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
//casas decimais conforme exemplos.
//Fórmula da área: area = π . raio^2
//Considere o valor de π = 3.14159

import java.util.Scanner;
public class exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double raio;
        double pi = 3.141592653589793;
        double area;

        System.out.println("Informe o valor do raio:");
        raio = sc.nextDouble();
        area = pi*Math.pow(raio,2);

        System.out.printf("A área desse circulo é: %.2f", area);

    }
}
