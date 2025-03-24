package Trabalho_1;

import java.util.Scanner;

public class Exercicio04_FormulaBhaskara {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os 3 coeficientes de uma equação de segundo grau (A, B e C), respectivamente: ");
        var coeficienteA = scanner.nextInt();
        var coeficienteB = scanner.nextInt();
        var coeficienteC = scanner.nextInt();

        var delta = (Math.pow(coeficienteB, 2) ) - 4 * coeficienteA * coeficienteC;
        var raizDelta = Math.sqrt(delta);
        var xLinha = ( -coeficienteB + raizDelta) / (2 * coeficienteA);
        var xDuasLinha = ( -coeficienteB - raizDelta) / (2 * coeficienteA);

        if(delta < 0) {
            System.out.println("A equação: " + coeficienteA + "x^2 + " + coeficienteB + "x + " + coeficienteC + " não tem raizes reais!!");
        } else {
            System.out.println("As raizes do x': " + xLinha);
            System.out.println("As raizes do x'': " + xDuasLinha);
        }
    }
}
