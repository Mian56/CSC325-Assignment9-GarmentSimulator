package org.example;



public class Top implements Garment {

    private String type;
    public Top(String type){
        this.type = type;
    }


    @Override
    public void display(){
        System.out.println("Displaying " + type + "top");
    }

}
