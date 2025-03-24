package exercicios.selecao;

import java.util.Scanner;

public class Exercicio08_SaldoVariancaCredito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu saldo médio: ");
        double saldoMedio = scanner.nextDouble();

        if(saldoMedio >= 0 && saldoMedio <= 200.00) {
            System.out.println("Infelizmente, sem nenhum crédito no momento!");
        } else if (saldoMedio > 200.00 && saldoMedio <= 400.00) {
            System.out.println("O seu percentual de credito é: " + (0.2 * saldoMedio));
        } else if(saldoMedio > 400.00 && saldoMedio <= 600.00){
            System.out.println("O seu percentual de credito é: " + (0.3 * saldoMedio));
        } else if(saldoMedio > 600.00){
            System.out.println("O seu percentual de credito é: " + (0.4 * saldoMedio));
        }

    }
}
