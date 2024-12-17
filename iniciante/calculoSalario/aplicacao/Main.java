package aplicacao;
import entidades.Funcionario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();

        System.out.print("Nome: ");
        funcionario.nome = sc.nextLine();
        System.out.print("Salário Bruto: ");
        funcionario.salarioBruto = sc.nextDouble();
        System.out.print("Imposto: ");
        funcionario.imposto = sc.nextDouble();
        System.out.println();
        funcionario.salarioLiquido();

        System.out.println("Funcionário: " + funcionario);
        System.out.println();

        System.out.print("Em qual porcentagem deseja aumentar o salário?: ");
        double porcentagem = sc.nextDouble();
        funcionario.salarioAumentado(porcentagem);
        funcionario.salarioLiquido();
        System.out.println();

        System.out.println("Funcionário atualizado: " + funcionario);

    }
}