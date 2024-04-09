package org.example;


//// Class showcasing a top garment
public class Top implements Garment {

    private String type;
    // Constructor for creating a top garment with a certain type
    public Top(String type){
        this.type = type;
    }

    // Method to showing the top garment
    @Override
    public void display(){
        System.out.println("Displaying " + type + "top");
    }

}
