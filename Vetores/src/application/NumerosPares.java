package application;

import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        int qtdPares = 0;

        int[] vetor = new int[n];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um numero: ");
            vetor[i] = sc.nextInt();
        }

        System.out.println("NUMEROS PARES: ");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0){
                System.out.println(vetor[i]);
                qtdPares++;
            }
        }

        System.out.println("QUANTIDADE DE PARES = " + qtdPares);


        sc.close();
    }
}
