//Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
//seguir, calcule e mostre o valor da conta a pagar.
//
//CÓDIGO     ESPECIFICAÇÃO       PREÇO
//1          Cachorro Quente     R$ 4.00
//2          X-Salada            R$ 4.50
//3          X-Bacon             R$ 5.00
//4          Torrada simples     R$ 2.00
//5          Refrigerante        R$ 1.50

import java.util.Scanner;
public class exercicio08{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codigo;
        int quantidade;
        double[] precos = {4.0,4.5,5.0,2.0,1.5};

        System.out.println("Digite o codigo do produto: ");
        codigo = sc.nextInt();
        System.out.println("Digite o quantidade do produto: ");
        quantidade = sc.nextInt();

        if(codigo>0&&codigo<=5){
            double conta = precos[codigo-1]*quantidade;
            System.out.printf("O valor total da conta é R$%.2f",conta);
        }else {
            System.out.println("Insira um código válido.");
        }
        sc.close();
    }
}
