package sistemaDeTransporte;
public class Main{
    public static void main(String[] args){
        Onibus busao = new Onibus("busao");
        Trem trem = new Trem("trem");

        busao.Mover();
        busao.pararEmPonto();
        System.out.println(" ");
        trem.Mover();
        trem.abrirPorta();

    }
}