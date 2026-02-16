package NivelBasico.Condicoes;

public class IfElse {
    public static void main(String[] args) {

        String nome = "Naruto Uzumaki";
        int idade = 17;
        boolean hokage = false;
        short missoes = 20;
        String rank;

        if (missoes == 10 && idade > 15) {
            System.out.println("Rank: Chunnin");
        } else if (missoes >= 20) {
            System.out.println("Rank: Jounin");
        }else {
            System.out.println("Rank: Gennim");
        }
    }
}
