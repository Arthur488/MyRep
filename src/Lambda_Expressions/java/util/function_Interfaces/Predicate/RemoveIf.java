package Lambda_Expressions.java.util.function_Interfaces.Predicate;

import java.util.ArrayList;

public class RemoveIf {
    public static void main(String[] args) {
        ArrayList <String> arrayList = new ArrayList <>();
        arrayList.add("Privet");
        arrayList.add("Poka");
        arrayList.add("Ok");
        arrayList.add("Uchim Java");
        arrayList.add("A imenno lambdas");
        System.out.println(arrayList);
        arrayList.removeIf(str -> str.length() < 5);
        System.out.println(arrayList);
        
    }
}
