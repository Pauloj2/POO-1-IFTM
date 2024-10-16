package trabalhoquestao1;
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
        FigurasGeometricas quadrado = new FigurasGeometricas();
        quadrado.setNomeFigura("quadrado");
        /* Aqui eu atribui o valor '0' no atributo lado para fazer o teste de
        verificação */
        quadrado.setLado(0);
        System.out.println("Figura: " + quadrado.getNomeFigura());
        System.out.println("Lado do quadrado: " + quadrado.getLado());
        System.out.println("Area do quadrado: " + quadrado.calcularAreaFigura());
        System.out.println("============================");
        
        /*Aqui também utilizei o construtor vazio e os metúdos getters e setters.*/
        FigurasGeometricas triangulo = new FigurasGeometricas();
        triangulo.setNomeFigura("triangulo");
        triangulo.setBase(6);
        triangulo.setAltura(4);
        System.out.println("Figura: " + triangulo.getNomeFigura());
        System.out.println("Base do triangulo: " + triangulo.getBase());
        System.out.println("Altura do triangulo: " + triangulo.getAltura());
        System.out.println("Area do triangulo: " + triangulo.calcularAreaFigura());
        System.out.println("============================");
        
        //Aqui utilizei o CONSTRUTOR SOBRECARREGADO para instanciar pelo menos 1 objeto 
        //solicitado no enunciado do trabalho
        FigurasGeometricas trapezio = new FigurasGeometricas(0,5,0,8,4,"trapezio");
        System.out.println("Figura: " + trapezio.getNomeFigura());
        System.out.println("Altura: " + trapezio.getBaseMaior());
        System.out.println("Base Maior: " + trapezio.getBaseMaior());
        System.out.println("Base Menor: " + trapezio.getBaseMenor());
        System.out.println("Area do Trapezio: " + trapezio.calcularAreaFigura());
        System.out.println("============================");
    }
}
