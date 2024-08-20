//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

import java.util.Scanner;
public class exercicio05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int peça1;
        int quantidade1;
        double valor1;
        int peça2;
        int quantidade2;
        double valor2;
        double valortotal;

        System.out.println("Insira o código da primeira peça:");
        peça1 = sc.nextInt();
        System.out.println("Insira a quantiadde de peças 1:");
        quantidade1 = sc.nextInt();
        System.out.println("Insira o valor da peça 1:");
        valor1 = sc.nextDouble();

        System.out.println("Insira o código da segunda peça:");
        peça2 = sc.nextInt();
        System.out.println("Insira a quantiadde de peças 2:");
        quantidade2 = sc.nextInt();
        System.out.println("Insira o valor da peça 2:");
        valor2 = sc.nextDouble();

        valortotal = (quantidade1*valor1)+(quantidade2*valor2);

        System.out.printf("O preço do carrinho é: R$%.2f", valortotal);

    }
}
