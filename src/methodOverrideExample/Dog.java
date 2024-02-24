package methodOverrideExample;

public class Dog extends Animal{

    public String animalName;
    public String sound;

    public Dog(String animalName, String sound) {
        this.animalName = animalName;
        this.sound = sound;
    }


    @Override
    public String makesound() {
        System.out.println("bow");
        return super.makesound();
    }
}
