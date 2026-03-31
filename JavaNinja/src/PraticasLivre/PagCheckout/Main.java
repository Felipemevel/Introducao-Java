package PraticasLivre.PagCheckout;

// Local reservado para treino de interfaces e polimorfismo

import PraticasLivre.PagCheckout.MeiosPagamentos.BoletoBancario;
import PraticasLivre.PagCheckout.MeiosPagamentos.CartaoCredito;
import PraticasLivre.PagCheckout.MeiosPagamentos.Pix;

public class Main {
    public static void main (String[] args){

        MotorDeCheckout motor = new MotorDeCheckout();

        Pix pix = new Pix();
        pix.saldoEmConta = 732.23;
        pix.chavePix = "dcta478j-196l-03fm-t6gh-4298er7845m2";

        CartaoCredito credito = new CartaoCredito();
        credito.limiteDisponivel = 1200.00;
        credito.nomeTitular = "Felipe André Silva do Nascimento";

        BoletoBancario boleto = new BoletoBancario();

        System.out.println("==========================================================");
        motor.finalizarCompra(800, pix);
        System.out.println("----------------------------------------------------------");
        motor.finalizarCompra(512, pix);

        System.out.println("==========================================================");
        motor.finalizarCompra(1300, credito);
        System.out.println("----------------------------------------------------------");
        motor.finalizarCompra(1100, credito);

        System.out.println("==========================================================");
        motor.finalizarCompra(150, boleto);
        System.out.println("==========================================================");
    }
}
