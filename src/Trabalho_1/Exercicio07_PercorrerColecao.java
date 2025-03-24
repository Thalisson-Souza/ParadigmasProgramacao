package Trabalho_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio07_PercorrerColecao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> colecaoPaises = new ArrayList<>();

        colecaoPaises.add("Brasil");
        colecaoPaises.add("França");
        colecaoPaises.add("Inglaterra");
        colecaoPaises.add("Espanha");
        colecaoPaises.add("Canadá");
        colecaoPaises.add("África do Sul");
        colecaoPaises.add("Egito");
        colecaoPaises.add("Alemanha");
        colecaoPaises.add("Rússia");

        System.out.println("Digite um País: ");
        String nomePais = scanner.nextLine();

        boolean encontrouIgual = false;
        boolean encontrouContem = false;

        for (String pais : colecaoPaises) {
            if (nomePais.equals(pais)) {
                System.out.println("Existe um país com nome igual ao digitado: " + nomePais);
                encontrouIgual = true;
            }
            if (pais.contains(nomePais)) {
                System.out.println("Encontrei um país cujo nome contenha a String digitada, o país é: " + pais);
                encontrouContem = true;
            }
        }
        if (!encontrouIgual) {
            System.out.println("Não existe nenhum país totalmente igual ao digitado!");
        }
        if (!encontrouContem) {
            System.out.println("Não existe nenhum na coleção de paises com String digitada!");
        }
    }
}
