package pagamento;

import services.PagamentoStrategy;

public class PayPalStrategy implements PagamentoStrategy{
    private String email;

    public PayPalStrategy(String email) {
        this.email = email;
    }

    @Override
    public void pagar(double valor) {
        System.out.println("Pagando " + valor + " no PayPal.");
    }

    public String getEmail() {
        return email;
    }
}
