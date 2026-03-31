package PraticasLivre.PagCheckout.MeiosPagamentos;

import PraticasLivre.PagCheckout.MetodoPagamento;

public class BoletoBancario implements MetodoPagamento{

    @Override
    public boolean autorizar(double valor){
        return true;
    }

    @Override
    public void processar(double valor){
        System.out.println("> Boleto emitido com sucesso!");
        System.out.println("> Número do boleto: 34191.09008 63571.277308 111111 ");
    }
}
