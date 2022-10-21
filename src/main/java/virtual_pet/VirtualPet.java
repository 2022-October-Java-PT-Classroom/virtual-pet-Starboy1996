package virtual_pet;
public class VirtualPet {

    public String petName;
    public int hunger;
    public int thirst;
    public int energy;

    public VirtualPet(String petName, int hunger, int thirst, int energy) {

        this.petName = petName;
        this.hunger = hunger;
        this.thirst = thirst;
        this.energy = energy;
    }
    public void changeHunger(int h){
        hunger += h;}
    public void changeThirst(int t){
        thirst += t;
    }
    public void changeEnergy(int e){
        energy += e;
    }
    public String getPetName(){
        return petName;
    }
    public int getHunger(){
        return hunger;}
    public int getThirst(){
        return thirst;}
    public int getEnergy(){
        return energy;
    }
    public void setHunger(int hunger){
        this.hunger = hunger;
    }
    public void setThirst(int thirst){
        this.thirst = thirst;
    }

    public static void tick(VirtualPet pet) {
        pet.setHunger(pet.hunger - 1);
        pet.setThirst(pet.thirst - 1);
    }

}