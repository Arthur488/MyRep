package ReflectionExamples;

import java.lang.reflect.Field;
import java.util.Arrays;

public class Example3 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Employee employee = new Employee(10, "Ivan", "Building");
        Class employeeClass = employee.getClass();
        Field field = employeeClass.getDeclaredField("salary");

        field.setAccessible(true);
        double salaryValue = (Double)field.get(employee);
        System.out.println(salaryValue);

        field.set(employee, 21000);
        System.out.println(employee);
        System.out.println(Arrays.toString(employeeClass.getTypeParameters()));
    }
}
