package CursoBatismoJava.NivelIntermediario.ClassesAbstratas;

public class Senju extends Hokages{

    public Senju(String nome, int idade, boolean vivoOuMorto){
        super(nome, idade, vivoOuMorto);
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuMorto;
    }

    public void sabedoriaHokage(){
        System.out.println("Recebeu sabedoria!");
    }
}
