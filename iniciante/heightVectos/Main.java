package application;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter the number of people: ");
        n = sc.nextInt();

        int[] people = new int[n];
        String[] names = new String[n];
        int[] ages = new int[n];
        double[] height = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("People "+(i+1)+" data:");
            System.out.print("Name: ");
            sc.nextLine();
            names[i] = sc.nextLine();
            System.out.print("Age: ");
            ages[i] = sc.nextInt();
            System.out.print("Height: ");
            height[i] = sc.nextDouble();
        }

        System.out.println();

        double amount = 0;
        for (int i = 0; i < n; i++) {
            amount += height[i];
        }

        double media = amount/n;
        System.out.printf("Average height: %.2f%n", media);

        double minors = 0;
        for (int i = 0; i < n; i++) {
            if(ages[i] < 16) {
               minors++;
            }
        }

        double minorsPercentage = (minors/n)*100;
        System.out.println("Minors percentage: "+minorsPercentage+"%");
        for (int i = 0; i < n; i++) {
            if(ages[i] < 16) {
                System.out.println(names[i]);
            }
        }
    }
}