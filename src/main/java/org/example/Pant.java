package org.example;

//pants class
public class Pant implements Garment{

    private String type;
//constructor
    public Pant(String type) {
        this.type = type;
    }

    //showing pants
    @Override
    public void display() {
        System.out.println("Displaying " + type + " pant");
    }
}

