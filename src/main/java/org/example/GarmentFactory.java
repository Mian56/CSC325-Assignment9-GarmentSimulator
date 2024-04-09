package org.example;


//// Factory class responsible for creating garments
public class GarmentFactory {

   // Method to create garment based on type and variant
   public Garment createGarment(String type, String variant){
      // Check the type of garment requested
      if (type.equalsIgnoreCase("Top")){
         return new Top(variant);
      }
      else if(type.equalsIgnoreCase("Pant")){
         return new Pant(variant);
      } else if (type.equalsIgnoreCase("shoe")) {
         return new Shoe(variant);
      }

      System.out.println("Invalid garment type: " + type);
      return null; //if type is not found return null
   }


}

