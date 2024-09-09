package salarioDesconto;

public class salario {

    public String nome;
    public float  salarioBruto;
    public float imposto;
    float porcentagem;

    public float salarioLiquido(){
        return salarioBruto-imposto;
    }

    public float desconto(){
        return (salarioBruto+((porcentagem/100)*salarioBruto))-imposto;
    }

}

