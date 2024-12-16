package entidades;

public class Produto {

    public String nome;
    public double preco;
    public int quantidade;

    public double totalNoEstoque(){
        return preco*quantidade;
    }

    public void adicionarEstoque(int quantidade){
        this.quantidade += quantidade;
    }

    public void removerEstoque(int quantidade){
        this.quantidade -= quantidade;
    }

    public String toString(){
        return nome
                + ", $"
                + String.format("%.2f", preco)
                + ", "
                + quantidade
                + " unidades, Total: $"
                + String.format("%.2f", totalNoEstoque());
    }

}
