package classes;

import java.sql.Date;

public class Ingrediente {
    private String nome;
    private double valorUnitario;
    private Date dataValidade;
    private int qntd;
    private double valor;

    public Ingrediente(String nome, double valorUnitario, Date dataValidade, int qntd) {
        this.nome = nome;
        this.valorUnitario = valorUnitario;
        this.dataValidade = dataValidade;
        this.qntd = qntd;
        this.valor = valorUnitario * qntd;
    }

    public void diminuirQuantidade(int quantidade) {
        this.qntd -= quantidade;
        this.valor = valorUnitario * qntd;
    }

    public void calcularTotal(int quantidade) {
        this.qntd += quantidade;
        this.valor = valorUnitario * qntd;
    }

    public String getNome() {
        return nome;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public int getQntd() {
        return qntd;
    }

    public double getValor() {
        return valor;
    }
}
