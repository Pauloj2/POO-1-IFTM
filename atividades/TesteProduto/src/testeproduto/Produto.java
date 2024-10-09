package testeproduto;

/**
 *
 * @author rodri
 */
public class Produto {
    private String nome;
    private double valor;
    private int quantidadeEstoque;
    
    public Produto(String nome, double valor, int quantidadeEstoque){
        this.nome = nome;
        this.valor = valor;
        this.quantidadeEstoque = quantidadeEstoque;       
    }
    
    public double calcularValorTotalEmEstoque(){
        return (quantidadeEstoque * valor);
    }
    public void vender(int quantidade){
        if(quantidade <= quantidadeEstoque){
            quantidadeEstoque -= quantidade;
            System.out.println("Venda de " + quantidade + " unidades realizada");
        }else{
            System.out.println("Quantidade insuficiente no estoque");
        }
    }
    public void exibirInformacoes(){
        System.out.println("Nome: " + nome + " Valor : R$ " + valor);
        System.out.println("Quantidade em estoque: " + quantidadeEstoque);
        System.out.println("Valor total em estoque: R$" + calcularValorTotalEmEstoque());
    }
}
