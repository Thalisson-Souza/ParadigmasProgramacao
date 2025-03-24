package exercicios.introducao;

import java.util.Scanner;

public class Exercicio11_PerimetroAreaRetangulo {
    public static void main(String[] args) {

        System.out.println("Digite um valor racional para um lado do retângulo: ");
        var primeiroLado = new Scanner(System.in).nextInt();

        System.out.println("Digite um segundo valor racional para o outro lado do retângulo: ");
        var segundoLado = new Scanner(System.in).nextInt();

        var area = (primeiroLado * segundoLado);
        var perimetro = (primeiroLado + segundoLado);

        System.out.println("a area do retângulo é: " + area);
        System.out.println("o perimetro do retângulo é: " + perimetro);
    }
}
