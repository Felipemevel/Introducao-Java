package CursoBatismoJava.Desafios.Intermediario.HabilidadesNinja;

public class Main {
    public static void main(String [] args){

        NinjaBasico figurante = new NinjaBasico("John Xenoverse", 15);
        NinjaAvancado naruto = new NinjaAvancado("Naruto", 17);

        naruto.mostrarInformacoes();
        naruto.executarHabilidade();

        figurante.mostrarInformacoes();
        figurante.executarHabilidade();
    }
}
