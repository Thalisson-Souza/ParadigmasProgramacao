package exercicios.selecao;

import java.util.Scanner;

public class Exercicio10_QualCodigoVenda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o codigo do produto: ");
        int codigo = scanner.nextInt();

        System.out.println("Digite a quantidade comprada: ");
        int quantidade = scanner.nextInt();

        if(codigo == 1001){
            System.out.printf("O preço da unidade é $5.32, totalizando  pela quantia de %d unidades fica $%.2f\n", quantidade, (double)(quantidade * 5.32));
        } else if(codigo == 1324){
            System.out.printf("O preço da unidade é $6.45, totalizando  pela quantia de %d unidades fica $%.2f\n", quantidade, (double)(quantidade * 6.45));
        } else if(codigo == 6548){
            System.out.printf("O preço da unidade é $2.37, totalizando  pela quantia de %d unidades fica $%.2f\n", quantidade, (double)(quantidade * 2.37));
        } else if(codigo == 987){
            System.out.printf("O preço da unidade é $5.32, totalizando pela quantia de %d unidades fica $%.2f\n", quantidade, (double)(quantidade * 5.32));
        } else if(codigo == 7623){
            System.out.printf("O preço da unidade é $6.45, totalizando pela quantia de %d unidades fica $%.2f\n", quantidade, (double)(quantidade * 6.45));
        } else{
            System.out.println("Codigo Invalido, não temos esse produto!");
        }

    }
}
