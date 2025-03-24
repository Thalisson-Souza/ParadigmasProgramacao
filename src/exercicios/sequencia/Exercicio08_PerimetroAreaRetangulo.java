package exercicios.introducao;

import java.util.Scanner;

public class Exercicio08_PerimetroAreaRetangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double base, altura;

        System.out.println("Digite a base e altura do triangulo:");
        altura = scanner.nextDouble();
        base = scanner.nextDouble();

        double area = base * altura;
        double perimetro = 2 * (base * altura);

        System.out.printf("a area é: %.2f%n", area);
        System.out.printf("o perimetro é: %.2f%n", perimetro);
    }
}
