package testeconta;

public class Principal {
    public static void main(String[] args) {
        ContaBancaria p1 = new ContaBancaria("Maria", 2198, 2000);
        ContaBancaria p2 = new ContaBancaria("Jose", 8172, 1000);
        
        p1.depositar(900);
        p2.sacar(500);
        
        p1.exibir();
        p2.exibir();
    }
    
}
