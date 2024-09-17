package gerenciamentoDeCursos;

public class Main {
    public static void main(String[] args){
        Curso curso1 = new Curso("Odontologia",5400,23);
        curso1.exibirInformacoes();
        curso1.matricularAluno();
        curso1.matricularAluno();
        curso1.cancelarMatricula();

        System.out.println("\n~Apos alteracoes~\n");

        curso1.exibirInformacoes();
    }
}
