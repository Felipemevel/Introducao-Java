package CursoBatismoJava.Desafios.Intermediario.HabilidadesNinja;

public class NinjaBasico implements Ninja{

    String nome;
    int idade;

    @Override
    public void executarHabilidade(){
        System.out.println("=========================================");
        System.out.println("> Ataque básico: Tempestade de Shurikens!");
        System.out.println("=========================================");
    }

    @Override
    public void mostrarInformacoes(){
        System.out.println("=========================================");
        System.out.println("> Nome: " + nome);
        System.out.println("> Idade: " + idade);
        System.out.println("=========================================");
    }

    public NinjaBasico(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
}
