package testefilme;

public class Filme {
    private String titulo;
    private String diretor;
    private int anoDeLancamento;
    private double avaliacao;
    
    public Filme(String titulo, String diretor, int anoDeLancamento, double avaliacao){
        this.titulo = titulo;
        this.diretor = diretor;
        this.anoDeLancamento = anoDeLancamento;
        this.avaliacao = avaliacao;
    }
    public void exibirInformacao(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Diretor: " + diretor);
        System.out.println("Ano de lancamento: " + anoDeLancamento);
        System.out.println("Avaliacao: " + avaliacao + " estrelas");
    }
    public void atualizarAvaliacao(double reavaliacao){
        avaliacao = reavaliacao;
        System.out.println("Nova avaliacao: " + avaliacao + " estrela");
    }
}
