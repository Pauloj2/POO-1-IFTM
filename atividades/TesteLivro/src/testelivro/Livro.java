package testelivro;

public class Livro {

    private String titulo;
    private String autor;
    private double preco;
    
    public Livro(String titulo, String autor, double preco){
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }
    
    public void exibirInformacoes(){
        System.out.println("Titulo: " + this.titulo + " Autor: " + this.autor);
        System.out.println("Valor: " + this.preco);
    }
    
    public void aplicarDesconto(double percentual){
        double desconto = this.preco * (percentual / 100);
        this.preco -= desconto;
        System.out.println("Valor apos o desconto: R$ " + this.preco);
    }
            
}
