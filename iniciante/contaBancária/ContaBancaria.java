package contaBancária;
public class ContaBancaria{
    String titular;
    String numeroConta;
    private double saldo;
    private boolean ativa;

    public String getTitular(){
        return titular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo(){
        return saldo;
    }

    public boolean getAtiva(){
        return ativa;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setAtiva(boolean ativa){
        this.ativa = ativa;
    }

    public ContaBancaria(String titular, String numeroConta){
        this.titular = titular;
        this.numeroConta = numeroConta;
    }

    public void depositar(double valor){
        if(valor>0) {
            this.saldo += valor;
        }else{
            System.out.println("Insira um valor válido.");
        }
    }

    public void sacar(double valor){
        if(valor>0 && this.ativa) {
            this.saldo -= valor;
        }else{
            System.out.println("Não foi possível realizar uma operação.");
        }
    }

    public void transferir(ContaBancaria contaDestino, double valor){
        if(valor>0) {
            if(valor<this.saldo && this.ativa) {
                this.saldo -= valor;
                contaDestino.saldo += valor;
            }
            else{
                System.out.println("Não foi possível realizaer a operação");
            }
        }
        else{
            System.out.println("Não foi possível realizar a operação");
        }
    }

    public void ativaConta(){
        this.ativa = true;
    }

    public void desativaConta(){
        this.ativa = false;
    }

}
