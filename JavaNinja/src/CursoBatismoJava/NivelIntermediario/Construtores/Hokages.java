package CursoBatismoJava.NivelIntermediario.Construtores;

public class Hokages {

    String nome;
    int idade;
    boolean vivoOuNao;

    public Hokages(String nome, int idade, boolean vivoOuNao){
        this.vivoOuNao = vivoOuNao;
        this.idade = idade;
        this.nome = nome;
    }

    void exibirDetalhes(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Vivo: " + vivoOuNao);
    }


}
