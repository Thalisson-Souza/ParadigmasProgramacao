package exercicios.Trabalho_1;

import java.util.Scanner;

public class Exercicio09_ContagemRegressiva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int valor = scanner.nextInt();

        System.out.println("A contagem regressiva desse valor até zero: ");
        for (int i = valor; i >= 0; i--) {
            System.out.printf("%d ", i);
        }
    }
}
