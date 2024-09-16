package gerenciaFuncionarios;

public class Gerente extends Funcionario{

    public Gerente(String nome, int idade, double anual){
        this.nome = nome;
        this.idade = idade;
        this.anual = anual;
    }

    @Override
    public void calcularSalario(){
        double salario = anual/12;
        System.out.printf("seu salário é : %.2f\n",salario);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Anual: "+anual);
    }
}
