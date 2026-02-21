package CursoBatismoJava.NivelBasico.Arrays;

public class Array {
    public static void main(String[] args) {

        String[] ninjas = new String[6];

        ninjas[0] = "Naruto Uzumaki";
        ninjas[1] = "Sasuke Uchiha";
        ninjas[2] = "Sakura Haruno";
        ninjas[3] = "Hinata Hyuga";
        ninjas[4] = "Kakashi Hatake";

        System.out.println("==================================");

        System.out.println(ninjas[4]);

        System.out.println("==================================");

        int[] idade = new int[2];
        idade[0] = 16;

        System.out.println(idade[1]);

        System.out.println("==================================");

        ninjas = new String[7];
        ninjas[0] = "Hashirama Senju";
        ninjas[1] = "Tobirama";
        ninjas[2] = "Hiruzen Sarutobi";
        ninjas[3] = "Minato Namikaze";
        ninjas[4] = "Tsunada";
        ninjas[5] = "Kakashi Hatake";
        ninjas[6] = "Naruto Uzumaki";

        for(int i = 0; i < ninjas.length; i++){
            System.out.println(ninjas[i]);
        }

        System.out.println("==================================");

    }
}
