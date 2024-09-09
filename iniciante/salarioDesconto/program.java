package salarioDesconto;
import salarioDesconto.salario;

import java.util.Scanner;

public class program {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        salario primeiro;
        primeiro = new salario();

        System.out.println("Informe o seu nome:");
        primeiro.nome = sc.nextLine();
        System.out.println("Informe o seu salário bruto:");
        primeiro.salarioBruto = sc.nextFloat();
        System.out.println("Informe o imposto:");
        primeiro.imposto = sc.nextFloat();

        System.out.printf("\nNome: %s\nSalário Bruto: %.2f\nImposto: %.2f",primeiro.nome,primeiro.salarioBruto,primeiro.imposto);
        System.out.printf("\n\nSalário Líquido: %.2f\n",primeiro.salarioLiquido());

        System.out.println("Qual porcentagem deseja adicionar ao salário?");
        primeiro.porcentagem = sc.nextFloat();

        System.out.printf("\nSalário atualizado: %.2f",primeiro.desconto());

    }
}
