package aprovarAluno;
import aprovarAluno.estudante;

import java.util.Scanner;

public class program {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        estudante aluno;
        aluno = new estudante();

        System.out.println("Informe o nome do aluno:");
        aluno.nome = sc.nextLine();
        System.out.println("Informe as 3 notas do aluno");
        aluno.p1 = sc.nextFloat();
        aluno.p2 = sc.nextFloat();
        aluno.p3 = sc.nextFloat();

        aluno.showNotaFinal();
        aluno.avaliacao();

    }
}
