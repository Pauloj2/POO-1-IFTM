package testealuno;

public class Principal {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Maria", 9.50, 9.00);
        Aluno aluno2 = new Aluno("Jose", 3.98, 5.60);
        Aluno aluno3 = new Aluno("Pedro", 9.50, 10);
        
        aluno1.calcularMedia();
        aluno1.exibirResultado();
        
        aluno2.calcularMedia();
        aluno2.exibirResultado();
        
        aluno3.calcularMedia();
        aluno3.exibirResultado();
    }
    
}
