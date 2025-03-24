package exercicios.introducao;

import java.util.Scanner;

public class Exercicio02_MediaEntreNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int primeiroNum = scanner.nextInt();

        System.out.println("Digite o segundo valor: ");
        int segundoNum = scanner.nextInt();

        System.out.println("Digite o terceiro valor: ");
        int terceiroNum = scanner.nextInt();

        System.out.println("a media entre os valores digitados é: " + ((primeiroNum + segundoNum + terceiroNum) / 3 ));
    }
}
