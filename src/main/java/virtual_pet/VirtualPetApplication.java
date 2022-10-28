package virtual_pet;

import java.util.Scanner;

import static virtual_pet.VirtualPet.tick;

public class VirtualPetApplication {

    public static void main(String[] args) {
        int select;

        Scanner input = new Scanner(System.in);
        System.out.println("This pet has stumbled upon your door! What will you name them?");
        String petName = input.nextLine();

        //creating pet with virtual pet object from the other tab? more explanation on how this works and why its written this way
        VirtualPet pet = new VirtualPet(petName, 7, 7, 7);

        do {
            System.out.println("How would you like to care for your pet?");
            System.out.println(" [1] Feed " + petName + ".");
            System.out.println(" [2] Make sure " + petName + "'s water bowl is filled.");
            System.out.println(" [3] Take " + petName + " for a walk.");
            System.out.println(" [4] Rest for the day and see your pet tomorrow.");

            select = input.nextInt();

            if (select == 4) {

            } else if (select == 1) {
                if (pet.getHunger() >= 10) {
                    System.out.println(petName + " isn't hungry right now");
                    continue;
                }
                System.out.println("You fill " + petName + "'s food bowl.");
                pet.changeHunger(+2);
                showPetCurrentNeeds(pet);
            } else if (select == 2) {
                if (pet.getThirst() >= 10) {
                    System.out.println(petName + " doesn't seem to be thirsty right now.");
                    continue;
                }
                System.out.println("You fill " + petName + "'s water bowl.");
                pet.changeThirst(+2);
                showPetCurrentNeeds(pet);
            } else if (select == 3) {
                if (pet.getEnergy() >= 10) {
                    System.out.println(petName + " is pretty tired right now. You should let them rest and check their other needs.");
                    continue;
                }
                System.out.println("You take " + petName + " out for a walk.");
                pet.changeEnergy(+1);
                showPetCurrentNeeds(pet);
            } else {
                System.out.println("You need to take care of " + petName + " please make a selection.");
            }
            tick(pet);
        } while (select != 4);

    }
    private static void showPetCurrentNeeds(VirtualPet pet) {
        System.out.println("Hunger: " + pet.getHunger());
        System.out.println("Thirst: " + pet.getThirst());
        System.out.println("Energy: " + pet.getEnergy());
    }
}
