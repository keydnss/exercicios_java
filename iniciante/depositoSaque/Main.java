package depositoSaque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Conta conta1;

        System.out.println("Insira o número da conta: ");
        int number = sc.nextInt();
        System.out.println("Insira o nome do titular: ");
        sc.nextLine();
        String nome = sc.nextLine();
        System.out.println("Tem depósito inicial (y/n)?");
        char resposta = sc.next().charAt(0);
            if(resposta == 'y'){
                System.out.println("Insira o valor do depósito inicial: ");
                double valor = sc.nextDouble();
                conta1 = new Conta(number,nome,valor);
            } else {
                conta1 = new Conta(number,nome);
            }

        System.out.println();
        System.out.println("Informações da conta:");
        System.out.println(conta1);

        System.out.println();
        System.out.println("Insira um valor para o depósito: ");
        double valorDeposito = sc.nextDouble();
        conta1.deposito(valorDeposito);

        System.out.println();
        System.out.println("Informações da conta atualizadas: ");
        System.out.println(conta1);

        System.out.println();
        System.out.println("Insira um valor para o saque: ");
        double valorSaque = sc.nextDouble();
        conta1.saque(valorSaque);

        System.out.println();
        System.out.println("Informações da conta atualizadas: ");
        System.out.println(conta1);

    }
}
