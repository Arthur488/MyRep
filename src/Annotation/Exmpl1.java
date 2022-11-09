package Annotation;

public class Exmpl1 {
    public static void main(String[] args) {
        Parent parent = new Parent("Parent");
        Child child = new Child("Child");
        parent.showInfo();
        child.showInfo();
    }
}

class Parent{
    String name;

    Parent(String name){
        this.name = name;
    }

    @Deprecated
    void showInfo(){
        System.out.println("It`s parent class. Name: " + name);
    }
}

class Child extends Parent{

    Child(String name){
        super(name);

    }

    @Override
    void showInfo(){
        System.out.println("It`s child class. Name: " + name);
    }
}





















