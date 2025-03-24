package exercicios.introducao;

import java.util.Scanner;

public class Exercicio12_ClassificacaoTriangulos {
    public static void main(String[] args) {

        System.out.println("Digite 3 valores inteiros, respectivamente: ");
        var primeiroLado = new Scanner(System.in).nextInt();
        var segundoLado = new Scanner(System.in).nextInt();
        var terceiroLado = new Scanner(System.in).nextInt();

        if ((primeiroLado + segundoLado) > terceiroLado) {
            System.out.println("é possivel formar uma triângulo!");
            if((primeiroLado != segundoLado) && (primeiroLado != terceiroLado) && (primeiroLado != terceiroLado)) {
                System.out.println("Triângulo Escaleno, possui todos lados diferentes: " + primeiroLado + ", " + segundoLado + ", " + terceiroLado);

            } if (primeiroLado == segundoLado && primeiroLado == terceiroLado) {
                System.out.println("Triângulo Equilatero, possui todos lados iguais: " + primeiroLado + ", " + segundoLado + ", " + terceiroLado);
            } if ((primeiroLado == segundoLado) || (primeiroLado == terceiroLado) || (segundoLado == terceiroLado)) {
                System.out.println("Triângulo Isóceles, possui apenas dois lados iguais: "  + primeiroLado + ", " + segundoLado + ", " + terceiroLado);
            }

        } else {
            System.out.println("não é possivel formar um triângulo!, lado 1 + lado 2 é menor que o lado 3. ");
        }
    }
}
