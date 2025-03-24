package exercicios.introducao;

import java.util.Scanner;

public class Exercicio05_TercaParteNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        double num = scanner.nextDouble();

        System.out.println("a terça parte desse numero é: " + (num / 3 ) );
    }
}
