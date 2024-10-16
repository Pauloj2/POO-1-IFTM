package provaquestao3;

/**
 *
 * @author Paulo
 */
public class Aluno {
    private String nome;
    private int idade;
    private double nota;
    private String matricula;
    
    /*Crie um construtor padrão (vazio) e um construtor sobrecarregado que
    inicialize todos os atributos. Replique as validações no construtor
    sobrecarregado.*/
    public Aluno(){
    };
    
    public Aluno(String nome, int idade, double nota, String matricula){
        this.nome = nome;
       if(idade < 18 || idade > 90){
            this.idade = 18;
        }else{
             this.idade = idade;
        }
        if(nota < 0 || nota > 10.0){
            this.nota = 5;
        }else{
             this.nota = nota;
        }
        this.matricula = matricula;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    
    public void setIdade(int idade){
        /*idade, adicione validações para garantir que os valores
        estejam dentro de um intervalo aceitável: a idade do aluno deve estar em
        um intervalo entre 18 e 90*/
        if(idade < 18 || idade > 90){
            this.idade = 18;
        }else{
             this.idade = idade;
        }
    }
    public int getIdade(){
        return this.idade;
    }
    
    public void setNota(double nota){
    /*a nota do aluno deve estar entre 0 e 10.0.*/ 
        if(nota < 0 || nota > 10.0){
            this.nota = 5;
        }else{
             this.nota = nota;
        }
    }
    public double getNota(){
        return this.nota;
    }
    
    public void setMatricola(String matricola){
        this.matricula = matricola;
    }
    public String getMatricola(){
        return this.matricula;
    }
       
}