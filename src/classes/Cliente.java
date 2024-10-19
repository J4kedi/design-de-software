package classes;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import services.PagamentoStrategy;

public class Cliente extends Usuario {
    private List<Endereco> enderecos;
    private PagamentoStrategy metodoPagamento;

    public Cliente(String nome, Integer idade, String email, String senha, String cpf, Date dt_nasc) {
        super(nome, idade, email, senha, cpf, dt_nasc);
        this.enderecos = new ArrayList<>();
    }

    public void addEndereco(Endereco endereco) {
        enderecos.add(endereco);
    }

    public void rmEndereco(Endereco endereco) {
        enderecos.remove(endereco);
    }

    public void setPagamentoStrategy(PagamentoStrategy metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public void montarPizza() {
        System.out.println("Montando Pizza");
    }

    public PagamentoStrategy getMetodoPagamento() {
        return metodoPagamento;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }
}
