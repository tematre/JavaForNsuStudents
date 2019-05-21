package me.tematre.example.nestedClasses;

public class OuterClass {

    private int counter = 0;

    public int getCounter() {
        return counter;
    }

    public class InnerClass {

        public void setCount(int value)
        {
            counter = value;
        }
    }
}