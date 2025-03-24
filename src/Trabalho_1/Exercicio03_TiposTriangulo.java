package Trabalho_1;

import java.util.Scanner;

public class Exercicio03_TiposTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 3 valores inteiros, para representar as dimensões de um triângulo respectivamente: ");
        int primeiroLado = scanner.nextInt();
        int segundoLado = scanner.nextInt();
        int terceiroLado = scanner.nextInt();

        if ((primeiroLado + segundoLado) > terceiroLado) {
            System.out.println("é possivel formar uma triângulo!");

            if((primeiroLado != segundoLado) && (primeiroLado != terceiroLado) && (primeiroLado != terceiroLado)) {
                System.out.println("Triângulo Escaleno, possui todos lados diferentes: " + primeiroLado + ", " + segundoLado + ", " + terceiroLado);
            }
            if (primeiroLado == segundoLado && primeiroLado == terceiroLado) {
                System.out.println("Triângulo Equilatero, possui todos lados iguais: " + primeiroLado + ", " + segundoLado + ", " + terceiroLado);
            }
            if ((primeiroLado == segundoLado) || (primeiroLado == terceiroLado) || (segundoLado == terceiroLado)) {
                System.out.println("Triângulo Isóceles, possui apenas dois lados iguais: "  + primeiroLado + ", " + segundoLado + ", " + terceiroLado);
            }
        } else {
            System.out.println("não é possivel formar um triângulo!, lado 1 + lado 2 é menor que o lado 3. ");
        }
    }
}
