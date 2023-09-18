package exemplosSet;

import java.util.HashSet;
import java.util.Set;

public class ExemploTreeSet {
    public static void main(String[] args) {
        // TreeSet ordena os dados, mas é o mais lento dos 3
        Set<String> set = new HashSet<>();

        set.add("TV");
        set.add("Tablet");
        set.add("Notebook");

        System.out.println(set.contains("TV"));
        for (String p : set){
            System.out.println(p);
        }
    }
}
