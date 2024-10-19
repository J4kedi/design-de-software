package classes;

import java.util.List;

public class Pizza extends Produto {
    private List<Ingrediente> ingredientes;

    public Pizza(String nome, int idProduto, int qntdProduto) {
        super(nome, idProduto, qntdProduto);
    }

    public void adicionarIngrediente(Ingrediente ingrediente) {
        ingredientes.add(ingrediente);
    }

    public void removeringrediente(Ingrediente ingrediente) {
        ingredientes.remove(ingrediente);
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }
}
