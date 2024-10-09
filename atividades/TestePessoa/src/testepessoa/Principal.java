package testepessoa;

public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Jose", 20, 1.70);
        Pessoa pessoa2 = new Pessoa("Maria", 23, 1.65);
        Pessoa pessoa3 = new Pessoa("Pedro", 50, 1.67);
        
        pessoa1.exibirInformacoes();
        pessoa2.exibirInformacoes();
        pessoa3.exibirInformacoes();
    }
    
}
