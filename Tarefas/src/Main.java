import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        Loja loja = new Loja();

        loja.adicionarProduto(new Produto("Notebook", 3500));
        loja.adicionarProduto(new Produto("Mouse", 150));
        loja.adicionarProduto(new Produto("Teclado", 300));

        // Usando Iterator
        Iterator<Produto> it = loja.criarIterator();

        System.out.println("Lista de produtos:");

        while (it.hasNext()) {
            Produto p = it.next();
            System.out.println("Nome: " + p.getNome() + " | Preço: R$ " + p.getPreco());
        }
    }
}