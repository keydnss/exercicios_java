import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("How many rooms will be rented?");
        n = sc.nextInt();

        int rooms[] = new int[10];
        String names[] = new String[n];
        String emails[] = new String[n];

        for(int i = 0; i < n; i++){
            System.out.println("Rent #"+(i+1)+":");
            System.out.print("Name: ");
            sc.nextLine();
            names[i] = sc.nextLine();
            System.out.print("Email: ");
            emails[i] = sc.nextLine();
            System.out.print("Room: ");
            rooms[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Busy rooms:");
        for(int i = 0; i < n; i++){
            if(names[i] != null){
                System.out.println(rooms[i]+": "+names[i]+", "+emails[i]);
            }
        }
    }
}