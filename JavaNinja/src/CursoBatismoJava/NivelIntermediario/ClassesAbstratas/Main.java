package CursoBatismoJava.NivelIntermediario.ClassesAbstratas;

public class Main {
    public static void main (String [] args){

        Senju Hashirama = new Senju("Hashirama Senju", 45, false);

        Senju Tobirama = new Senju("Tobirama Senju", 50, false);

        Hashirama.exibirDetalhes();
        Hashirama.sabedoriaHokage();
        Tobirama.exibirDetalhes();
        Tobirama.sabedoriaHokage();
    }
}
