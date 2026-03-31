package CursoBatismoJava.NivelIntermediario.Construtores;

public class Main {
    public static void main (String [] args){

        // Hokages Hashirama = new Hokages();
        // Hashirama.idade = 45;

        Hokages Tobirama = new Hokages("Tobirama Senju", 45, false);

        Tobirama.exibirDetalhes();
    }
}
