package questaocarro;

public class Principal {

    public static void main(String[] args) {
    
        Carro c1 = new Carro();
        Carro c2 = new Carro();
        
        c1.setMarca("Toyota");
        c1.setModelo("Corolla");
        c1.setAno(2011);
        
        c2.setMarca("Ford");
        c2.setModelo("Mustang");
        c2.setAno(2021);
        
        System.out.println("Marca: " + c1.getMarca() + " Modelo: " + c1.getModelo() + " Ano: " + c1.getAno());
        System.out.println("Marca: " + c2.getMarca() + " Modelo: " + c2.getModelo() + " Ano: " + c2.getAno());
    }
    
}