package application;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("How many numbers will you enter?:");
        n = sc.nextInt();

        int[] vect = new int[n];

        for(int i = 0; i < n; i++){
            System.out.printf("Enter the number %d: ", i+1);
            vect[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Negative numbers:");
        for(int i = 0; i < n; i++){
            if(vect[i] < 0){
                System.out.println(vect[i]);
            }
        }

    }
}