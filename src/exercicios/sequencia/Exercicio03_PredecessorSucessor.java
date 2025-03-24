package exercicios.introducao;

import java.util.Scanner;

public class Exercicio03_PredecessorSucessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num = scanner.nextInt();

        System.out.println("o antecessor é: " + (num - 1) + " e o sucessor é: " + (num + 1) );
    }
}
