package questaoconstrutorespessoas;

public class Pessoa {
    private String nome;
    private int idade;
    
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    public Pessoa(){
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
}
/*Questão 2: Construtores Sobrecarga Crie uma classe Pessoa com dois construtores.
Um que recebe nome e idade e outro que recebe apenas nome.*/