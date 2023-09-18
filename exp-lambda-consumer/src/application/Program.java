package application;

import entities.Product;
import util.PriceUpdate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.0));
        list.add(new Product("Mouse", 30.0));
        list.add(new Product("Tablet", 350.0));
        list.add(new Product("HD Case", 80.9));

        // implementação com interface
        list.forEach(new PriceUpdate());

        /*
        Outras formas:
        1. criar um metodo static na classe Product:

        public static void staticPriceUpdate(Product p){
            p.setPrice(p.getPrice() * 1.1);
        }

        list.forEach(Product::staticPriceUpdate);

        ---------------------------------------------------
        2. criar um metodo nao static na classe Product:

        public static void nonStaticPriceUpdate(){
            p.setPrice(p.getPrice() * 1.1);
        }

        list.forEach(Product::nonStaticPriceUpdate);
        -------------------------------------------------
        3. Expressão lambda declarada:

        Consumer<Product> cons = p -> {
            p.setPrice(p.getPrice() * 1.1);
        }

        list.forEach(cons);
        --------------------------------------------------
        4. Expressão lambda inline:

        list.forEach(p.setPrice(p.getPrice() * 1.1));
         */

        list.forEach(System.out::println);
    }
}
