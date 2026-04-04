package PraticasLivre.CalculoFrete;

public abstract class Transportes {

    String identificacao;
    double valorPorKm;

    public Transportes(){

    }

    public Transportes(String identificacao){
        this.identificacao = identificacao;
    }
}
