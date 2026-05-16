package CursoBatismoJava.NivelIntermediario.SobrecargaConstrutores;

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
}
