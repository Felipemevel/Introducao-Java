package CursoBatismoJava.NivelBasico.Condicoes;

public class LacosDeRepeticao {
    public static void main(String[] args) {

        int numClones = 0;
        int maxClones = 40;

        /*
        while (numClones <= maxClones) {
            numClones++;
            System.out.println("O Naruto fez o clone: " + numClones);
        }
        */

        for (int i = 1; i <= maxClones; i++) {
            System.out.println("O Naruto fez o clone: " + i);
        }
    }
}
