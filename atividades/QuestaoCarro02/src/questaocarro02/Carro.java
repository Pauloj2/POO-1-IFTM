package questaocarro02;

/**
 *
 * @author Paulo
 */

public class Carro {
    
    private String modelo;
    private int ano;
    private double quilometragem;
    
    /*Construtor vazio*/
    public Carro(){
    }
    
    /*Construtor sobrecarregado*/
    public Carro(String modelo, int ano, double quilometragem){
        this.modelo = modelo;
        /*Verificação de ano*/
        if(ano < 1886){
            this.ano = 1886;
        }else{
            this.ano = ano;
        }
        /*Verificação de quilometragem*/
        if(quilometragem < 0){
            this.quilometragem = 0;
        }else{
            this.quilometragem = quilometragem;
        }
    }
    
    /*==== Setter e Getter de modelo ====*/
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getModelo(){
        return this.modelo;
    }
    
    /*==== Setter e Getter do ano ====*/
    public void setAno(int ano){
        /*O ano não pode ser anterior a 1886 (ano em que o primeiro carro 
        foi inventado). Se for, defina o ano como 1886.*/
        if(ano < 1886){
            this.ano = 1886;
        }else{
            this.ano = ano;
        }
    }
    public int getAno() {
        return this.ano;
    }
    
    /*==== Setter e Getter da quilometragem ====*/
    public void setQuilometragem(double quilometragem){
        /*A quilometragem não pode ser menor que 0. Se for, defina como 0.*/
        if(quilometragem < 0){
            this.quilometragem = 0;
        }else{
            this.quilometragem = quilometragem;
        }
    }
    public double getQuilometragem(){
        return this.quilometragem;
    }
    
    /*Crie o método public boolean verificarCarroAntigo(), que retorna true se 
      o carro tiver mais de 30 anos e false caso contrário.*/
    public boolean verificarCarroAntigo(){
        if(2024 - ano > 30){
            return true;
        }else{
            return false;
        }
    }
    
}
