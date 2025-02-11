import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Employee> ids = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Employee #" + (i+1) + ":");
            System.out.print("ID: ");
            Integer id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            Employee emp = new Employee(id, name, salary);
            ids.add(emp);
        }

        System.out.println();
        System.out.println("Enter the employee id that will have salary increase: ");
        Integer idsalary = sc.nextInt();
        Integer pos = position(ids, idsalary);
        if(pos == -1) {
            System.out.println("Employee not found!");
        }
        else {
            System.out.println("Enter the percentage: ");
            Double percentage = sc.nextDouble();
            ids.get(pos).increaseSalary(percentage);
        }

        System.out.println();
        System.out.println("List of employees: ");
        for(Employee emp : ids) {
            System.out.println(emp);
        }

    }

    static int position(List<Employee> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getID() == id) {
                return i;
            }
        }
        return -1;
    }
}