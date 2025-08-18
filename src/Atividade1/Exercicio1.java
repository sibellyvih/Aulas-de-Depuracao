package Atividade1;
import java.util.*;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de itens diferentes: ");
        int itens = sc.nextInt();
        sc.nextLine();

        double subtotal = 0.0;
        int totalQtd = 0;

        for (int i = 0; i < itens; i++) {
            System.out.print("Nome do equipamento: ");
            String nome = sc.nextLine();

            System.out.print("Preço unitário: ");
            double preco = sc.nextDouble();

            System.out.print("Quantidade: ");
            int qtd = sc.nextInt();
            sc.nextLine();

            subtotal += preco * qtd;
            totalQtd += qtd;
        }

        double descontoGeral = subtotal >= 500 ? subtotal * 0.10 : 0.0;
        double imposto = (subtotal - descontoGeral)* 0.12;

        double totalParcial = subtotal - descontoGeral + imposto;

        System.out.print("Forma de pagamento (pix/credito/debito): ");
        String forma = sc.nextLine().trim().toLowerCase();

        double totalFinal;
        if (forma.equals("credito")) {
            double juros = totalParcial * 0.08;
            totalFinal = totalParcial + juros;
        } else if (forma.equals("pix")) {
            double descPix = totalParcial * 0.10;
            totalFinal = totalParcial - descPix;
        } else {
            totalFinal = totalParcial;
        }

        System.out.printf("\nSubtotal: %.2f", subtotal);
        System.out.printf("\nDesconto: %.2f", descontoGeral);
        System.out.printf("\nImposto: %.2f", imposto);
        System.out.printf("\nTotal parcial: %.2f", totalParcial);
        System.out.printf("\nTotal final: %.2f", totalFinal);
    }
}