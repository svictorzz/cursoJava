package application;

import entities.Product;
import util.PriceUpdate;
import util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.0));
        list.add(new Product("Mouse", 30.0));
        list.add(new Product("Tablet", 350.0));
        list.add(new Product("HD Case", 80.9));

        // cria uma lista de String com nomes maiusculos -> converte pra stream, usa o map() e dps converte pra list dnv
        List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());

        /*
        Outras formas:
        1. criar um metodo static na classe Product:

        public static String staticUpperCaseName(Product p){
            return p.getName().toUpperCase();
        }

        List<String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());

        ---------------------------------------------------
        2. criar um metodo nao static na classe Product:

        public String nonStaticUpperCaseName(){
            return name.toUpperCase();
        }

        List<String> names = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());
        -------------------------------------------------
        3. Expressão lambda declarada:

        Function<Product, String> func = p -> p.getName().toUpperCase();

        List<String> names = list.stream().map(func).collect(Collectors.toList());
        --------------------------------------------------
        4. Expressão lambda inline:

        List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
         */

        names.forEach(System.out::println);
    }
}
