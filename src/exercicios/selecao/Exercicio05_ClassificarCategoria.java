package exercicios.selecao;

import java.util.Scanner;

public class Exercicio05_ClassificarCategoria {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String categoria[] = {"infantil A", "infantil B", "Juvenil A", "Juvenil B", "Sênior", "infelizmente voce não tem categoria /:"};

        System.out.println("Nadador, digite sua idade para saber sua categoria: ");
        int idade = scanner.nextInt();
        String minhaCategoria = "";

        if(idade >= 5 && idade <= 7){
            minhaCategoria = categoria[0];
        } else if(idade >= 8 && idade <= 10){
            minhaCategoria = categoria[1];
        } else if(idade >= 11 && idade <= 13){
            minhaCategoria = categoria[2];
        } else if(idade >= 14 && idade <= 17){
            minhaCategoria = categoria[3];
        } else if(idade > 18){
            minhaCategoria = categoria[4];
        } else {
            minhaCategoria = categoria[5];
        }

        System.out.println("Resultado: " + minhaCategoria);
    }
}
