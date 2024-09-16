package aparelhosEletronicos;

public class smartphone extends aparelhoEletrônico{

    public void fazerChamada(){
        if(ativar) {
            System.out.println(nome + " está fazendo uma chamada.");
        }
    }

    public smartphone(String nome, boolean ativar){
        this.nome = nome;
        this.ativar = ativar;
    }
}
