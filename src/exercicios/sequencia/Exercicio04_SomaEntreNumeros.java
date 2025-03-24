package exercicios.introducao;

import java.util.Scanner;

public class Exercicio04_SomaEntreNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite outro numero: ");
        int num2 = scanner.nextInt();

        System.out.println("a soma deles é: " + (num1 + num2));
    }
}
