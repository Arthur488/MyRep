package ReflectionExamples;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Calculator {
    void sum(int a, int b){
        int result = a + b;
        System.out.println("Summa: " + a + " + " + b + " = " + result);
    }
    void subtraction(int a, int b){
        int result = a - b;
        System.out.println("Subtraction: " + a + " - " + b + " = " + result);
    }
    void Multiply(int a, int b){
        int result = a * b;
        System.out.println("Multiply: " + a + " * " + b + " = " + result);
    }
    void Div(int a, int b){
        int result = a / b;
        System.out.println("Div: " + a + " / " + b + " = " + result);
    }
}

class TestCalculator{
    public static void main(String[] args) {
        try{
            //Читаем наш файл test100.txt
            BufferedReader bufferedReader = new BufferedReader(new FileReader("test100.txt"));

            //Считываем значения строк в файле в наши переменные
            String methodName = bufferedReader.readLine();
            String firstArgument = bufferedReader.readLine();
            String secondArgument = bufferedReader.readLine();

            //Создаем обьект нашего класса Calculator
            Calculator calculator = new Calculator();
            //Получаем класс нашего класса Calculator
            Class cl = calculator.getClass();

            Method method = null;
            //Зачисляем в массив methods методы нашего калькулятора
            Method[] methods = cl.getDeclaredMethods();

            //Проверяем соответствия названия метода в файле и в калькуляторе
            for(Method myMethod: methods){
                if(myMethod.getName().equals(methodName)){
                    method = myMethod;
                }
            }

            method.invoke(calculator, Integer.parseInt(firstArgument), Integer.parseInt(secondArgument));


        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
