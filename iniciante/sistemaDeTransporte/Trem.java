package sistemaDeTransporte;

public class Trem extends Transporte{

    public Trem (String nome){
        this.nome = nome;
    }

    public void abrirPorta(){
        System.out.println(nome+" está abrindo a porta");
    }

}
