//Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
//de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
//ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
//Se o ponto estiver na origem, escreva a mensagem “Origem”.
//Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
//situação.(A imagem é um gráfico cartesiano com quatro quadrantes. O eixo X é horizontal, e o eixo Y é vertical.
// Os quadrantes são marcados como Q2, Q1, Q3 e Q4 (Nessa exata ordem, da esquerda para direita e de cima para baixo),
// indicando as combinações positivas e negativas dos valores de X e Y.


import java.util.Scanner;
public class exercicio07 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double valorx;
        double valory;

        System.out.println("Informe o valor do ponto X no plano cartesiano:");
        valorx = sc.nextDouble();
        System.out.println("Informe o valor do ponto Y no plano cartesiano:");
        valory = sc.nextDouble();

        if(valorx>0&&valory>0){
            System.out.println("Esse ponto cartesiano se encontra na área Q1.");
        } else if (valorx<0&&valory<0) {
            System.out.println("Esse ponto cartesiano se encontra na área Q3.");
        } else if (valorx>0&&valory<0) {
            System.out.println("Esse ponto cartesiano se encontra na área Q4.");
        } else if (valorx<0&&valory>0) {
            System.out.println("Esse ponto cartesiano se encontra na área Q2.");
        } else if (valorx==0&&valory!=0) {
            System.out.println("Esse ponto cartesiano se encontra em cima do eixo X.");
        } else if (valorx!=0&&valory==0) {
            System.out.println("Esse ponto cartesiano se encontra em cima do eixo Y.");
        } else {
            System.out.println("Esse ponto cartesiano se encontra na origem.");
        }
    }
}
