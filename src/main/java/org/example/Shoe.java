package org.example;

public class Shoe implements Garment{

    private String type;

    public Shoe(String type) {
        this.type = type;
    }

    @Override
    public void display() {
        System.out.println("Displaying " + type + " shoe");
    }

}
