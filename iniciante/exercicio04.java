//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
//decimais.

import java.util.Scanner;
public class exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int horas;
        double porhora;
        double salario;

        System.out.println("Digite o numero do funcionário: ");
        numero = sc.nextInt();
        System.out.println("Digite as horas trabalhadas:");
        horas = sc.nextInt();
        System.out.println("Digite o valor ganho por hora: ");
        porhora = sc.nextDouble();

        salario = horas*porhora;

        System.out.println("\nNúmero do funcionário: "+numero);
        System.out.printf("Salário: R$%.2f", salario);

    }
}
