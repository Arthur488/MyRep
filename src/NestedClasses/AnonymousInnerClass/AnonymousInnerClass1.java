package NestedClasses.AnonymousInnerClass;

public class AnonymousInnerClass1 {

    private int x = 5;

    public static void main(String[] args) {
        Math math = new Math() {
            @Override
            public int doOperation(int a, int b) {
                return a + b;
            }
        };
        System.out.println(math.doOperation(3, 10));

        Math math2 = new Math() {
            @Override
            public int doOperation(int a, int b) {
                AnonymousInnerClass1 anonymousInnerClass1 = new AnonymousInnerClass1();
                return a * b + anonymousInnerClass1.x;
            }
        };
        System.out.println(math2.doOperation(3, 10));

    }
}

//interface Math {
//    int doOperation(int a, int b);
//}
class Math {
    int doOperation(int a, int b) {
        return a / b;
    }
}


