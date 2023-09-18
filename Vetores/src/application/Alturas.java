package application;

import entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Alturas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serão digitadas? ");
        int qtdPessoas = sc.nextInt();

        Pessoa[] pessoas = new Pessoa[qtdPessoas];

        for (int i = 0; i < qtdPessoas; i++) {
            System.out.println("Dados da " +  (i+1) + "a pessoa: ");
            sc.nextLine();
            System.out.println("Nome: ");
            String nome = sc.nextLine();
            System.out.println("Idade: ");
            int idade = sc.nextInt();
            System.out.println("Altura: ");
            double altura = sc.nextDouble();

            pessoas[i] = new Pessoa(nome, idade, altura);
        }

        double alturaTotal = 0;
        int pessoasMenores16 = 0;
        String nomeMenores16 = " ";

        for (int i = 0; i < qtdPessoas; i++) {
            alturaTotal += pessoas[i].getAltura();
            if (pessoas[i].getIdade() < 16){
                pessoasMenores16++;
                if (pessoasMenores16 == 1){
                    nomeMenores16 += pessoas[i].getNome();
                } else {
                    nomeMenores16 += "\n" + pessoas[i].getNome();
                }
            }
        }

        double alturaMedia = alturaTotal/qtdPessoas;
        double percentualMenores16 = (pessoasMenores16 * 100)/ qtdPessoas;

        System.out.printf("Altura media: %.2f%n", alturaMedia);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percentualMenores16);

        if (pessoasMenores16 > 0){
            System.out.println(nomeMenores16);
        }


        sc.close();
    }
}
