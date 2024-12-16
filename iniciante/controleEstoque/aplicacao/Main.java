package aplicacao;

import entidades.Produto;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Produto produto = new Produto();
        System.out.println("Descreva o Produto: ");
        System.out.print("Nome: ");
        produto.nome = sc.nextLine();
        System.out.print("Preço: ");
        produto.preco = sc.nextDouble();
        System.out.print("Quantidade: ");
        produto.quantidade = sc.nextInt();

        System.out.println();
        System.out.println("Produto: "+produto);

        System.out.println();
        System.out.print("Adicione o número de produtos a ser adicionado no estoque:");
        int quantidade = sc.nextInt();
        produto.adicionarEstoque(quantidade);
        System.out.println("Produto atualizado: "+produto);

        System.out.println();
        System.out.print("Adicione o número de produtos a ser removido no estoque:");
        quantidade = sc.nextInt();
        produto.removerEstoque(quantidade);
        System.out.println("Produto atualizado: "+produto);


        sc.close();
    }
}