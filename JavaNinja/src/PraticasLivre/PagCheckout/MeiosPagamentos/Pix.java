package PraticasLivre.PagCheckout.MeiosPagamentos;

import PraticasLivre.PagCheckout.MetodoPagamento;

public class Pix implements MetodoPagamento{

    public double saldoEmConta;
    public String chavePix;


    @Override
    public boolean autorizar(double valor) {
        if (valor <= saldoEmConta){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void processar(double valor) {
        saldoEmConta = saldoEmConta - valor;
        System.out.println("> Transação via PIX efetuada com sucesso!");
        System.out.println("> CHAVE PIX: " + chavePix);
        System.out.printf("> Valor da transação: %.2f\n" , valor);
        System.out.printf("> Saldo anterior: %.2f\n", saldoEmConta+valor);
        System.out.printf("> Novo saldo: %.2f\n", saldoEmConta);
    }
}
