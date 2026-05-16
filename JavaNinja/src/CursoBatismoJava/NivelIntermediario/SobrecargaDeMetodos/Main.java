package CursoBatismoJava.NivelIntermediario.SobrecargaDeMetodos;

public class Main {
    public static void main (String []args){

        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da Folha", 16);
        naruto.habilidadeEspecial();
        naruto.estrategiaBatalha();

        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Sem vila", 17, 10, NivelNinja.GENIN);
        sasuke.habilidadeEspecial();
        sasuke.estrategiaBatalha();

        Uchiha madara = new Uchiha("Madara Uchiha", "Vila da Folha", 82);
        madara.inteligenciaDeCombate();
        madara.inteligenciaDeCombate(180);
    }
}
