package NivelIntermediario.Heranca;

public class Main {
    public static void main(String[] args) {
        Uzumaki Naruto = new Uzumaki();
        Uchiha Sasuke = new Uchiha();
        Haruno Sakura = new Haruno();
        Hyuga Hinata = new Hyuga();

        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.idade = 17;
        Sasuke.aldeia = "Nukenin";

        Naruto.nome = "Naruto Uzumaki";
        Naruto.idade = 16;
        Naruto.aldeia = "Folha";

        Sakura.nome = "Sakura Haruno";
        Sakura.idade = 17;
        Sakura.aldeia = "Folha";

        Hinata.nome = "Hinata Hyuga";
        Hinata.idade = 16;
        Hinata.aldeia = "Folha";


        int anosFaltamNaruto = Naruto.anosParaHokage(30);
        int anosFaltamSasuke = Sasuke.anosParaHokage(30);
        int anosFaltamSakura = Sakura.anosParaHokage(30);
        int anosFaltamHinata = Hinata.anosParaHokage(30);

        System.out.println("<==============================");
        System.out.println("Nome: " + Naruto.nome + "\nIdade: " + Naruto.idade + " anos \n" + "Aldeia: " + Naruto.aldeia + "\nAnos Restantes para Hokage: " + anosFaltamNaruto);
        Naruto.ModoSabio();
        System.out.println("==============================>\n");

        System.out.println("<==============================");
        System.out.println("Nome: " + Sasuke.nome + "\nIdade: " + Sasuke.idade + " anos \n" + "Aldeia: " + Sasuke.aldeia + "\nAnos Restantes para Hokage: " + anosFaltamSasuke);
        Sasuke.SharinganAtivado();
        System.out.println("==============================>\n");

        System.out.println("<==============================");
        System.out.println("Nome: " + Sakura.nome + "\nIdade: " + Sakura.idade + " anos \n" + "Aldeia: " + Sakura.aldeia + "\nAnos minimos restantes para Hokage: " + anosFaltamSakura);
        Sakura.ativarCura();
        System.out.println("==============================>\n");

        System.out.println("<==============================");
        System.out.println("Nome: " + Hinata.nome + "\nIdade: " + Hinata.idade + " anos \n" + "Aldeia: " + Hinata.aldeia + "\nAnos minimos restantes para Hokage: " + anosFaltamHinata);
        Hinata.ativarByakugan();
        System.out.println("==============================>\n");
    }
}
