package ReflectionExamples;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Example1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class employeeClass = Class.forName("ReflectionExamples.Employee");

//        Class employeeClass2 = Employee.class;
//
//        Employee emp = new Employee();
//        Class employeeClass3 = emp.getClass();

        Field someField = employeeClass.getField("id");
        System.out.println("Type of ID field = " + someField.getType());

        Field[] filds = employeeClass.getFields();
        for (Field fild: filds) {
            System.out.println("Type of: " + fild.getName() + " = " + fild.getType());
        }
        System.out.println("//////////////////////////////////////////");
        Field[] all_filds = employeeClass.getDeclaredFields();
        for (Field fild: all_filds) {
            System.out.println("Type of: " + fild.getName() + " = " + fild.getType());
        }

        System.out.println("//////////////////////////////////////////");
        Method someMethod = employeeClass.getMethod("IncreaseSalary");
        System.out.println("Return type of method IncreaseSalary = " + someMethod.getReturnType() + " Parameter types: " + Arrays.toString(someMethod.getParameterTypes()));


        System.out.println("//////////////////////////////////////////");
        Method someMethod2 = employeeClass.getMethod("setSalary", double.class);
        System.out.println("Return type of method setSalary = " + someMethod2.getReturnType() + " Parameter types: " + Arrays.toString(someMethod2.getParameterTypes()));


        System.out.println("//////////////////////////////////////////");
        Method[] arrayMethods = employeeClass.getMethods();
        for (Method method: arrayMethods) {
            System.out.println("name of method = " + method.getName() + " | Return type = " + method.getReturnType() + " | Parameter types: " + Arrays.toString(method.getParameterTypes()));

        }


        System.out.println("//////////////////////////////////////////");
        Method[] allArrayMethods = employeeClass.getDeclaredMethods();
        for (Method method: allArrayMethods) {
            System.out.println("name of method = " + method.getName() + " | Return type = " + method.getReturnType() + " | Parameter types: " + Arrays.toString(method.getParameterTypes()));

        }


        System.out.println("//////////////////////////////////////////");
        Method[] allArrayMethods2 = employeeClass.getDeclaredMethods();
        for (Method method: allArrayMethods) {
            if(Modifier.isPublic(method.getModifiers())){
                System.out.println("name of method = " + method.getName() + " | Return type = " + method.getReturnType() + " | Parameter types: " + Arrays.toString(method.getParameterTypes()));
            }
        }

        System.out.println("//////////////////////////////////////////");
        Constructor constructor1 = employeeClass.getConstructor();
        System.out.println("Parameters of this conctructor: " + constructor1.getParameterCount() + " | Types are: " + Arrays.toString(constructor1.getParameterTypes()));

        System.out.println("//////////////////////////////////////////");
        Constructor constructor2 = employeeClass.getConstructor(int.class, String.class, String.class);
        System.out.println("Parameters of this conctructor: " + constructor2.getParameterCount() + " | Types are: " + Arrays.toString(constructor2.getParameterTypes()));

        System.out.println("//////////////////////////////////////////");
        Constructor[] arrayOfConstructors =  employeeClass.getDeclaredConstructors();
        for (Constructor constructor: arrayOfConstructors) {
            System.out.println("name: " + constructor.getName() + " | Count of parameters: " + constructor.getParameterCount() + " | Types of params: " + Arrays.toString(constructor2.getParameterTypes()));
        }

    }
}
