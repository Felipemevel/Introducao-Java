package PraticasLivre.BibliotecaHeranca;

public class Item {

    String titulo;
    int idProduto;


    public void exibirDetalhes(){
        System.out.println("Produto: " + titulo + " | ID: " + idProduto);
    }
}
