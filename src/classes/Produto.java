package classes;

public abstract class Produto {
    private String nome;
    private int idProduto;
    private int qntdProduto;
    private double valor;

    public Produto(String nome, int idProduto, int qntdProduto) {
        this.nome = nome;
        this.idProduto = idProduto;
        this.qntdProduto = qntdProduto;
    }

    public double calcularValorTotal() {
        return qntdProduto * valor;
    }

    public String getNome() {
        return nome;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public int getQntdProduto() {
        return qntdProduto;
    }

    public double getValor() {
        return valor;
    }
}