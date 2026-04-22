
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Loja {
    private List<Produto> produtos;

    public Loja() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto p) {
        produtos.add(p);
    }

    // Aqui está o uso do Iterator respeitando encapsulamento
    public Iterator<Produto> criarIterator() {
        return produtos.iterator();
    }
}