package gerenciamentoDeCursos;

public class Curso {

    public String titulo;
    private int duracaoHoras;
    private int vagasDisponiveis;

    public Curso(String titulo, int duracaoHoras, int vagasDisponiveis){
        this.titulo = titulo;
        this.duracaoHoras = duracaoHoras;
        this.vagasDisponiveis = vagasDisponiveis;
    }

    public void matricularAluno(){
        vagasDisponiveis -= 1;
    }

    public void cancelarMatricula(){
        vagasDisponiveis += 1;
    }

    public void exibirInformacoes(){
        System.out.println("Título: "+titulo);
        System.out.println("CargaHorária: "+duracaoHoras);
        System.out.println("Vagas: "+vagasDisponiveis);
    }

}
