package gerenciaFuncionarios;

public abstract class Funcionario {

    String nome;
    int idade;
    double anual;

    public abstract void calcularSalario();
    public abstract void exibirDetalhes();

}
