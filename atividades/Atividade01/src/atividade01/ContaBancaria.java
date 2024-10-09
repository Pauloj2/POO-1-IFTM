package atividade01;

public class ContaBancaria {
    public double saldo;
    public String titular;
    
    public ContaBancaria(String titular, double saldoInicial){
        this.titular = titular;
        this.saldo = saldoInicial;
    }
 
    public void depositar(double valor) {
        if(valor > 0){
            saldo += valor;
            System.out.println("Deposito de R$" + valor + " realizado com sucesso");
        }else{
            System.out.println("O valor de deposito deve ser maior que zero. ");
        }
    }
    public void sacar(double valor) {
        if(valor > 0 && valor <= saldo){
            saldo = saldo - valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso");
        }else{
            System.out.println("Saque não permitido. Saldo insuficiente ou valor inválido.");
        }
    }
    public void exibir(){
        System.out.printf("Saldo atual de %s: R$%.2f\n", titular, saldo);
    }  
}
