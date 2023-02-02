import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test5 {
    public static void main(String[] args) {
        List <Car> carList = Car.carList();
        System.out.println(carList);
        System.out.println("\n//************************ Задание 6 ************************//");
        System.out.println("\n//************************ Сортировка по цене, по возрастанию ************************//");
        carList.sort(Comparator.comparingInt(o -> o.price));
        System.out.println(carList);
        carList.sort((o1, o2) -> o2.price - o1.price);
        System.out.println("\n//************************ Сортировка по цене, по убыванию ************************//");
        System.out.println(carList);
        System.out.println("\n//************************ Сортировка по параметру-название ************************//");
        carList.sort(Comparator.comparing(o -> o.name));
        System.out.println(carList);

    }
}

class Car {
    String name;
    int price;
    String color;

    public Car(String name, int price, String color) {
        this.name = name;
        this.price = price;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}' + '\n';
    }

    public static List <Car> carList() {
        Car car1 = new Car("BMW", 25000, "White");
        Car car2 = new Car("Audi", 23000, "Black");
        Car car3 = new Car("Toyota", 15000, "Blue");
        Car car4 = new Car("Alfa-Romeo", 21000, "Green");
        Car car5 = new Car("Mercedes-Benz", 32000, "Black");
        List <Car> carList = new ArrayList <>();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        return carList;
    }
}