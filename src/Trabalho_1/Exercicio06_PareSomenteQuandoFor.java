package Trabalho_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio06_PareSomenteQuandoFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numsPares = 0;
        int maiorPar = 0;
        int somaImpares = 0;
        int quantosImpares = 0;
        double mediaImpares = 0;
        int valorImparesMaiorQuePares = 0;

        ArrayList<Integer> listaNum = new ArrayList<>();

        System.out.println("Digite números à vontade e descubra a condição de parada: ");
        while(true) {
            int numeros = scanner.nextInt();

            if(numeros == 0) {
                System.out.println("Valor 0 digitado! Essa era a condição de parada!");
                break;
            } else {
                if(numeros % 2 == 0) {
                    if(numeros > maiorPar) {
                        maiorPar = numeros;
                    }
                    numsPares++;
                }

                if(numeros % 2 != 0){
                    somaImpares += numeros;
                    quantosImpares++;
                    if (numeros > maiorPar) {
                        valorImparesMaiorQuePares++;
                    }
                }
                listaNum.add(numeros);
            }
        }

        if (quantosImpares > 0) {
            mediaImpares = (double)somaImpares / quantosImpares;
        }

        System.out.println("A quantidade de valores pares lidos foi: " + numsPares);
        System.out.println("A média dos números impares lidos foi: " + mediaImpares);
        System.out.println("O maior par lido foi: " + maiorPar);
        System.out.println("A quantidade de valores ÍMPARES maiores que o MAIOR PAR é: " + valorImparesMaiorQuePares);
    }
}
