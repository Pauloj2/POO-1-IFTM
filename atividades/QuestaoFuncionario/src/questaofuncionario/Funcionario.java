package questaofuncionario;

/**
 *
 * @author Paulo
 */

public class Funcionario {

    private String nome;
    private String cargo;
    private double salario;
    
    /*Construtor vazio*/
    public Funcionario(){
    }
    
    /*Construtor sobrecarregado*/
    public Funcionario(String nome, String cargo, double salario){
        this.nome = nome;
        //verificacao do cargo
        if(cargo.equals("")){
            this.cargo = "Sem cargo definido";
        }else{
            this.cargo = cargo;
        }
        //verificacao do salario
        if(salario < 1200){
            this.salario = 1200;
        }else{
            this.salario = salario;
        }
    }
    
    /*===== getter e setter do nome =====*/
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    
    /*===== getter e setter do cargo =====*/
    public void setCargo(String cargo){
        if(cargo.equals("")){
            this.cargo = "Sem cargo definido";
        }else{
            this.cargo = cargo;
        } 
    }
    public String getCargo(){
        return this.cargo;
    }
    
    /*===== getter e setter do salario =====*/
    /*O salário não pode ser menor que 1200, e caso isso aconteça, deverá ser definido com o valor mínimo de 1200.*/
    public void setSalario(double salario){
        if(salario < 1200){
            this.salario = 1200;
        }else{
            this.salario = salario;
        }
    }
    public double getSalario(){
        return this.salario;
    }
    
    /*Implemente o método public double calcularBonusAnual(), que retorna o salário multiplicado por 1.2 (20% de bônus).*/
    public double calcularBonusAnual(){
        return (salario * 1.2); 
    }
    
    
    
    
}
