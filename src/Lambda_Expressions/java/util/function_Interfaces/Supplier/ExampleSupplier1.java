package Lambda_Expressions.java.util.function_Interfaces.Supplier;

import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.function.Consumer;

public class ExampleSupplier1 {
    public static void main(String[] args) {

        ArrayList <Car> ourCars = create3Cars(() -> new Car("Nissan Tiida", "Silver Metalic", 1.6));
        System.out.println(ourCars);
        changeCar(ourCars.get(0), car -> {
            car.color = "red";
            car.engine = 2.4;
            System.out.println("Upgraded car: " + car);
        });
        System.out.println(ourCars);

    }

    public static ArrayList <Car> create3Cars(Supplier <Car> carSupplier) {
        ArrayList <Car> carArrayList = new ArrayList <>();
        for (int i = 0; i < 3; i++) {
            carArrayList.add(carSupplier.get());
        }
        return carArrayList;
    }

    public static void changeCar(Car car, Consumer <Car> carConsumer) {
        carConsumer.accept(car);
    }

}


class Car {
    String model;
    String color;
    double engine;

    public Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}' + "\n";
    }
}
