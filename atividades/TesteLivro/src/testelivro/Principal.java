package testelivro;

public class Principal {

    public static void main(String[] args) {
        Livro livro1 = new Livro("O Alquimista", "Paulo", 40);
        Livro livro2 = new Livro("Dom Casmurro", "Machado de Assis", 30);
        Livro livro3 = new Livro("1984", "George Orwell", 50);
        
        livro1.exibirInformacoes();
        livro1.aplicarDesconto(10);
        
        livro2.exibirInformacoes();
        livro2.exibirInformacoes();
        
        livro3.exibirInformacoes();
        livro3.aplicarDesconto(5);
    }
    
}
