package contaBancária;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ContaBancaria conta1 = new ContaBancaria("Pedro","22345");
        ContaBancaria conta2 = new ContaBancaria("Maria","55967");
        conta1.depositar(5560);
        conta2.depositar(3405);

        System.out.println("Conta1");
        System.out.println("Titular: "+conta1.titular);
        System.out.println("Número da conta: "+conta1.numeroConta);
        System.out.println("Saldo: "+conta1.getSaldo());

        System.out.println(" ");

        System.out.println("Conta2");
        System.out.println("Titular: "+conta2.titular);
        System.out.println("Número da conta: "+conta2.numeroConta);
        System.out.println("Saldo: "+conta2.getSaldo());

        System.out.println(" ");

        conta1.desativaConta();
        conta1.transferir(conta2, 1000);

        System.out.println("\n~Após tentativa de transferência~\n");

        System.out.println("Saldo conta 1: "+conta1.getSaldo());
        System.out.println("Saldo conta 2: "+conta2.getSaldo());

        conta1.ativaConta();
        conta1.transferir(conta2, 1000);

        System.out.println("\n~Após tentativa de transferência~\n");

        System.out.println("Saldo conta 1: "+conta1.getSaldo());
        System.out.println("Saldo conta 2: "+conta2.getSaldo());

        System.out.println("\n~Tentando sacar de uma conta inativa~\n");

        conta2.desativaConta();
        conta2.sacar(500);

        System.out.println("\n~Exibindo saldo final da conta 2~\n");

        System.out.println("Saldo conta2: "+conta2.getSaldo());

    }
}
