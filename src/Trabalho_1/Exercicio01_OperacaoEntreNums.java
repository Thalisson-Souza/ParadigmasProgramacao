package exercicios.Trabalho_1;

import java.util.Scanner;

public class Exercicio01_OperacaoEntreNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite um segundo número inteiro: ");
        int num2 = scanner.nextInt();

        int soma = num1 + num2;
        int subtracao = num1 - num2;
        int multiplicacao = num1 * num2;
        int divisao = num1 / num2;

        System.out.println("As operações entre eles são:");
        System.out.println("soma: " + soma);
        System.out.println("subtração: " + subtracao);
        System.out.println("multiplicação: " + multiplicacao);
        System.out.println("divisão: " + divisao);
    }
}
