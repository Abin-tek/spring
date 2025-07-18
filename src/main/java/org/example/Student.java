package org.example;

public class Student {
    private static int count = 0;
    private final int id;
    private int age;
    private int rno;
    private Pen pen ;

    public Student(){
        id = ++count;
        System.out.println("Student " + id + " created");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("setter called");
        this.age = age;
    }

    public int getRno() {
        return rno;
    }

    public void setRno(int rno) {
        this.rno = rno;
    }

    public Pen getPen() {
        return pen;
    }

    public void setPen(Pen pen) {
        this.pen = pen;
    }

    public void writeExam(){
        pen.write();
    }

    public void show(){
        System.out.println("In show method " + id);
    }
}
