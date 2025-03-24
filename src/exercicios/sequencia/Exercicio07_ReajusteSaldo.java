package exercicios.introducao;

import java.util.Scanner;

public class Exercicio07_ReajusteSaldo {
    public static void main(String[] args) {
        double porcento = 1.0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saldo da aplicação: ");
        double saldo = scanner.nextDouble();

        double taxa = porcento / 100.0;
        double total = saldo * taxa;
        double saldoAtualizado = saldo + total;
        System.out.println("seu novo saldo é: " + saldoAtualizado);
    }
}
