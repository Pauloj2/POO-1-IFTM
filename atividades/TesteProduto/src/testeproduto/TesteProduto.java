package testeproduto;

public class TesteProduto {
    
    public static void main(String[] args) {
       Produto item1 = new Produto("Livro", 25.50, 3);
       Produto item2 = new Produto("Caderno", 18.90, 10);
       Produto item3 = new Produto("Lapis", 15.50, 5);
       
       item1.vender(1);
       item1.calcularValorTotalEmEstoque();
       item1.exibirInformacoes();
       
       item2.vender(2);
       item2.calcularValorTotalEmEstoque();
       item2.exibirInformacoes();
       
       item3.vender(2);
       item3.calcularValorTotalEmEstoque();
       item3.exibirInformacoes();
       
    }
    
}
