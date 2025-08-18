import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de alunos: ");
        int qtd = sc.nextInt();
        sc.nextLine();

        String[] nomes = new String[qtd];
        double[] notas = new double[qtd];

        double soma = 0.0;

        for (int i = 0; i < qtd; i++) {
            System.out.print("Nome do aluno: ");
            nomes[i] = sc.nextLine();

            System.out.print("Nota do aluno: ");
            notas[i] = sc.nextDouble();
            sc.nextLine();

            soma += notas[i];
        }

        double media = soma / qtd;

        System.out.println("\nMédia da turma: " + media);
        System.out.println("Resultado:");

        for (int i = 0; i < qtd; i++) {
            if (notas[i] >= media) {
                System.out.println(nomes[i] + " - Aprovado");
            } else {
                System.out.println(nomes[i] + " - Retido");
            }
        }

        sc.close();
    }
}