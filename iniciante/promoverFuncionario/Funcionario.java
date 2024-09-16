package promoverFuncionario;
public class Funcionario{

    String nome;
    String cargo;
    private double salario;

    public Funcionario(String nome,String cargo,double salario){
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario) {
        if(salario>0) {
            this.salario = salario;
        }else{
            System.out.println("O valor não pode ser negativo.");
        }
    }

    public void promover(String cargo,double salario){
        this.cargo = cargo;
        this.salario += salario;
    }

}
