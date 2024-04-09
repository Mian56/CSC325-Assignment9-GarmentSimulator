package org.example;


//// Factory class responsible for creating garments
public class GarmentFactory {

   // Method to create garment based on type and design
   public Garment createGarment(String type, String design){
      // Check the type of garment requested
      if (type.equalsIgnoreCase("Top")){
         return new Top(design);
      }
      else if(type.equalsIgnoreCase("Pant")){
         return new Pant(design);
      } else if (type.equalsIgnoreCase("shoe")) {
         return new Shoe(design);
      }

      System.out.println("Invalid garment type: " + type);
      return null; //if type is not found return null
   }


}

