package provaquestao2;

/**
 *
 * @author Paulo
 */
public class Produto {
    private String nome;
    private String categoria;
    private double preco;
    private int quantidadeEmEstoque;
   
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
    public String getCategoria(){
        return this.categoria;
    }
    
    public void setPreco(double preco){
    /*adicione validações para garantir
    que os valores não sejam zero ou negativos. Caso seja enviado valores
    que não são aceitos, os valores default serão: 1 na variável*/
    if(preco <= 0){
        this.preco = 1;
    }else{
        this.preco = preco;
    }
    }
    public double getPreco(){
        return this.preco;
    }
    
    public void setQuantidadeEmEstoque(int quantidadeEmEstoque){
        if(quantidadeEmEstoque <= 0){
            this.quantidadeEmEstoque = 1;
        }else{
            this.quantidadeEmEstoque = quantidadeEmEstoque;
        }
    }
    public int getquantidadeEmEstoque(){
        return this.quantidadeEmEstoque;
    }
   
}
