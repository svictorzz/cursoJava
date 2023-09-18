package application;

import java.util.Scanner;

public class Divisores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] Num = new int[10];
        int[] Divis = new int[5];

        System.out.println("Digite 10 números inteiros para o vetor Num:");
        for (int i = 0; i < Num.length; i++) {
            Num[i] = scanner.nextInt();
        }

        System.out.println("Digite 5 números inteiros para o vetor Divis:");
        for (int i = 0; i < Divis.length; i++) {
            Divis[i] = scanner.nextInt();
        }



        for (int i = 0; i < Num.length; i++) {
            System.out.println("Numero " + Num[i] );
            boolean divisorEncontrado = false;

            for (int j = 0; j < Divis.length; j++) {
                if (Num[i] % Divis[j] == 0) {
                    System.out.println("Divisivel por " + Divis[j] + " na posição " + j + "");
                    divisorEncontrado = true;
                }
            }

            if (!divisorEncontrado){
                System.out.println("Não possui divisores no segundo vetor");
            }

            System.out.println();
        }

        scanner.close();
    }
}
