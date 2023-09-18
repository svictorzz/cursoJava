package application;

import entities.Product;
import util.ProductPredicate;

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

        /*
        Outras formas:
        (expressão lambda declarada):
        Predicate<Product> pred = p -> p.getPrice() >= 100.0;
        list.removeIf(pred);

        (expressão lambda inline):
        list.removeIf(p -> p.getPrice() >= 100.0);

         */

        list.removeIf(new ProductPredicate());

        for (Product p : list){
            System.out.println(p);
        }
    }
}
