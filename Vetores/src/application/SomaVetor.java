package application;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        double[] vetor = new double[n];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um numero: ");
            vetor[i] = sc.nextDouble();
        }

        System.out.println();
        System.out.print("VALORES = ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + "  ");
        }

        double soma = 0.0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }

        double media = soma/n;
        System.out.println();
        System.out.printf("SOMA = %.2f%n", soma);
        System.out.printf("MEDIA = %.2f%n", media);




        sc.close();
    }
}
