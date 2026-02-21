package CursoBatismoJava.Desafios.Intermediario.GerenciarNinjas;

public class Ninja {

    String nome;
    int idade;
    String missao;
    String statusMissao;

    public void exibirDetalhes(){
        System.out.println("<====================>");
        System.out.println("Nome: " + nome + " | idade: " + idade + " anos " + "\nMissão: " + missao + "\nStatus da missão: " + statusMissao);
        System.out.println("<====================>");
    }
}
