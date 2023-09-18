package application;

import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao {
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

        double maiorValor = vetor[0];
        int posicaoMaiorValor = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] >= maiorValor){
                maiorValor = vetor[i];
                posicaoMaiorValor = i;
            }
        }

        System.out.println();
        System.out.println("MAIOR VALOR = " + maiorValor);
        System.out.println("POSICAO DO MAIOR VALOR = " + posicaoMaiorValor);


        sc.close();
    }
}
