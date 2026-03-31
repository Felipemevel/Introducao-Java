package CursoBatismoJava.NivelIntermediario.Polimorfismo;

public class Main {
    public static void main (String []args){

        Ninja jon = new Ninja();
        jon.nome = "Jon";
        jon.habilidadeEspecial();

        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto";
        naruto.habilidadeEspecial();

        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke";
        sasuke.habilidadeEspecial();
    }
}
