package org.example;

public class GarmentSimulator {

    public static void main(String[] args) {
        GarmentFactory factory = new GarmentFactory();

        displayProfessionalOutfit(factory);
        displayCasualOutfit(factory);
        displayPartyOutfit(factory);
    }

    private static void displayProfessionalOutfit(GarmentFactory factory) {
        System.out.println("Professional outfit:");
        Garment professionalTop = factory.createGarment("Top", "Professional");
        Garment professionalPant = factory.createGarment("Pant", "Professional");
        Garment professionalShoe = factory.createGarment("Shoe", "Professional");

        professionalTop.display();
        professionalPant.display();
        professionalShoe.display();
        System.out.println();
    }

    private static void displayCasualOutfit(GarmentFactory factory) {
        System.out.println("Casual outfit:");
        Garment casualTop = factory.createGarment("Top", "Casual");
        Garment casualPant = factory.createGarment("Pant", "Casual");
        Garment casualShoe = factory.createGarment("Shoe", "Casual");

        casualTop.display();
        casualPant.display();
        casualShoe.display();
        System.out.println();
    }

    private static void displayPartyOutfit(GarmentFactory factory) {
        System.out.println("Party outfit:");
        Garment partyTop = factory.createGarment("Top", "Party");
        Garment partyPant = factory.createGarment("Pant", "Party");
        Garment partyShoe = factory.createGarment("Shoe", "Party");

        partyTop.display();
        partyPant.display();
        partyShoe.display();
        System.out.println();
    }
}
