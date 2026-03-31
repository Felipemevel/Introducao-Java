package PraticasLivre.PagCheckout;

public class MotorDeCheckout {

    public void finalizarCompra(double valor, MetodoPagamento metodo){
        if (metodo.autorizar(valor)){
            metodo.processar(valor);
        } else {
            System.out.println("> Pagamento negado. Verifique o seu saldo ou limite.");
        }
    }
}
