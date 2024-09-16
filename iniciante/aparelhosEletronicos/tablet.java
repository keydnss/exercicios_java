package aparelhosEletronicos;

public class tablet extends aparelhoEletrônico {

    public void abrirAplicativo(){
        if(ativar) {
            System.out.println(nome + " está abrindo um aplicativo.");
        }
    }

    public tablet(String nome, boolean ativar){
        this.nome = nome;
        this.ativar = ativar;
    }

}
