package Trabalho_1;

import java.util.Scanner;

public class Exercicio10_EscolhaRepete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean sair = false;

        System.out.println("Menu");
        System.out.println("----------------");
        System.out.println("1. Opção 1");
        System.out.println("2. Opção 2");
        System.out.println("3. Opção 3");
        System.out.println("4. Sair");
        System.out.println("----------------");
        System.out.println("Digite a opção desejada: ");

        while (!sair) {
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Opção " + opcao + " selecionada");
                    break;
                case 2:
                    System.out.println("Opção " + opcao + " selecionada");
                    break;
                case 3:
                    System.out.println("Opção " + opcao + " selecionada");
                    break;
                case 4:
                    System.out.println("Saindo do programa...");
                    sair = true;
                    break;
                default:
                    System.out.println("Entrada invalida!");
                    break;
            }
        }
    }
}
