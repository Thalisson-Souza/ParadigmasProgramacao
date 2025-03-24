package Trabalho_1;

import java.util.Scanner;

public class Exercicio02_AreaPerimetro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor racional para um lado do retângulo: ");
        var primeiroLado = new Scanner(System.in).nextInt();

        System.out.println("Digite um segundo valor racional para o outro lado do retângulo: ");
        var segundoLado = new Scanner(System.in).nextInt();

        var area = (primeiroLado * segundoLado);
        var perimetro = 2 * (primeiroLado + segundoLado);

        System.out.println("a area do retângulo é: " + area);
        System.out.println("o perimetro do retângulo é: " + perimetro);
    }
}
