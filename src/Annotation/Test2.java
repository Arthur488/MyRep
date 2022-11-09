package Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.text.Annotation;
import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) throws ClassNotFoundException{

            Class <?> xiaomiClass = Class.forName("Annotation.Xiaomi");
            System.out.println(Arrays.toString(xiaomiClass.getAnnotations()));

            Class <?> iphoneClass = Class.forName("Annotation.Iphone");

            SmartPhone smartPhone = (SmartPhone) iphoneClass.getAnnotation(SmartPhone.class);
            System.out.println("Phone: " + iphoneClass.getName() + " OS: " + smartPhone.OS() + "CompanyYear: " + smartPhone.yearOfCompanyCreation());


    }
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone{
    String OS() default "Android";
    int yearOfCompanyCreation() default 2010;
}

@SmartPhone()
class Xiaomi{
    String model;
    double price;
}

@SmartPhone(OS = "IOS", yearOfCompanyCreation = 1976)
class Iphone{
    String model;
    double price;
}

