package CursoBatismoJava.NivelBasico.desafios;

public class NinjasAldeiaDaFolha {
    public static void main(String[] args) {

        String ninja1 = "Naruto";
        int idade = 16;
        String missao = "Invasão a Aldeia da Névoa";
        char rankMissao = 'B';
        boolean concluida = false;

        System.out.println("====================================================");

        System.out.println("Nome: " + ninja1);
        System.out.println("Idade: " + idade);
        System.out.println("Missão: " + missao);
        System.out.println("Rank da missão: " + rankMissao);

        if (idade >= 15){
            concluida = true;
        } else if (rankMissao == 'C' || rankMissao == 'D') {
            concluida = true;
        }
        if (concluida == true){
            System.out.println("Missão concluída");
        } else {
            System.out.println("Missão não concluída");
        }

        System.out.println("====================================================");


        String ninja = "Sasuke";
        int idade2 = 17;
        String missao2 = "Matar Orochimaru";
        char rankMissao2 = 'A';
        boolean concluida2 = false;

        System.out.println("====================================================");

        System.out.println("Nome: " + ninja);
        System.out.println("Idade: " + idade2);
        System.out.println("Missão: " + missao2);
        System.out.println("Rank da missão: " + rankMissao2);

        if (idade2 >= 15){
            concluida2 = true;
        } else if (rankMissao2 == 'C' || rankMissao2 == 'D') {
            concluida2 = true;
        }
        if (concluida2 == true){
            System.out.println("Missão concluída");
        } else {
            System.out.println("Missão não concluída");
        }

        System.out.println("====================================================");

        String ninja3 = "Konohamaru";
        int idade3 = 12;
        String missao3 = "Derrotar Madara";
        char rankMissao3 = 'S';
        boolean concluida3 = false;

        System.out.println("====================================================");

        System.out.println("Nome: " + ninja3);
        System.out.println("Idade: " + idade3);
        System.out.println("Missão: " + missao3);
        System.out.println("Rank da missão: " + rankMissao3);

        if (idade3>= 15){
            concluida3 = true;
        } else if (rankMissao3 == 'C' || rankMissao3 == 'D') {
            concluida3 = true;
        }
        if (concluida3 == true){
            System.out.println("Missão concluída");
        } else {
            System.out.println("Missão não concluída");
        }

        System.out.println("====================================================");


    }
}
