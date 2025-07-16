package org.example;

public class Student {
    private static int count = 0;
    private final int id;

    public Student(){
        id = ++count;
        System.out.println("Student " + id + " created");
    }
    public void show(){
        System.out.println("In show method " + id);
    }
}
