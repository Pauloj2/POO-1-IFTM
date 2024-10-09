package testefilme;

public class Principal {

    public static void main(String[] args) {
       Filme filme1 = new Filme("Nova Era", "Pedro", 2010, 3.2);
       Filme filme2 = new Filme("Passageiros", "Ana", 2017, 4.9);
       
       filme1.exibirInformacao();
       filme1.atualizarAvaliacao(4.1);
       
       filme2.exibirInformacao();
       filme2.atualizarAvaliacao(5);
    }
    
}
