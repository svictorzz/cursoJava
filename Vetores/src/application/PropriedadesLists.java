package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PropriedadesLists {
    public static void main(String[] args) {

        // não tem como instanciar uma lista com new List<>, tem que usar algum outra classe tipo ArrayList<>
        List<String> list = new ArrayList<>();

        // adicionando itens na lista
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add("Marco");

        // imprimindo a lista com for each
        for (String x: list){
            System.out.println(x);
        }

        // imprimindo o tamanho da lista
        System.out.println(list.size());

        // imprimindo uma lista sem os nomes que começam com a letra M
        list.removeIf(x -> x.charAt(0) == 'M');
        for (String x: list){
            System.out.println(x);
        }

        // imprimindo o index de um elemento da lista
        System.out.println("Index of Marco: " + list.indexOf("Marco"));

        // imprimindo a lista só com elementos que começam com a letra A
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        // imprimindo o primeiro elemento da lista que começa com J, se não existir, retorna null
        String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(name);

    }


}
