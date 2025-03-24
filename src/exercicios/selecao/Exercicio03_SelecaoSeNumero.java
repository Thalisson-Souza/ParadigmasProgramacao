package exercicios.selecao;

import java.util.Scanner;

public class Exercicio03_SelecaoSeNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maior = 0;

        System.out.println("Digite dois numero: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if (num1 == num2) {
            System.out.println("numero iguais");
            System.exit(0);
        } else {
            if(num1 > num2) {
                maior = num1;
            }else {
                maior = num2;
            }
            System.out.println(maior);
        }
    }
}
