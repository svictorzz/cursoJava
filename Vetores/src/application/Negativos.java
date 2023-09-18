package application;

import java.util.Scanner;

public class Negativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números você vai digitar? (max = 10): ");
        int n = sc.nextInt();

        if (n <= 10){
           int[] vect = new int[n];

            for (int i = 0; i < vect.length; i++) {
                System.out.println("Digite um numero: ");
                vect[i] = sc.nextInt();
            }

            System.out.println("NUMEROS NEGATIVOS: ");

            for (int i = 0; i < vect.length; i++) {
                if (vect[i] < 0) {
                    System.out.println(vect[i]);
                }
            }

        } else {
            System.out.println("O valor máximo para n é 10.");
        }

        sc.close();
    }
}
