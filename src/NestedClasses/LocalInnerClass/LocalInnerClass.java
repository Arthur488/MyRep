package NestedClasses.LocalInnerClass;

public class LocalInnerClass {
    public static void main(String[] args) {
        Math math = new Math();
        math.getResult();
    }
}


class Math {
    public void getResult() {

        class Delenie {
            private int delemoe;
            private int delitel;

            public int getChastnoe() {
                return delemoe / delitel;
            }

            public int getOstatok() {
                return delemoe % delitel;
            }

            public int getDelemoe() {
                return delemoe;
            }

            public int getDelitel() {
                return delitel;
            }

            public void setDelemoe(int delemoe) {
                this.delemoe = delemoe;
            }

            public void setDelitel(int delitel) {
                this.delitel = delitel;
            }
        }

        Delenie delenie = new Delenie();
        delenie.setDelemoe(21);
        delenie.setDelitel(4);
        System.out.println("Delimoe: " + delenie.getDelemoe());
        System.out.println("Delitel: " + delenie.getDelitel());
        System.out.println("Chastnoe: " + delenie.getChastnoe());
        System.out.println("Ostatok: " + delenie.getOstatok());

    }
}