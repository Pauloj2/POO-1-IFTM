package provaquestao1;

/**
 *
 * @author Paulo
 */
public class Livro {
    private String titulo;
    private String autor;
    private String genero;
    private double preco;
    
    /*Crie métodos getters e setters para cada atributo. Crie uma classe
    Principal para testar o programa com 2 objetos da classe Livro. Use os
    métodos setters para definir os valores dos atributos. Use os métodos
    getters para exibir os valores dos atributos.*/
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getTitulo(){
        return this.titulo;
    }
    
    public void setAutor(String autor){
        this.autor = autor;
    }
    public String getAutor(){
        return this.autor;
    }
    
    public void setGenero(String genero){
        this.genero = genero;
    }
    public String getGenero(){
        return this.genero;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    public double getpreco(){
        return this.preco;
    }
    
}
