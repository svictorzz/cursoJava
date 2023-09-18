package application;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class MediaPares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        int[] vetor = new int[n];

        boolean temPar = false;
        double somaPares = 0;
        int qtdPar = 0;

        for (int i = 0; i < vetor.length; i++){
            System.out.println("Digite um numero: ");
            vetor[i] = sc.nextInt();
            if (vetor[i] % 2 == 0){
                temPar = true;
            }
        }

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0){
                somaPares += vetor[i];
                qtdPar++;
            }
        }

        if (temPar == true){
            System.out.printf("MEDIA DOS PARES = %.1f", (somaPares/qtdPar));
        } else {
            System.out.println("NENHUM NUMERO PAR");
        }

    }
}
