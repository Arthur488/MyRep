package ReflectionExamples;

import java.lang.reflect.Field;
import java.util.Arrays;

public class PracticsReflection {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
//        Car car = new Car("Audi", 50000);
//
//        Class classCar = car.getClass();
//        Field field = classCar.getDeclaredField("price");
//        field.setAccessible(true);
//        Integer val = (Integer) field.get(car);
//        System.out.println(val);
//
//        field.set(car, 123);
//        System.out.println(car);
        Car car = new Car("Audi", 200);
        System.out.println(car);
        Class classCar = car.getClass();
        System.out.println(classCar);

    }
}

class Car{
    String name;
    private int price;

    public Car(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
