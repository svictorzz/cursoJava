package exemplosSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class ExemploLinkedHashSet {
    public static void main(String[] args) {
        // LinkedHashSet ordena os dados, velocidade intermediária
        Set<String> set = new LinkedHashSet<>();

        set.add("TV");
        set.add("Tablet");
        set.add("Notebook");

        System.out.println(set.contains("TV"));
        for (String p : set){
            System.out.println(p);
        }
    }
}
