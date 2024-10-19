package pagamento;

import services.PagamentoStrategy;

public class DinheiroStrategy implements PagamentoStrategy{
    @Override
    public void pagar(double valor) {
        System.out.println("Pagando " + valor + " em dinheiro.");
    }
}
