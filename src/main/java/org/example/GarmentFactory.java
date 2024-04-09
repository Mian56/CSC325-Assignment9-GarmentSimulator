package org.example;


public class GarmentFactory {
   public Garment createGarment(String type, String variant){
      if (type.equalsIgnoreCase("Top")){
         return new Top(variant);
      }
      else if(type.equalsIgnoreCase("Pant")){
         return new Pant(variant);
      } else if (type.equalsIgnoreCase("shoe")) {
         return new Shoe(variant);
      }
      System.out.println("Nothing");
      return null;
   }


}

