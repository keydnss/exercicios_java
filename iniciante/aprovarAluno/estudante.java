package aprovarAluno;

public class estudante {

    String nome;
    float p1, p2, p3;
    float notaFinal;

    public void showNotaFinal(){
        notaFinal = p1+p2+p3;
        System.out.println(" ");
        System.out.println("Nota final: "+notaFinal);
    }

    public void avaliacao(){;
        if(notaFinal>60){
            System.out.println("Aluno aprovado!");
        } else {
            float pontosFaltando = 60-(notaFinal);
            System.out.println("Aluno reprovado.");
            System.out.println("Faltou "+pontosFaltando+" pontos para o aluno ser aprovado.");
        }
    }

}

