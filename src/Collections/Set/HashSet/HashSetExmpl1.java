package Collections.Set.HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetExmpl1 {
    public static void main(String[] args) {
        Set <String> set = new HashSet <>();
        set.add("Arthur");
        set.add("Viktor");
        set.add("Tanya");
        //set.add(null);

        System.out.println(set);
        set.remove("Viktor");
        System.out.println(set);
        System.out.println(set.size());
    }
}
