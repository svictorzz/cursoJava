package testeMetodosSet;

import java.util.LinkedHashSet;
import java.util.Set;

public class Teste {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();

        set.add("TV");
        set.add("Tablet");
        set.add("Notebook");

        // remove todo mundo que tem mais de 3 caracteres
        set.removeIf(x -> x.length() >= 3);

        // remove todo mundo que começa com T
        set.removeIf(x -> x.charAt(0) == 'T');

        for (String p : set){
            System.out.println(p);
        }
    }
}
