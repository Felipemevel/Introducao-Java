package CursoBatismoJava.NivelIntermediario.ClassesAbstratas;

public abstract class Hokages {

    String nome;
    int idade;
    boolean vivoOuNao;

    public Hokages(String nome, int idade, boolean vivoOuNao){
        this.vivoOuNao = vivoOuNao;
        this.idade = idade;
        this.nome = nome;
    }

    public Hokages() {
    }

    public abstract void sabedoriaHokage();

    void exibirDetalhes(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Vivo: " + vivoOuNao);
    }


}
