package sistemaDeTransporte;

public class Onibus extends Transporte{

    public Onibus (String nome){
        this.nome = nome;
    }

    public void pararEmPonto(){
        System.out.println(nome+" está parando no ponto.");
    }

}
