package org.example;

public class Pant implements Garment{

    private String type;

    public Pant(String type) {
        this.type = type;
    }

    @Override
    public void display() {
        System.out.println("Displaying " + type + " pant");
    }
}

