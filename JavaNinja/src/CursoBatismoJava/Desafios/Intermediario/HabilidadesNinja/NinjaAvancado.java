package CursoBatismoJava.Desafios.Intermediario.HabilidadesNinja;

public class NinjaAvancado extends NinjaBasico implements Ninja{

    @Override
    public void executarHabilidade(){
        System.out.println("=========================================");
        System.out.println("> Ataque avançado: Rasengan!");
        System.out.println("=========================================");
    }

    @Override
    public void mostrarInformacoes(){
        System.out.println("=========================================");
        System.out.println("> Nome: " + nome);
        System.out.println("> Idade: " + idade);
        System.out.println("=========================================");
    }

    public NinjaAvancado(String nome, int idade){
        super(nome, idade);
        this.nome = nome;
        this.idade = idade;
    }
}
