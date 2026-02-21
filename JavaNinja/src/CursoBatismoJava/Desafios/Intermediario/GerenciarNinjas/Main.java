package CursoBatismoJava.Desafios.Intermediario.GerenciarNinjas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Ninja> listaNinjas = new ArrayList<>();

        Uchiha Obito = new Uchiha();
        Uchiha Madara = new Uchiha();
        Uchiha Sasuke = new Uchiha();

        Ninja Kakashi = new Ninja();
        Ninja Tobirama = new Ninja();
        Ninja Naruto = new Ninja();

        Kakashi.nome = "Kakashi Hatake";
        Kakashi.idade = 36;
        Kakashi.missao = "Derrotar Obito";
        Kakashi.statusMissao = "Não iniciada";

        Tobirama.nome = "Tobirama Senju";
        Tobirama.idade = 55;
        Tobirama.missao = "Derrotar Madara";
        Tobirama.statusMissao = "Concluída";

        Naruto.nome = "Naruto Uzumaki";
        Naruto.idade = 17;
        Naruto.missao = "Impedir Sasuke";
        Naruto.statusMissao = "Em andamento";

        Obito.nome = "Obito Uchiha";
        Obito.idade = 35;
        Obito.missao = "Capturar todas as Bijus";
        Obito.statusMissao = "Concluída";
        Obito.habilidadeEspecial = "Kamui";

        Madara.nome = "Madara Uchiha";
        Madara.idade = 54;
        Madara.missao = "Prender o mundo no Mangekyou";
        Madara.statusMissao = "Em andamento";
        Madara.habilidadeEspecial = "Limbo: Hengoku ";

        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.idade = 18;
        Sasuke.missao = "Destruir Konoha";
        Sasuke.statusMissao = "Em andamento";
        Sasuke.habilidadeEspecial = "Amaterasu";

        listaNinjas.add(Kakashi);
        listaNinjas.add(Tobirama);
        listaNinjas.add(Naruto);
        listaNinjas.add(Obito);
        listaNinjas.add(Madara);
        listaNinjas.add(Sasuke);

        Scanner scanner = new Scanner(System.in);
        int option = 0;

        while(option != 3){
            System.out.println("========== MENU ==========");
            System.out.println("= 1 - Novo ninja         =");
            System.out.println("= 2 - Exibir ninjas      =");
            System.out.println("= 3 - Sair               =");
            System.out.println("==========================");

            option = scanner.nextInt();
            scanner.nextLine();

            switch(option){
                case 1:
                    System.out.println("========== Novo Ninja ==========");
                    System.out.println("= 1 - Uchiha");
                    System.out.println("= 2 - Outro clã");
                    System.out.println("================================");

                    option = scanner.nextInt();
                    scanner.nextLine();


                    switch (option) {
                        case 1:
                            Uchiha novoUchiha = new Uchiha();

                            System.out.print("Digite o nome: ");
                            String nomeUchiha = scanner.nextLine();

                            System.out.print("Digite a idade: ");
                            int idadeUchiha = scanner.nextInt();
                            scanner.nextLine();

                            System.out.print("Qual é a missão dele: ");
                            String missaoUchiha = scanner.nextLine();

                            System.out.print("Status da missão: ");
                            String statusUchiha = scanner.nextLine();

                            System.out.print("Habilidade especial: ");
                            String habilidade = scanner.nextLine();

                            novoUchiha.nome = nomeUchiha;
                            novoUchiha.idade = idadeUchiha;
                            novoUchiha.missao = missaoUchiha;
                            novoUchiha.statusMissao = statusUchiha;
                            novoUchiha.habilidadeEspecial = habilidade;

                            listaNinjas.add(novoUchiha);

                            break;

                        case 2:
                            Ninja novoNinja = new Ninja();

                            System.out.print("Digite o nome: ");
                            String nome = scanner.nextLine();

                            System.out.print("Digite a idade: ");
                            int idade = scanner.nextInt();
                            scanner.nextLine();

                            System.out.print("Qual é a missão dele: ");
                            String missao = scanner.nextLine();

                            System.out.print("Status da missão: ");
                            String status = scanner.nextLine();

                            novoNinja.nome = nome;
                            novoNinja.idade = idade;
                            novoNinja.missao = missao;
                            novoNinja.statusMissao = status;

                            listaNinjas.add(novoNinja);

                            break;
                    }
                    break;
                case 2:
                    System.out.println("<========================================================================");
                    for(Ninja i : listaNinjas){
                        i.exibirDetalhes();
                    }
                    System.out.println("========================================================================>\"");

                case 3:
                    System.out.println("Saindo dos registros...");
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }
}
