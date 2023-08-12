package application;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioDadosPessoas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        double[] alturas = new double[n];
        char[] genero = new char[n];
        double menorAltura = Double.MAX_VALUE;
        double maiorAltura = Double.MIN_VALUE;
        double somaAlturaM = 0.0;
        int qtdMulheres = 0;

        for (int i = 0; i < alturas.length; i++) {
            sc.nextLine();
            System.out.println("Altura da " + (i+1) + "a pessoa: ");
            alturas[i] = sc.nextDouble();
            System.out.println("Genero da " + (i+1) + "a pessoa: ");
            genero[i] = sc.next().charAt(0);
        }

        for (int i = 0; i < alturas.length; i++) {
            if (alturas[i] <= menorAltura){
                menorAltura = alturas[i];
            }
        }
        System.out.println("Menor altura: " + menorAltura);

        for (int i = 0; i < alturas.length; i++) {
            if (alturas[i] >= maiorAltura){
                maiorAltura = alturas[i];
            }
        }
        System.out.println("Maior altura: " + maiorAltura);

        for (int i = 0; i < alturas.length; i++) {
            if (genero[i] == 'f'){
                somaAlturaM += alturas[i];
                qtdMulheres++;
            }
        }

        System.out.printf("Media das alturas das mulheres: %.2f%n", (somaAlturaM/qtdMulheres));
        System.out.println("Numero de homens: " + (n-qtdMulheres));

        sc.close();
    }
}
