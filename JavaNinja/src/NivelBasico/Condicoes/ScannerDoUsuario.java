package NivelBasico.Condicoes;

import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {

        Scanner caixaDeTexto = new Scanner(System.in);

        System.out.println("Escolha o nome do ninja:");
        String nome = caixaDeTexto.nextLine();
        System.out.println("Nome do Ninja: " + nome);

        System.out.println("Digite a idade do ninja:");
        int idade = caixaDeTexto.nextInt();
        if (idade >= 18){
            System.out.println("Seu ninja tem " + idade + " anos, ele é maior de idade!");
        } else {
            System.out.println("Seu ninja tem " + idade + " anos, ele é menor de idade.");
        }

        caixaDeTexto.close();

    }
}
