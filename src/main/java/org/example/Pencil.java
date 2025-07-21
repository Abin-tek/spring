package org.example;

public class Pencil implements Writer {
    public Pencil() {
        System.out.println("Pencil is created");
    }

    @Override
    public void write() {
        System.out.println("Writing using pencil");
    }
}
