package CursoBatismoJava.NivelIntermediario.AbstracaoEPolimorfismo;

public class Uchiha extends Ninja {

    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é o meu ataque Uchiha!");
    }
    @Override
    public void estrategiaBatalha(){
        System.out.println("Estrategia de batalha Uchiha!");
    }
}
