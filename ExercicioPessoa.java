package application;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioPessoa {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas você vai digitar?");
        int n = sc.nextInt();


        String[] nomes = new String[n];
        int[] idades = new int[n];
        int maiorIdade = 0;
        String pessoaMaisVelha = " ";

        for (int i = 0; i < nomes.length; i++) {
            sc.nextLine();
            System.out.println("Dados da " + (i+1) + "a pessoa: ");
            System.out.println("Nome: ");
            nomes[i] = sc.nextLine();
            System.out.println("Idade: ");
            idades[i] = sc.nextInt();

        }

        for (int i = 0; i < idades.length; i++) {
            if (idades[i] > maiorIdade){
                maiorIdade = idades[i];
                pessoaMaisVelha = nomes[i];
            }
        }

        System.out.println("PESSOA MAIS VELHA: " + pessoaMaisVelha);


        sc.close();
    }
}
