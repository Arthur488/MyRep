package NestedClasses.InnerClass;

public class Car {
    String color;
    int doorCount;
    Engine engine;

    public Car(String color, int doorCount) {
        this.color = color;
        this.doorCount = doorCount;
//        this.engine = this.new Engine(horsePower);

    }

    public Car() {
    }

    public void SetEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "My car{" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}' + "\n";
    }

    public class Engine {
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

//        Car.Engine engine = new Car.Engine(240);
//        System.out.println(engine);
//        Car car = new Car("Red", 2, engine);
//        System.out.println(car);

//        Car car = new Car("Black", 4, 340);
//        System.out.println(car);

        Car car = new Car("Red", 4);
        Car.Engine engine = car.new Engine(150);
        car.SetEngine(engine);
        System.out.println(engine);
        System.out.println(car);

    }
}




























