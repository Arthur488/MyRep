package Tests.src;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        HashMap<Integer, List<String>> hashMap = new HashMap <>();
        hashMap.put(1, Collections.singletonList("hello"));
        hashMap.put(2,  Collections.singletonList("Poka"));
        hashMap.put(2,  Collections.singletonList("Poka2"));
        if(hashMap.containsKey(2)){
            hashMap.get(2).add("dvsvfv");
        }

        System.out.println(hashMap.entrySet());
    }

}
