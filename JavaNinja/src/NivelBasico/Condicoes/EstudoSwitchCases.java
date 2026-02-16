package NivelBasico.Condicoes;

import java.util.Scanner;

public class EstudoSwitchCases {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um personagem: ");

        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("3 - Sakura Haruno");

        int escolha = scanner.nextInt();

        switch (escolha){
            case 1:
                System.out.println("A escolha do usuário foi: Naruto Uzumaki");
                break;
            case 2:
                System.out.println("A escolha do usuário foi: Sasuke Uchiha");
                break;
            case 3:
                System.out.println("A escolha do usuário foi: Sakura Haruno");
                break;
            default:
                System.out.println("Você não digitou uma resposta válida.");
        }

        scanner.close();

    }
}
