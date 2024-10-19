package pagamento;

import services.PagamentoStrategy;

public class CartaoCreditoStrategy implements PagamentoStrategy {
    private String nomeTitular;
    private String numeroCartao;
    private int codigoSeguranca;

    public CartaoCreditoStrategy(String nomeTitular, String numeroCartao, int codigoSeguranca){
        this.nomeTitular = nomeTitular;
        this.numeroCartao = numeroCartao;
        this.codigoSeguranca = codigoSeguranca;
    }
    
    public void pagar(double valor) {
        System.out.println("Pagando " + valor + " no cartãod de crédito");
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public int getCodigoSeguranca() {
        return codigoSeguranca;
    }
}
