package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Green");
        person1.senAge(75);
        System.out.println("You wait " + (100- person1.getAge()) + " years old");
        person1.sayHello();
        Person person2 = new Person();
        person2.setName("Orange");
        person2.senAge(85);
        System.out.println("You wait " + (100- person2.getAge()) + " years old");
        person2.sayHello();
    }
}
class Person {
    private String name;
    private int age;

    public void setName(String userName) {
        if (userName.isEmpty()) {
            System.out.println("Name is empty");
        }
        else {
            name = userName;
        }
    }
    public String getName() {
        return name;
    }
    public void senAge(int userAge) {
        if (userAge <= 0) {
            System.out.println("Age is not exist");
        }
        else {
            age = userAge;
        }
    }
    public int getAge() {
        return age;
    }
    void sayHello() {
        System.out.println("Hello " + name);
    }
}