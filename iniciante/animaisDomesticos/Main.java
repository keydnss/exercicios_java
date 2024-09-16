package animaisDomesticos;

public class Main{
    public static void main(String[] args){
        Cachorro dog1 = new Cachorro();
        Gato cat1 = new Gato();

        dog1.nome = "Burce";
        cat1.nome = "Misty";

        dog1.emitirSom();
        cat1.emitirSom();

        System.out.println(" ");

        dog1.abanarRabo();
        cat1.arranhar();
    }
}
