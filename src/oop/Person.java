package oop;

public class Person {

    // attributes, fields
    String name;
    int age;

    // constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // behaviour, method
    public void greet() {
        System.out.println("Hello, my name is " + this.name + " and I'm " + this.age + " years old.");
    }

}
