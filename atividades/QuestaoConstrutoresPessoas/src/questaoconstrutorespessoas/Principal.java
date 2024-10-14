package questaoconstrutorespessoas;

/**
 *
 * @author rodri
 */
public class Principal {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        
        p1.setNome("Ana");
        p1.setIdade(20);
        
        System.out.println("Nome: " + p1.getNome() + " Idade: " + p1.getIdade() + " anos");
        
        p2.setNome("Pedro");
        p2.setIdade(28);
        
        System.out.println("Nome: " + p2.getNome() + " Idade: " + p2.getIdade() + " anos");
    }
    
}
