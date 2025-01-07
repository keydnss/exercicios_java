package aplication;
import entities.User;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Register
        System.out.println("Enter account number: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter account holder: ");
        String name = sc.nextLine();
        System.out.println("Is there na initial deposit? (y/n)");
        char yn = sc.next().charAt(0);
        double firstDp = 0;
            if(yn == 'y'){
                System.out.println("Enter the deposit amount: ");
                firstDp = sc.nextDouble();
            }

        //User operations
            User user = new User(id, name, firstDp);
            System.out.println("\nAccount data:\n" + user);
            System.out.println("\nEnter a deposit value: ");
            double deposit = sc.nextDouble();
            user.deposit(deposit);
            System.out.println("Updated account data:\n" + user);
            System.out.println("\nEnter a withdraw value: ");
            double withdraw = sc.nextDouble();
            user.withdraw(withdraw);
            System.out.println("Updated account data:\n" + user);

        }
    }