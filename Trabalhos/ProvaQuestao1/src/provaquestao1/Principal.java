package provaquestao1;

/**
 *
 * @author Paulo
 */
/*(3,0) Crie uma classe chamada Livro. Adicione os seguintes atributos
privados:
titulo (String)
autor (String)
gênero (String)
preco (double)
Crie métodos getters e setters para cada atributo. Crie uma classe
Principal para testar o programa com 2 objetos da classe Livro. Use os
métodos setters para definir os valores dos atributos. Use os métodos
getters para exibir os valores dos atributos.*/

public class Principal {

    public static void main(String[] args) {
        
        System.out.println("==================================");
        Livro livro1 = new Livro();
        livro1.setTitulo("Indiana Jones");
        livro1.setAutor("Jonnys");
        livro1.setGenero("Aventura");
        livro1.setPreco(40.5);
        System.out.println("Titulo: " + livro1.getTitulo());
        System.out.println("Autor: " + livro1.getAutor());
        System.out.println("Genero: " + livro1.getGenero());
        System.out.println("valor: " + livro1.getpreco());
        System.out.println("==================================");
        
        Livro livro2 = new Livro();
        livro2.setTitulo("Uma Noite");
        livro2.setAutor("Aghata");
        livro2.setGenero("Romance");
        livro2.setPreco(30.5);
        System.out.println("Titulo: " + livro2.getTitulo());
        System.out.println("Autor: " + livro2.getAutor());
        System.out.println("Genero: " + livro2.getGenero());
        System.out.println("valor: " + livro2.getpreco());
        System.out.println("==================================");
    }
    
}
