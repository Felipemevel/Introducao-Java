package PraticasLivre.PagCheckout;

public interface MetodoPagamento {

    boolean autorizar(double valor);
    void processar (double valor);
}
