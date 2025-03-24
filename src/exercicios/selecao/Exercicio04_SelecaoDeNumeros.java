package exercicios.selecao;

import java.util.Scanner;

public class Exercicio04_SelecaoDeNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 3 numeros: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if(num1 > 0){
            System.out.println("a raiz do " + num1 + " é: " + (Math.sqrt(num1) ));
        } else{
            System.out.printf("O quadrado de %.2f é: %.2f\n", (double) num1, (double) Math.pow(num1, 2));
        }

        if(num2 > 10 && num2 < 100){
            System.out.println("Número " + num2 + " e está entre 10 e 100 - Intervalo permitido");
        }

        if(num3 < num2){
            System.out.println("a diferenca entre " + num2 + " e " + num3 + " é: " + (num2 - num3));
        }else {
            System.out.println("somando 1 ao terceiro numero, gera-> " + num3 + " + 1 resultando em -> " + (num3 + 1));
        }
    }
}
