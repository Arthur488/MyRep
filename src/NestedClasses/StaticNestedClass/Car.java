package NestedClasses.StaticNestedClass;

public class Car {
    String color;
    int doorCount;
    Engine engine;

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    public Car() {
    }

    @Override
    public String toString() {
        return "My car{" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}' + "\n";
    }

    public static class Engine {
        int horsePower;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
        }

        @Override
        public String toString() {
            return "My engine{" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}


class Test {
    public static void main(String[] args) {

        Car.Engine engine = new Car.Engine(240);
        System.out.println(engine);
        Car car = new Car("Red", 2, engine);
        System.out.println(car);
    }
}




























