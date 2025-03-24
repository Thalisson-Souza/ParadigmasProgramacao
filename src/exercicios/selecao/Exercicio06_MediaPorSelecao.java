package exercicios.selecao;

import java.util.Scanner;

public class Exercicio06_MediaPorSelecao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota da prova: ");
        double notas1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota da prova: ");
        double notas2 = scanner.nextDouble();

        System.out.println("Digite o número de aulas ministradas em todo semestre: ");
        int aulasMinistradas = scanner.nextInt();

        System.out.println("Quantas aulas você assistiu? ");
        int aulasAssistidas = scanner.nextInt();

        int mediaProvas = (int)(notas1 + notas2) / 2;
        double frequenciaAluno = ( (aulasAssistidas * 100 ) / aulasMinistradas);
        boolean aprovado = (mediaProvas >= 6) && (frequenciaAluno >= 75.0);

        if(aprovado) {
            System.out.println("aluno aprovado com media " + mediaProvas + " e frequencia de %" + (int) frequenciaAluno);
        }else {
            if(frequenciaAluno < 75.0) {
                System.out.println("Aluno reprovado por frequencia! " + frequenciaAluno);
            } else {
                System.out.println("Aluno reprovado por nota " + mediaProvas);
            }
        }
    }
}
