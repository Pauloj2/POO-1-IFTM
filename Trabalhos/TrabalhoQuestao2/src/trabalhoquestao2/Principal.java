package trabalhoquestao2;
/**
 *
 * @author Paulo
 */
public class Principal {

    public static void main(String[] args) {
        
        // Como foi pedido no trabalho, utilizei o construtor vazio,
        // O metúdo getter para recuperam informação;
        // E o setter adicionam informações;
        System.out.println("============================");
        Consulta p1 = new Consulta();
        p1.setNomePaciente("Ana");
        p1.setDataNasc("02/09/2000");
        p1.setProfissao("Dentista");
        p1.setConvenio(true);
        System.out.println("Nome: " + p1.getNomePaciente());
        System.out.println("Data de nascimento: " + p1.getDataNasc());
        System.out.println("Profissao: " + p1.getProfissao());
        System.out.println("Tem convenio: " + p1.getConvenio());
        System.out.println("============================");
        
        Consulta p2 = new Consulta();
        p2.setNomePaciente("");
        p2.setDataNasc("");
        p2.setProfissao("Arqueologo");
        p2.setConvenio(false);
        System.out.println("Nome: " + p2.getNomePaciente());
        System.out.println("Data de nascimento: " + p2.getDataNasc());
        System.out.println("Profissao: " + p2.getProfissao());
        System.out.println("Tem convenio: " + p2.getConvenio());
        System.out.println("============================");
        
        //Aqui utilizei o CONSTRUTOR SOBRECARREGADO para instanciar os dois objetos 
        //abaixo. Solicitado no enunciado do trabalho
        Consulta p3 = new Consulta("Maria", "03/04/1985");
        p3.setProfissao("Professora");
        p3.setConvenio(true);
        System.out.println("Nome: " + p3.getNomePaciente());
        System.out.println("Data de nascimento: " + p3.getDataNasc());
        System.out.println("Profissao: " + p3.getProfissao());
        System.out.println("Tem convenio: " + p3.getConvenio());
        System.out.println("============================");
        
        Consulta p4 = new Consulta("", "");
        p4.setProfissao("Agricultor");
        p4.setConvenio(false);
        System.out.println("Nome: " + p4.getNomePaciente());
        System.out.println("Data de nascimento: " + p4.getDataNasc());
        System.out.println("Profissao: " + p4.getProfissao());
        System.out.println("Tem convenio: " + p4.getConvenio());
        System.out.println("============================");
    }
}
