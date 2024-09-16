package gerenciaFuncionarios;
public class Main{
    public static void main(String[] args){
        Gerente gerente1 = new Gerente("João",35,105000);
        Programador programador1 = new Programador("Elias",25,64000);

        gerente1.exibirDetalhes();
        gerente1.calcularSalario();
        System.out.println(" ");
        programador1.exibirDetalhes();
        programador1.calcularSalario();

    }
}