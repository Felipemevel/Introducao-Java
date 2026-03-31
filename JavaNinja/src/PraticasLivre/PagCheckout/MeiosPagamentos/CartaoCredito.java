package PraticasLivre.PagCheckout.MeiosPagamentos;

import PraticasLivre.PagCheckout.MetodoPagamento;

public class CartaoCredito implements MetodoPagamento{

    public double limiteDisponivel;
    public String nomeTitular;

    @Override
    public boolean autorizar(double valor) {
        if (valor <= limiteDisponivel){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void processar(double valor) {
        limiteDisponivel = limiteDisponivel - valor;
        System.out.println("> Transação via CRÉDITO efetuada com sucesso!");
        System.out.println("> Titular: " + nomeTitular);
        System.out.printf("> Valor da transação: %.2f\n", valor );
        System.out.printf("> Limite anterior: %.2f\n", limiteDisponivel+valor);
        System.out.printf("> Limite atual: %.2f\n", limiteDisponivel);
    }

}


