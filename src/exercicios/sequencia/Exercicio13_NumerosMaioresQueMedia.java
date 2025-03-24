package exercicios.introducao;

import java.util.Scanner;

public class Exercicio13_NumerosMaioresQueMedia {
    public static void main(String[] args) {

        int numeros[] = new int[5];
        int somaInteiros = 0;
        int media = 0;

        System.out.println("Digite 5 numeros: ");
        for (int i = 0; i < 5; i++) {
            numeros[i] = new Scanner(System.in).nextInt();
            somaInteiros += numeros[i];
        }

        media = (somaInteiros / 5);
        System.out.println("a media é: "+ media);

        System.out.println("os valores que são maiores que a media " + media + " é o: ");
        for (int i = 0; i < 5; i++) {
            if(numeros[i] >= media){
                System.out.println(numeros[i]);
            }
        }
    }
}
