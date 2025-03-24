package exercicios.introducao;

import java.util.Scanner;

public class Exercicio06_MediaPonderada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numeros[] = new double[4];
        double pesos[] = {1 , 2, 3, 4};
        double valueVezes = 0;
        int somaPesos = 0;

        System.out.println("Digite quatro numeros: ");

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextDouble();
            valueVezes += numeros[i] * pesos[i];
            somaPesos += pesos[i];
        }
        System.out.println(valueVezes / somaPesos);
    }
}
