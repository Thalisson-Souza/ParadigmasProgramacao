package exercicios.selecao;

import java.util.Scanner;

public class Exercicio08_SelecaoComBaseIndice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Indice de poluição, Indústria X: ");
        double indice = scanner.nextDouble();

        if (indice >= 0.05 && indice <= 0.29) {
            System.out.println("Indice Estável de poluição estável, se encontra em: " + indice);
        } else if (indice >= 0.3 && indice <= 0.39){
            System.out.println("Atenção! Indústria do 1º grupo devem parar suas atividades imediatamente!");
        } else if(indice >= 0.4 && indice <= 0.49){
            System.out.println("Atenção! Indústrias do 1º e 2º grupo devem imediatamente suspender as suas atividades!");
        } else if(indice > 0.5){
            System.out.println("Atenção! Notificação emergente de alerta de paralisação!");
        } else {
            System.out.println("Indice invalido!");
        }

    }
}
