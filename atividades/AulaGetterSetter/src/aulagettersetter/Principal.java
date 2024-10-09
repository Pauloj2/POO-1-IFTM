package aulagettersetter;
/**
 *
 * @author rodri
 */
public class Principal {

    public static void main(String[] args) {
       Carro fusca = new Carro();
       Carro corolla = new Carro();
       Carro camaro = new Carro();
       
       fusca.setMarca("Volkswagem");
       fusca.setModelo("Fusca");
       fusca.setAno(1982);
       
       corolla.setMarca("Toyota");
       corolla.setModelo("Corolla");
       corolla.setAno(2020);
       
       camaro.setMarca("Chevrolet");
       camaro.setModelo("Camaro");
       camaro.setAno(2021);
       
       System.out.println("Carro: " + fusca.getMarca() + " - " + fusca.getModelo());
       System.out.println("Ano " + fusca.getAno());
       
       System.out.println("Carro: " + corolla.getMarca() + " - " + corolla.getModelo());
       System.out.println("Ano " + corolla.getAno());
       
       System.out.println("Carro: " + camaro.getMarca() + " - " + camaro.getModelo());
       System.out.println("Ano: " + camaro.getAno());
       
       
    }
    
}
