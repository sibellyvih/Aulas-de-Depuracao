package Atividade1;

import java.util.*;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Saldo inicial: ");
        int saldoInicial = sc.nextInt();

        System.out.print("Número de transações: ");
        int n = sc.nextInt();

        int saldo = saldoInicial;
        int totalEntradas = 0;
        int totalSaidas = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Tipo (1=entrada, 5=saida): ");
            int tipo = sc.nextInt();

            System.out.print("Quantidade (>0): ");
            int qtd = sc.nextInt();

            if (qtd < 0) qtd = -qtd;

            if (tipo == 1) {
                saldo += qtd;
                totalEntradas += qtd;
            } else if (tipo == 5) {
                if (qtd <= saldo) {
                    saldo -= qtd;
                    totalSaidas += qtd;
                }
            } else {
                System.out.println("Rejeitado.");
            }
        }

        int saldoFinal = saldoInicial + totalEntradas - totalSaidas;

        System.out.println("Saldo inicial: " + saldoInicial);
        System.out.println("Total entradas: " + totalEntradas);
        System.out.println("Total saídas: " + totalSaidas);
        System.out.println("Saldo final: " + saldoFinal);

        sc.close();
    }
}
