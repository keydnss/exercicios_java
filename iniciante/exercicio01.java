//Calculando a área de um trapézio

public class exercicio01{
    public static void main(String[] args){
        int b,B,h;
        float area;
        b = 5;
        B = 4;
        h = 5;
        area = (float) (b+B)/2*h;

        System.out.printf("Um trapézio com os valores:\nB = 8.0m\nb = 6.0m\nh = 5.0m\nPossui uma área de: %.2f", area);

    }
}
