package Lambda_Expressions;

public class Test2 {
    static void def(I i) {
        System.out.println(i.abc("privet", 5));
    }

    public static void main(String[] args) {
        //def(String::length);

        def((p, a) -> {
            System.out.println(p);
            System.out.println(p.length());
            return a + p.length();
        });

    }

}

interface I {
    int abc(String s, int a);
}