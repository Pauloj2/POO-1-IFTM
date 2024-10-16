package trabalhoquestao1;
/**
 *
 * @author Paulo
 */
public class FigurasGeometricas {
    //Aqui esta os atributos da classe encapsulatos com a visibilidade 'private'
    private double lado;
    private double altura;
    private double base;
    private double baseMaior;
    private double baseMenor;
    private String nomeFigura;
    
    // Construtor vazio como pedido no trabalho
    public FigurasGeometricas(){
    }
    
    // Construtor sobrecarregado com todas as variaveis
    public FigurasGeometricas(double lado, double altura, double base, double baseMaior, double baseMenor, String nomeFigura){
        this.lado = lado;
        this.altura = altura;
        this.base = base;
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.nomeFigura = nomeFigura;        
    }
    
    /*========== Setter e Getter do atributo lado =============*/
    public void setLado(double lado){
        //Validação das variáveis do tipo double para que nenhuma receba o valor 0 (zero) ou menor que 0 (zero)
        if(lado > 0){
            this.lado = lado;
        }else{
            //Se o valor for igual ou menor que 0, o valor default será 1.
            this.lado = 1;
            System.out.println("O valor nao pode ser menor ou igual a zero");
        }
    }
    public double getLado(){
        return this.lado; 
    }
    
    /*========== Setter e Getter do atributo altura =============*/
    public void setAltura(double altura){
        //Validação das variáveis do tipo double para que nenhuma receba o valor 0 (zero) ou menor que 0 (zero)        
        if(altura > 0){
            this.altura = altura;
        }else{
            //Se o valor for igual ou menor que 0, o valor default será 1.
            this.altura = 1;
            System.out.println("O valor nao pode ser menor ou igual a zero");
        }
    }
    public double getAltura(){
        return this.altura;
    }
    
    /*========== Setter e Getter do atributo base =============*/
    public void setBase(double base){
        //Validação das variáveis do tipo double para que nenhuma receba o valor 0 (zero) ou menor que 0 (zero)
        if(base > 0){
            this.base = base;
        }else{
            //Se o valor for igual ou menor que 0, o valor default será 1.
            this.base = 1;
            System.out.println("O valor nao pode ser menor ou igual a zero");
        }
    }
    public double getBase(){
        return this.base;
    }
    
    /*========== Setter e Getter do atributo base maior =============*/
    public void setBaseMaior(double baseMaior){
        //Validação das variáveis do tipo double para que nenhuma receba o valor 0 (zero) ou menor que 0 (zero)
        if(baseMaior > 0){
            this.baseMaior = baseMaior;
        }else{
            //Se o valor for igual ou menor que 0, o valor default será 1.
            this.baseMaior = 1;
            System.out.println("O valor nao pode ser menor ou igual a zero");   
        }
    }
    public double getBaseMaior(){
        return this.baseMaior;
    }
    
    /*========== Setter e Getter do atributo base menor =============*/    
    public void setBaseMenor(double baseMenor){
        //Validação das variáveis do tipo double para que nenhuma receba o valor 0 (zero) ou menor que 0 (zero)
        if(baseMenor > 0){
            this.baseMenor = baseMenor;
        }else{
            //Se o valor for igual ou menor que 0, o valor default será 1.
            this.baseMenor = 1;
            System.out.println("O valor nao pode ser menor ou igual a zero");
        }
    }
    public double getBaseMenor(){
        return this.baseMenor;
    }
    
    /*========== Setter e Getter do atributo nome da figura =============*/    
    public void setNomeFigura(String nomeFigura){
        this.nomeFigura = nomeFigura;
    }
    public String getNomeFigura(){
        return this.nomeFigura;
    }
    
    /*========== Metúdo de calcular a area das figuras =============*/
    public double calcularAreaFigura() {
        ////Validação para saber qual o valor da variavel nomeFigura e fazer o calculo
        if(nomeFigura.equals("quadrado")){
            return this.lado * this.lado;
        }else if(nomeFigura.equals("triangulo")){
            return (this.base * this.altura)/2;
        }else if(nomeFigura.equals("trapezio")){
            return ((this.baseMaior + this.baseMenor)*this.altura)/2;
        }else{
            return 0.0;
        }
    }
}
