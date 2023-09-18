package application;

import java.util.Scanner;

public class Encaixa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[5];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Insira o valor na posição " + i + " do vetor A(4 digitos): ");
            int num = sc.nextInt();

            if (num >= 1000 && num <= 9999){
                vetorA[i] = num;
            } else {
                System.out.println("O numero deve ter 4 digitos.");
                i--;
            }
        }

        for (int i = 0; i < vetorB.length; i++) {
            System.out.println("Insira o valor na posição " + i + " do vetor B(2 digitos): ");
            int num = sc.nextInt();

            if (num >= 10 && num <= 99){
                vetorB[i] = num;
            } else {
                System.out.println("O numero deve ter 2 digitos.");
                i--;
            }
        }

        System.out.println();

        System.out.println("Vetor A    Vetor B");
        for (int i = 0; i < vetorA.length; i++) {
            int numA = vetorA[i];
            int numB = vetorB[i];

            String strA = Integer.toString(numA);
            String strB = Integer.toString(numB);


            System.out.print("[" + vetorA[i] + "]" + "     [" + vetorB[i] + "]");

            if (strA.endsWith(strB)) {
                System.out.println(" encaixa");
            } else {
                System.out.println(" não encaixa");
            }
        }

        sc.close();
    }


}
