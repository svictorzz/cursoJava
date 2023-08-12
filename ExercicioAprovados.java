package application;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioAprovados {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos alunos serao digitados? ");
        int n = sc.nextInt();

        String[] nomes = new String[n];
        double[] nota1 = new double[n];
        double[] nota2 = new double[n];
        double[] medias = new double[n];

        for (int i = 0; i < nomes.length; i++) {
            sc.nextLine();
            System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "o aluno: ");
            nomes[i] = sc.nextLine();
            nota1[i] = sc.nextDouble();
            nota2[i] = sc.nextDouble();
        }

        System.out.println("Alunos aprovados: ");
        for (int i = 0; i < medias.length; i++) {
            medias[i] = (nota1[i] + nota2[i]) / 2;
            if (medias[i] >= 6){
                System.out.println(nomes[i]);
            }
        }

        sc.close();
    }
}
