package testeconta;
public class ContaBancaria {
    private String nome;
    private int numeroConta;
    private double saldo;
    
    public ContaBancaria(String nome, int numeroConta, double saldo){
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }
    public void depositar(double valor){
        saldo += valor;
    }
    public void sacar(double valor){
        if(valor <= saldo){
            saldo = saldo - valor;
        }else{
            System.out.println("Saldo insuficiente.");
        }
    }
    public void exibir(){
        System.out.println("Nome: " + nome + ", Saldo: R$" + saldo);
    }
    
}
