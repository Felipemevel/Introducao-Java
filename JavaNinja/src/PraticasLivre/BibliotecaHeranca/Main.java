package PraticasLivre.BibliotecaHeranca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Item> biblioteca = new ArrayList<>();

        Livros livroUm = new Livros();
        Livros livroDois = new Livros();
        Livros livroTres = new Livros();

        livroUm.titulo = "Darth Bane: O Caminho à Destruição";
        livroUm.autor = "Drew Karpyshyn";
        livroUm.idProduto = 1;

        livroDois.titulo = "Darth Bane: A Regra de Dois";
        livroDois.autor = "Drew Karpyshyn";
        livroDois.idProduto = 2;

        livroTres.titulo = "Darth Bane: Dinastia do Mal";
        livroTres.autor = "Drew Karpyshyn";
        livroTres.idProduto = 3;

        biblioteca.add(livroUm);
        biblioteca.add(livroDois);
        biblioteca.add(livroTres);

        Dvd dvdUm = new Dvd();
        Dvd dvdDois = new Dvd();
        Dvd dvdTres = new Dvd();

        dvdUm.titulo = "Star Wars: A Ameaça Fantasma";
        dvdUm.duracao = 136;
        dvdUm.idProduto = 4;

        dvdDois.titulo = "Star Wars: O Ataque dos Clones";
        dvdDois.duracao = 142;
        dvdDois.idProduto = 5;

        dvdTres.titulo = "Star Wars: A Vingança dos Sith";
        dvdTres.duracao = 140;
        dvdTres.idProduto = 6;

        biblioteca.add(dvdUm);
        biblioteca.add(dvdDois);
        biblioteca.add(dvdTres);

        Scanner scanner = new Scanner(System.in);
        int option = 0;

        while(option != 3){
            System.out.println("========== Menu ==========");
            System.out.println("= 1 - Adicionar produto  =");
            System.out.println("= 2 - Checar estoque     =");
            System.out.println("= 3 - Sair               =");
            System.out.println("==========================");

            System.out.print("Digite a opção: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 1:
                    System.out.println("========== Adicionar Produto ==========");
                    System.out.println("= 1 - Livro");
                    System.out.println("= 2 - Dvd");
                    System.out.println("=======================================");

                    System.out.print("Digite a opção: ");
                    option = scanner.nextInt();
                    scanner.nextLine();

                    switch (option) {
                        case 1:

                            Livros novoLivro = new Livros();

                            System.out.println("========== Adicionar Livro ==========");
                            System.out.print("= > Digite o título: ");
                            String tituloLivro = scanner.nextLine();
                            System.out.print("= > Digite o autor: ");
                            String autor = scanner.nextLine();

                            novoLivro.titulo = tituloLivro;
                            novoLivro.autor = autor;
                            novoLivro.idProduto = biblioteca.size()+1;

                            biblioteca.add(novoLivro);

                            System.out.println("=====================================");
                            break;

                        case 2:

                            Dvd novoDvd = new Dvd();

                            System.out.println("========== Adicionar DVDS ==========");
                            System.out.print("= > Digite o título: ");
                            String tituloDvd = scanner.nextLine();
                            System.out.print("= > Digite a duração em minutos: ");
                            int duracao = scanner.nextInt();
                            scanner.nextLine();

                            novoDvd.titulo = tituloDvd;
                            novoDvd.duracao = duracao;
                            novoDvd.idProduto = biblioteca.size()+1;

                            biblioteca.add(novoDvd);

                            System.out.println("====================================");

                            break;
                    }

                    break;
                case 2:
                    System.out.println("<=============================================================================");
                    for(Item i : biblioteca){
                        i.exibirDetalhes();
                    }
                    System.out.println("=============================================================================>");
                    break;

                case 3:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }

        scanner.close();
    }
}
