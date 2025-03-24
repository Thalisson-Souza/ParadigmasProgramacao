package exercicios.selecao;

import java.util.Scanner;

public class Exercicio02_ParImparPositivoNegativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0 && numero > 0) {
            System.out.println("numero par positivo");
        } else if (numero % 2 == 0 && numero < 0) {
            System.out.println("numero par negativo");
        }

        if (numero % 2 != 0 && numero < 0) {
            System.out.println("numero impar negativo");
        } else if (numero % 2 != 0 && numero > 0) {
            System.out.println("numero impar positivo");
        }
    }
}
