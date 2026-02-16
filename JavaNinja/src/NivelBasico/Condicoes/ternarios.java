package NivelBasico.Condicoes;

public class ternarios {
    public static void main(String[] args) {

        short missoes = 1;

        String nivel = (missoes >= 10) ? "Esse ninja está com mais de 10 missões" : "Esse ninja tem menos de 10 missões";

        System.out.println(nivel);
    }
}
