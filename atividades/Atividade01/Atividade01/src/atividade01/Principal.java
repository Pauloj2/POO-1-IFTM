package atividade01;

public class Principal {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("Jose", 1000.0);
        ContaBancaria conta2 = new ContaBancaria("Maria", 800.0);
        ContaBancaria conta3 = new ContaBancaria("Joana", 500.0);
        
        System.out.println("=== Conta de Jose ===");
        conta1.exibir();
        conta1.depositar(300);
        conta1.sacar(200);
        conta1.exibir();
        
        System.out.println("=== Conta de Maria ===");
        conta2.exibir();
        conta2.depositar(300);
        conta2.sacar(200);
        conta2.exibir();
       
        System.out.println("=== Conta de Joana ===");
        conta3.exibir();
        conta3.depositar(300);
        conta3.sacar(200);
        conta3.exibir();
    } 
}
