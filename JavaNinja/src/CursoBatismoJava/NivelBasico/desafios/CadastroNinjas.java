package CursoBatismoJava.NivelBasico.desafios;

import java.util.Scanner;

public class CadastroNinjas {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int max = 10;
        int option = 0;
        int cadastros = 0;

        String[] ninjas = new String[max];
        int[] idades = new int[max];

        while(option != 3) {
            System.out.println("\n========== Menu ==========");
            System.out.println("1 - Cadastrar Ninja");
            System.out.println("2 - Lista de Ninjas");
            System.out.println("3 - Sair");
            System.out.println("\n==========================");

            option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 1:
                    if (cadastros < max) {
                        System.out.println("Digite o nome e idade do ninja");
                        System.out.print("Nome: ");
                        String nome = scanner.nextLine();
                        ninjas[cadastros] = nome;
                        System.out.print("Idade: ");
                        int idade = scanner.nextInt();
                        scanner.nextLine();
                        idades[cadastros] = idade;
                        cadastros++;
                    } else {
                        System.out.println("Máximo de ninjas cadastrador");
                    }
                    break;
                case 2:
                    for(int i = 0; i < cadastros; i++) {
                        System.out.println(i+1 + " - " + ninjas[i] + ", " + idades[i] + " anos");
                    }
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opção inválida!");

            }


        }

        scanner.close();
    }
}
