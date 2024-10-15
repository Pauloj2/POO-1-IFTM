package questaofuncionario;

/**
 *
 * @author Paulo
 */

public class Principal {
    public static void main(String[] args) {
        
        //Utilizando o construtor vazio
        System.out.println("======================");
        Funcionario p1 = new Funcionario();
        p1.setNome("Pedro");
        p1.setCargo("Seguranca");
        p1.setSalario(2000);
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Cargo: " + p1.getCargo());
        System.out.println("Salario: " + p1.getSalario());
        System.out.println("Salario com Bonus: " + p1.calcularBonusAnual());
        System.out.println("======================");
        
        //Utilizando o construtor sobrecarregado
        Funcionario p2 = new Funcionario("Galadriel", "Arqueologa", 3000);
        System.out.println("Nome: " + p2.getNome());
        System.out.println("Cargo: " + p2.getCargo());
        System.out.println("Salario: " + p2.getSalario());
        System.out.println("Salario com Bonus: " + p2.calcularBonusAnual());
        System.out.println("======================");
        
        //Testando a verificação do cargo e do salario
        //Utilizando o construtor sobrecarregado 
        Funcionario p3 = new Funcionario("Jonas", "", 1000);
        System.out.println("Nome: " + p3.getNome());
        System.out.println("Cargo: " + p3.getCargo());
        System.out.println("Salario: " + p3.getSalario());
        System.out.println("Salario com Bonus: " + p3.calcularBonusAnual());
        System.out.println("======================");
        
        //Testando a verificação do cargo e do salario
        //Utilizando o construtor vazio 
        Funcionario p4 = new Funcionario();
        p4.setNome("Beatriz");
        p4.setCargo("");
        p4.setSalario(500);
        System.out.println("Nome: " + p4.getNome());
        System.out.println("Cargo: " + p4.getCargo());
        System.out.println("Salario: " + p4.getSalario());
        System.out.println("Salario com Bonus: " + p4.calcularBonusAnual());
        System.out.println("======================");
        
    }  
}
