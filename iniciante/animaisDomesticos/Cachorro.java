package animaisDomesticos;

public class Cachorro extends Animal {

    @Override
    public void emitirSom(){
        System.out.println(nome+" está latindo");
    }

    public void abanarRabo(){
        System.out.println(nome+" está abanando o rabo");
    }

}
