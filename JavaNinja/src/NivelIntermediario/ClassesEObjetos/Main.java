package NivelIntermediario.ClassesEObjetos;

public class Main {
    public static void main(String[] args) {
        Ninja Naruto = new Ninja();
        Ninja Sasuke = new Ninja();
        Ninja Sakura = new Ninja();

        String chamaMetodo = Naruto.euSouUmNinja();

        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.idade = 17;
        Sasuke.aldeia = "Nukenin";

        Naruto.nome = "Naruto Uzumaki";
        Naruto.idade = 16;
        Naruto.aldeia = "Folha";

        Sakura.nome = "Sakura Haruno";
        Sakura.idade = 17;
        Sakura.aldeia = "Folha";

        int anosFaltamNaruto = Naruto.anosParaHokage(30);
        int anosFaltamSasuke = Sasuke.anosParaHokage(30);
        int anosFaltamSakura = Sakura.anosParaHokage(30);

        System.out.println("<==============================");
        System.out.println("Nome: " + Naruto.nome + "\nIdade: " + Naruto.idade + " anos \n" + "Aldeia: " + Naruto.aldeia + "\nAnos Restantes para Hokage: " + anosFaltamNaruto);
        System.out.println(chamaMetodo);
        System.out.println("==============================>\n");

        System.out.println("<==============================");
        System.out.println("Nome: " + Sasuke.nome + "\nIdade: " + Sasuke.idade + " anos \n" + "Aldeia: " + Sasuke.aldeia + "\nAnos Restantes para Hokage: " + anosFaltamSasuke);
        Sasuke.SharinganAtivado();
        System.out.println("==============================>\n");

        System.out.println("<==============================");
        System.out.println("Nome: " + Sakura.nome + "\nIdade: " + Sakura.idade + " anos \n" + "Aldeia: " + Sakura.aldeia + "\nAnos minimos restantes para Hokage: " + anosFaltamSakura);
        System.out.println("==============================>\n");
    }
}
