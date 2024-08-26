//Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
//Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
//ordem crescente ou decrescente.

import java.util.Scanner;
public class exercicio06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A, B;

        System.out.println("Digite um número");
        A = sc.nextInt();
        System.out.println("Digite outro número");
        B = sc.nextInt();

        if(A%B==0||B%A==0){
            System.out.println("O número "+A+" e "+B+" são múltiplos entre si");
        }else{
            System.out.println("O número "+A+" e "+B+" não são múltiplos entre si");
        }
    }
}
