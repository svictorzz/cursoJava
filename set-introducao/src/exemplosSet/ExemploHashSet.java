package exemplosSet;

import java.util.HashSet;
import java.util.Set;

public class ExemploHashSet {
    public static void main(String[] args) {

        // HashSet é o mais rapido, mas não ordena
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
