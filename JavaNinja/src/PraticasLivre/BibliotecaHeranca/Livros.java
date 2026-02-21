package PraticasLivre.BibliotecaHeranca;

public class Livros extends Item{

    String autor;


    @Override
    public void exibirDetalhes(){
        System.out.println("Produto: " + titulo + " | Autor: " + autor + " | ID: " + idProduto);
    }
}
