package trabalhoquestao2;

public class Consulta {
    //Aqui esta os atributos da classe encapsulatos com a visibilidade 'private'
    private String nomePaciente;
    private String dataNasc;
    private String profissao;
    private boolean convenio;
    
    //Construtor vazio
    public Consulta(){
    }
    
    //Com foi pedido no trabalho somente os atributos obrigatorios no Construtor sobrecarregado
    //tambem foi pedido , que replique as validações dos Setters no construtor para que funcione
    //a verificação 'Sem Preenchimento'.
    public Consulta(String nomePaciente, String dataNasc){
        //verificação do atributo nome do Paciente
        if(nomePaciente.equals("")){
            this.nomePaciente = "Sem preenchimento";
        }else{
            this.nomePaciente = nomePaciente;
        }
        //verificação do atributo data de nascimento
        if(dataNasc.equals("")){
            this.dataNasc = "Sem preenchimento";
        }else{
            this.dataNasc = dataNasc;
        }
    }
    
    /*=== Setter e Getter do atributo nome do paciente ===*/
    public void setNomePaciente(String nomePaciente){
        if(nomePaciente.equals("")){
            this.nomePaciente = "Sem preenchimento";
        }else{
            this.nomePaciente = nomePaciente;
        }
    }
    public String getNomePaciente(){
        return this.nomePaciente;
    }
    
    /*=== Setter e Getter do atributo data de nascimento ===*/
    public void setDataNasc(String dataNasc){
        if(dataNasc.equals("")){
            this.dataNasc = "Sem preenchimento";
        }else{
            this.dataNasc = dataNasc;
        }
    }
    public String getDataNasc(){
        return this.dataNasc;
    }
    
    /*=== Setter e Getter do atributo profissao ===*/
    public void setProfissao(String profissao){
        this.profissao = profissao;
    }
    public String getProfissao(){
        return this.profissao;
    }
    
     /*=== Setter e Getter do atributo convenio ===*/
    public void setConvenio(boolean convenio){
        this.convenio = convenio;
    }
    public String getConvenio(){
        //verificação para retornar “Sim” se a varável tiver o valor true 
        //ou “Não” se a varável tiver o valor false.  
        if(this.convenio){
            return "Sim";
        }else{
            return "Nao";
        }
    }
}
