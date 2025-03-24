package exercicios.introducao;

import java.util.Scanner;

public class Exercicio14_AnaliseNumerosParImpar {
    public static void main(String[] args) {

        int numeros[] = new int[100];
        int cont = 0;
        int contPares = 0;
        int maiorPar = 0;
        int quantosImpares = 0;
        int contImparMaior = 0;
        double mediaImpares = 0.0;
        int somaImpares = 0;

        System.out.println("Digite numeros até descobrir a condição de parada: ");
        while (true) {
            numeros[cont] = new Scanner(System.in).nextInt();

            if(numeros[cont] <= 0) {
                break;
            } else {
                if(numeros[cont] % 2 == 0) {
                    contPares++;
                    if (numeros[cont] > maiorPar) {
                        maiorPar = numeros[cont];
                    }
                    cont++;
                } else {
                    somaImpares += numeros[cont];
                    if(numeros[cont] > maiorPar) {
                        contImparMaior++;
                    }
                    quantosImpares = ((cont + 1) - contPares);
                    mediaImpares =  somaImpares / quantosImpares;
                    cont++;
                }
            }
        }
        System.out.println("a quantidade numeros pares digitados foi: "+ contPares);
        System.out.println("a media dos impares foi: " + mediaImpares);
        System.out.println("o maior numero Par é: " + maiorPar);
        System.out.println("a quantidade de valores ímpares maiores que o maior par é: " + contImparMaior);
    }
}
