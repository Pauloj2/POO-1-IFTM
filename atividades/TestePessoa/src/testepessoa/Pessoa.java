package testepessoa;
public class Pessoa {
    private String nome;
    private int idade;
    private double altura;
    
    public Pessoa(String nome, int idade, double altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
    public void exibirInformacoes(){
        System.out.println("Nome: " + nome + ", Idade: " + idade + " anos, Altura: " + altura + "m");
    }
}
