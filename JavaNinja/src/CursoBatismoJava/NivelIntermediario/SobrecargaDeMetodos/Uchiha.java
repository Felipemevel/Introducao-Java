package CursoBatismoJava.NivelIntermediario.SobrecargaDeMetodos;

public class Uchiha extends Ninja {

    public Uchiha(){

    }
    public Uchiha(String nome, String aldeia, int idade){
        super(nome, aldeia, idade);
    }
    public Uchiha(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas , NivelNinja rank){
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é o meu ataque Uchiha!");
    }
    @Override
    public void estrategiaBatalha(){
        System.out.println("Estrategia de batalha Uchiha!");
    }
    @Override
    public void inteligenciaDeCombate() {
        System.out.println("Estrategia de batalha Uchiha!");
    }

    @Override
    public void inteligenciaDeCombate(int qi){
        if (qi > 150){
            System.out.println("Seu QI é: " + qi);
        } else if (qi >= 130){
            System.out.println("Seu QI é: " + qi);
        } else {
            System.out.println("Burro");
        }
    }
}
