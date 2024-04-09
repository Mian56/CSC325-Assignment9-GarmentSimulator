package org.example;

//shoe class.. enjoy your shoes
public class Shoe implements Garment{

    private String type;

    //constructor
    public Shoe(String type) {
        this.type = type;
    }

    //showing the nice shoes you have
    @Override
    public void display() {
        System.out.println("Displaying " + type + " shoe");
    }

}
