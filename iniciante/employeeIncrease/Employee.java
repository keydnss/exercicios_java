public class Employee {
    private int ID;
    private String Name;
    private double Salary;

    public Employee(int ID, String name, double salary) {
        this.ID = ID;
        Name = name;
        Salary = salary;
    }

    public void increaseSalary(double percentage){
        Salary = (percentage/100+1)*Salary;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public double getSalary() {
        return Salary;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public String toString() {
        return ID + ", " + Name + ", " + String.format("%.2f", Salary);
    }

}
