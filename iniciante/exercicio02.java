//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma mensagem explicativa

import java.util.Scanner;
public class exercicio02 {
    public static void main(String[] args) {
        int a;
        int b;
        int soma;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        a = sc.nextInt();
        System.out.println("Digite outro numero: ");
        b = sc.nextInt();

        soma = a + b;

        System.out.println("A Soma desses números é: "+soma);
    }
}
