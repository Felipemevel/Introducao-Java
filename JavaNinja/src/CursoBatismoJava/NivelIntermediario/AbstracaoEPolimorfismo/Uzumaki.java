package CursoBatismoJava.NivelIntermediario.AbstracaoEPolimorfismo;

public class Uzumaki extends Ninja {

    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é o meu ataque Uzumaki!");
    }
    @Override
    public void estrategiaBatalha(){
        System.out.println("Estrategia de batalha Uzumaki!");
    }
}
