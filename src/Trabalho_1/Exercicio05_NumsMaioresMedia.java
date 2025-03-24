package exercicios.Trabalho_1;

import java.util.Scanner;

public class Exercicio05_NumsMaioresMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeros[] = new int[10];
        float media = 0;

        System.out.println("Digite 10 numeros inteiros: ");
        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextInt();
            media += numeros[i];
        }

        media = media / 10;
        System.out.println("A media entre os numeros digitados é: " + media);

        System.out.println("Se algum numero digitado for maior que a média, estará listado abaixo! ");
        for (int i = 0; i < 10; i++) {
            if (numeros[i] > media) {
                System.out.println(numeros[i]);
            }
        }

    }
}
