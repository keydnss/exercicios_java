package animaisDomesticos;

public class Gato extends Animal{

    @Override
    public void emitirSom(){
        System.out.println(nome+" está miando");
    }

    public void arranhar(){
        System.out.println(nome+" está arranhando o sofá");
    }

}
