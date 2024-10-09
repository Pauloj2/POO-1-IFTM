/*2) Crie uma classe chamada Carro com atributos marca, modelo e ano.
Crie um método chamado mostrarInformacoes que retorne o valor de todas as 
variáveis concatenados, com seus respectivos rótulos. Crie também um método
chamado verificarTabelaFipe, que receberá como parâmetro o valor do carro 
segundo a fipe dele no ano corrente, depois acrescente 20% desse valor e 
retorne o valor atualizado. Faça uma classe Principal com 3 objetos e teste
todos os atributos e métodos.
 */
package atividade002;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    
    public Carro(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    
    public String mostrarInformacoes() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano;
    }
    
    public double verificarTabelaFipe(double valorFipe) {
        return valorFipe + (valorFipe * 0.20);
    }
    
}
