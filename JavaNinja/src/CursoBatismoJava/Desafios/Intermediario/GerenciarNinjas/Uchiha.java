package CursoBatismoJava.Desafios.Intermediario.GerenciarNinjas;

public class Uchiha extends Ninja{

    String habilidadeEspecial;

    @Override
    public void exibirDetalhes(){
        System.out.println("<====================>");
        System.out.println("Nome: " + nome + " | idade: " + idade + " anos " + "Missão: " + missao + "\nStatus da missão: " + statusMissao + "\nHabilidade especial: " + habilidadeEspecial);
        System.out.println(nome + " possui a habilidade dos Uchiha! " + habilidadeEspecial);
        System.out.println("<====================>");


    }
}
