package promoverFuncionario;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Funcionario f1 = new Funcionario("João","Faxineiro",1500);

        System.out.println("Exibindo as informações inicias do funcionario:");
        System.out.println("Nome: "+f1.nome);
        System.out.println("Cargo: "+f1.cargo);;
        System.out.println("Salário: "+f1.getSalario());

        System.out.println("\nAlterar o salário e cargo do funcionário\n");
        f1.setSalario(4500);
        f1.promover("Diretor",500);

        System.out.println("Exibindo as informações após as alterações:");
        System.out.println("Nome: "+f1.nome);
        System.out.println("Cargo: "+f1.cargo);;
        System.out.println("Salário: "+f1.getSalario());

    }
}
