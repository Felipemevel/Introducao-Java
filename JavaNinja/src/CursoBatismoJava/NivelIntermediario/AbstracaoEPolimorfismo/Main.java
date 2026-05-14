package CursoBatismoJava.NivelIntermediario.AbstracaoEPolimorfismo;

public class Main {
    public static void main (String []args){

        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto";
        naruto.habilidadeEspecial();
        naruto.estrategiaBatalha();

        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke";
        sasuke.habilidadeEspecial();
        sasuke.estrategiaBatalha();
    }
}
