package org.example;

//driver class to simulate different outfits
public class GarmentSimulator {

    public static void main(String[] args) {
        //garment factory object
        GarmentFactory factory = new GarmentFactory();

        // Display professional outfit
        displayProfessionalOutfit(factory);

        // Display casual outfit
        displayCasualOutfit(factory);

        // Display party outfit
        displayPartyOutfit(factory);
    }

    // Method to display a professional outfit
    private static void displayProfessionalOutfit(GarmentFactory factory) {
        //creates professional outfits
        System.out.println("Professional outfit:");
        Garment professionalTop = factory.createGarment("Top", "Professional");
        Garment professionalPant = factory.createGarment("Pant", "Professional");
        Garment professionalShoe = factory.createGarment("Shoe", "Professional");

        //shows professional garments
        professionalTop.display();
        professionalPant.display();
        professionalShoe.display();
        System.out.println();
    }

    // Method to display a casual outfit
    private static void displayCasualOutfit(GarmentFactory factory) {
        //creates casual outfit
        System.out.println("Casual outfit:");
        Garment casualTop = factory.createGarment("Top", "Casual");
        Garment casualPant = factory.createGarment("Pant", "Casual");
        Garment casualShoe = factory.createGarment("Shoe", "Casual");

        //shows casual garments
        casualTop.display();
        casualPant.display();
        casualShoe.display();
        System.out.println();
    }

    // Method to display a party outfit
    private static void displayPartyOutfit(GarmentFactory factory) {
        //creates party outfit
        System.out.println("Party outfit:");
        Garment partyTop = factory.createGarment("Top", "Party");
        Garment partyPant = factory.createGarment("Pant", "Party");
        Garment partyShoe = factory.createGarment("Shoe", "Party");

        // show party garments
        partyTop.display();
        partyPant.display();
        partyShoe.display();
        System.out.println();
    }
}
/*
The code should help display different types of clothing like tops, pants, and shoes. There is a class called
GarmentFactory that checks whether the cloth is a top, pant, or shoe. The code is simple and keeps parts organized. It
has different methods for casual, professional, and party clothing. It is not case-sensitive when called,so it shouldn't
be too much of a problem when calling the top, pant, or shoe. Overall, this should, in theory, help manage clothing
inventory.
 */
