package atividade002;

public class Principal {

    public static void main(String[] args) {
        Carro carro1 = new Carro("Toyota", "Corola", 2020);
        Carro carro2 = new Carro("Ford", "Focus", 2018);
        Carro carro3 = new Carro("Honda", "Civic", 2021);
        
        System.out.println(carro1.mostrarInformacoes());
        System.out.println(carro2.mostrarInformacoes());
        System.out.println(carro3.mostrarInformacoes());
    
        System.out.println("Valor atualizado do " + carro1.mostrarInformacoes() + " : R$" + carro1.verificarTabelaFipe(70000));
        System.out.println("Valor atualizado do " + carro2.mostrarInformacoes() + " : R$" + carro2.verificarTabelaFipe(55000));        
        System.out.println("Valor atualizado do " + carro3.mostrarInformacoes() + " : R$" + carro3.verificarTabelaFipe(85000));
    }        
}
