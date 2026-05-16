package CursoBatismoJava.NivelIntermediario.SobrecargaConstrutores;

public abstract class Ninja implements Estrategia {

   // TODO: Adicionar 2 novos atributos: numeroDeMissoesConcluidas e rank.

    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoesConcluidas;
    NivelNinja rank;

    public Ninja(){

    }
    public Ninja(String nome, String aldeia, int idade){
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }
    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank){
        this(nome, aldeia, idade);
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank = rank;
    }

    public void habilidadeEspecial(){
        System.out.println("Meu nome é " + nome + " e esse é o meu ataque especial!");
    }


}
