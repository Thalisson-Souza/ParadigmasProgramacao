package exercicios.introducao.selecao;

import java.util.Scanner;

public class Exercicio01_DiferencaMaiorMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite dois valores: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if(num1 > num2){
            System.out.println("o maior é: " + num1 + " a diferença dele para " + num2 + " é: " + (num1 - num2 ));
        } else {
            System.out.println("o maior é: " + num2 + " a diferença dele para " + num1 + " é: " + (num2 - num1 ));
        }
    }
}
