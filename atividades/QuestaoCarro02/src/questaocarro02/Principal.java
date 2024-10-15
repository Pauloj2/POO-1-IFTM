package questaocarro02;

/**
 *
 * @author Paulo
 */
public class Principal {

    public static void main(String[] args) {
        
        /*Utilizando o construtor vazio*/
        System.out.println("==================================");
        Carro c1 = new Carro();
        c1.setModelo("Fiat Strada");
        c1.setAno(2000);
        c1.setQuilometragem(180.076);
        System.out.println("Modelo: " + c1.getModelo());
        System.out.println("Ano: " + c1.getAno());
        System.out.println("Quilometragem: " + c1.getQuilometragem());
        System.out.println("==================================");
        
        /*Utilizando o construtor vazio testando as verificações*/
        Carro c2 = new Carro();
        c2.setModelo("VolksWagem Fusca");
        c2.setAno(0);
        c2.setQuilometragem(-2);
        System.out.println("Modelo: " + c2.getModelo());
        System.out.println("Ano: " + c2.getAno());
        System.out.println("Quilometragem: " + c2.getQuilometragem());
        System.out.println("==================================");
        
        /*Utilizando o construtor sobrecarregado*/
        Carro c3 = new Carro("Fiat Argo", 2022, 80.076);
        System.out.println("Modelo: " + c3.getModelo());
        System.out.println("Ano: " + c3.getAno());
        System.out.println("Quilometragem: " + c3.getQuilometragem());
        System.out.println("==================================");
        
        /*Utilizando o construtor sobrecarregado*/
        Carro c4 = new Carro("Benz Patent", 1800, -8);
        System.out.println("Modelo: " + c4.getModelo());
        System.out.println("Ano: " + c4.getAno());
        System.out.println("Quilometragem: " + c4.getQuilometragem());
        System.out.println("==================================");
        
    }  
}
