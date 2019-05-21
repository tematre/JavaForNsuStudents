package me.tematre.example.nestedClasses;


public class Main {

    public static void main(String[] args) {

        OuterClass outer = new OuterClass();

        System.out.println("Before setting value");
        System.out.println(outer.getCounter());

        OuterClass.InnerClass innerClass = outer.new InnerClass();

        innerClass.setCount(5);

        System.out.println("After setting value");
        System.out.println(outer.getCounter());

        int a = 5;
        Integer b = a;

    }
}
