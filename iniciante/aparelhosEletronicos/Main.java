package aparelhosEletronicos;

public class Main{
    public static void main(String[] args){
        smartphone iPhone = new smartphone("iPhone", false);
        tablet Samsung = new tablet("Samsung", false);

        iPhone.ligar();
        Samsung.ligar();
        iPhone.fazerChamada();
        Samsung.abrirAplicativo();

    }
}