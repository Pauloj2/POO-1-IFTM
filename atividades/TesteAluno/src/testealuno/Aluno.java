package testealuno;

public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;
    
    public Aluno(String nome, double nota1, double nota2){
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    public double calcularMedia(){
        return (nota1 + nota2)/2;
    }
    public void exibirResultado(){
        double media = calcularMedia();
        if(media >= 6){
            System.out.println("Nome: " + nome + " Status: Aprovado(a) nota: " + media);
        }else{
            System.out.println("Nome: " + nome + " Status: Reprovado(a) nota: " + media);
        }
    } 
}
