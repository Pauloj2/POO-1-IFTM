package provaquestao3;

/**
 *
 * @author Paulo
 */
public class Principal {

    public static void main(String[] args) {
        Aluno p1 = new Aluno();
        p1.setNome("Ana");
        p1.setIdade(18);
        p1.setNota(9.5);
        p1.setMatricola("1p09");
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Idade: " + p1.getIdade());
        System.out.println("Nota: " + p1.getNota());
        System.out.println("Matricula: " + p1.getMatricola());
        System.out.println("====================================");
        
        Aluno p2 = new Aluno();
        p2.setNome("Pedro");
        p2.setIdade(5);
        p2.setNota(-1);
        p2.setMatricola("09a1");
        System.out.println("Nome: " + p2.getNome());
        System.out.println("Idade: " + p2.getIdade());
        System.out.println("Nota: " + p2.getNota());
        System.out.println("Matricula: " + p2.getMatricola());
        System.out.println("====================================");
        
        Aluno p3 = new Aluno("Vitoria", 20, 8.6, "074b");
        System.out.println("Nome: " + p3.getNome());
        System.out.println("Idade: " + p3.getIdade());
        System.out.println("Nota: " + p3.getNota());
        System.out.println("Matricula: " + p3.getMatricola());
        System.out.println("====================================");
        
        Aluno p4 = new Aluno("Jose", 6, -3, "28t1");
        System.out.println("Nome: " + p4.getNome());
        System.out.println("Idade: " + p4.getIdade());
        System.out.println("Nota: " + p4.getNota());
        System.out.println("Matricula: " + p4.getMatricola());
        System.out.println("====================================");
        
    }
    
}
