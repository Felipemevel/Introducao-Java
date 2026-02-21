package PraticasLivre.BibliotecaHeranca;

public class Dvd extends Item{

    int duracao;


    @Override
    public void exibirDetalhes(){
        System.out.println("Produto: " + titulo + " | Duração: " + duracao + " minutos" + "| ID: " + idProduto);
    }
}
