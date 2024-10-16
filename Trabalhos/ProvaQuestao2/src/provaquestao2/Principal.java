package provaquestao2;

/**
 *
 * @author Paulo
 */
/*2. (5,0) Crie uma classe chamada Produto. Adicione os seguintes atributos
privados:
nome (String)
categoria (String)
preco (double)
quantidadeEmEstoque (int)
Crie métodos getters e setters para cada atributo. Nos setters
de preco e quantidadeEmEstoque, adicione validações para garantir
que os valores não sejam zero ou negativos. Caso seja enviado valores
que não são aceitos, os valores default serão: 1 na variável
PROVA – GETTERS/SETTERS/CONSTRUTOR
Disciplina: Programação Orientada a Objetos I Turma: 3º período
Professor: Ligia Pestili
Pontuação: 15 pontos Data de entrega: 14/10/2024
quantidadeEmEstoque e 10.0 na variável preco.
Crie uma classe Principal para testar o programa com 3 objetos da
classe Produto. Use os métodos setters para definir os valores dos
atributos. Use os métodos getters para exibir os valores dos atributos.
Defina valores negativos para preco e quantidadeEmEstoque em um
desses objetos e verifique se a validação funciona.*/
public class Principal {

    public static void main(String[] args) {
        
        Produto p1 = new Produto();
        p1.setNome("caderno");
        p1.setCategoria("Escolar");
        p1.setPreco(20.0);
        p1.setQuantidadeEmEstoque(5);
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Categoria: " + p1.getCategoria());
        System.out.println("valor: " + p1.getPreco());
        System.out.println("Quantidade em estoque: " + p1.getquantidadeEmEstoque());
        System.out.println("====================================");
        
        Produto p2 = new Produto();
        p2.setNome("Vasoura");
        p2.setCategoria("Limpeza");
        p2.setPreco(10.0);
        p2.setQuantidadeEmEstoque(-7);
        System.out.println("Nome: " + p2.getNome());
        System.out.println("Categoria: " + p2.getCategoria());
        System.out.println("valor: " + p2.getPreco());
        System.out.println("Quantidade em estoque: " + p2.getquantidadeEmEstoque());
        System.out.println("====================================");
        
        Produto p3 = new Produto();
        p3.setNome("Carne");
        p3.setCategoria("Alimento");
        p3.setPreco(50.50);
        p3.setQuantidadeEmEstoque(0);
        System.out.println("Nome: " + p3.getNome());
        System.out.println("Categoria: " + p3.getCategoria());
        System.out.println("valor: " + p3.getPreco());
        System.out.println("Quantidade em estoque: " + p3.getquantidadeEmEstoque());
        System.out.println("====================================");
    }
    
}
