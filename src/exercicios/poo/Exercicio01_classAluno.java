package exercicios.poo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Aluno {
    String nome;
    int idade;
    double nota;

    public Aluno(String nome, double nota, int idade) {
        this.nome = nome;
        this.nota = nota;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getNota() {
        return nota;
    }
}

public class Exercicio01_classAluno {

    public static Aluno exibir(List<Aluno> alunos) {
        for (Aluno aluno : alunos) {
            System.out.printf("\n");
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Idade: " + aluno.getIdade());
            System.out.println("Nota: " + aluno.getNota());
        }
        return null;
    }

    public static void main(String[] args) {
        ArrayList<Aluno> alunos = new ArrayList<Aluno>();
        Scanner scanner = new Scanner(System.in);

        boolean terminou = false;

        while (!terminou) {
            System.out.println("Digite: 'inserir aluno' ou 'sair' para sair da inserção de alunos.");
            String entradaUsuario = scanner.nextLine();

            if (entradaUsuario.equalsIgnoreCase("sair")) {
                terminou = true;
                break;
            }
            if (entradaUsuario.equalsIgnoreCase("inserir aluno")) {
                System.out.println("- Nome do aluno: ");
                String nomeAluno = scanner.nextLine();

                System.out.println("- Idade do aluno: ");
                int idadeAluno = Integer.parseInt(scanner.nextLine());

                System.out.println("- Nota do aluno: ");
                double notaAluno = Double.parseDouble(scanner.nextLine());

                alunos.add(new Aluno(nomeAluno, notaAluno, idadeAluno));
            }
        }
        System.out.println("Dados dos alunos registrados: ");
        exibir(alunos);
    }
}
