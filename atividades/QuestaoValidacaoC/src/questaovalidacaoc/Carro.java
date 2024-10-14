package questaovalidacaoc;

public class Carro {

    private String marca;
    private String modelo;
    private int ano;
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getMarca(){
        return this.marca;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getModelo(){
        return this.modelo;
    } 
    public void setAno(int ano) {
        if(ano < 1886 || ano > 2024){
            System.out.println("Data impossivel");
        }else{
            this.ano = ano;
        }
    }
    public int getAno(){
        return this.ano;
    }
}
