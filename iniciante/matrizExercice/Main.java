import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Determine o número de linhas: ");
        int n = sc.nextInt();
        System.out.println("Determine o número de colunas: ");
        int m = sc.nextInt();

        int mn[][] = new int[n][m];

        System.out.println("Monte a matriz: ");
            for (int i = 0; i < mn.length; i++) {
                for (int j = 0; j < mn[i].length; j++) {
                    mn[i][j] = sc.nextInt();
                }
            }

        System.out.println("Informe um número da matriz: ");
        int x = sc.nextInt();

        for(int i = 0; i < mn.length; i++) {
            for(int j = 0; j < mn[i].length; j++) {
                if (mn[i][j] == x) {
                    System.out.println("Position " + i + ", " + j + ": ");
                    if(j>0) {
                        System.out.println("Left: " + mn[i][j - 1]);
                    }
                    if(j<mn[i].length-1) {
                        System.out.println("Right: " + mn[i][j + 1]);
                    }
                    if(i>0) {
                        System.out.println("Up: " + mn[i - 1][j]);
                    }
                    if(i<mn.length-1) {
                        System.out.println("Down: " + mn[i + 1][j]);
                    }
                }
            }
        }

    }
}