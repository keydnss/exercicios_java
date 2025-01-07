package entities;

public class User {

    //Attributes
    private int id;
    private String name;
    private double firstDp;

    //Constructors
    public User(int id, String nome, double firstDp) {
        this.id = id;
        this.name = nome;
        this.firstDp = firstDp;
    }
    public User(int id, String nome) {
        this.id = id;
        this.name = nome;
    }

    //Methods
    public void deposit(double value){
        firstDp += value;
    }
    public void withdraw(double value){
        firstDp = (firstDp -= value) - 5;
    }

    //Getters
    public int getId() {
        return id;
    }
    public String getNome() {
        return name;
    }
    public double getFirstDp() {
        return firstDp;
    }

    //Setters
    public void setNome(String nome) {
        this.name = nome;
    }
    public void setFirstDp(double firstDp) {
        this.firstDp = firstDp;
    }

    //ToString
    public String toString() {
        return "Account "
                + id
                + ", Holder: "
                + name
                + ", Balance: $ "
                + String.format("%.2f", firstDp);
    }

}
