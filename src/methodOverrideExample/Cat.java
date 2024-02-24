package methodOverrideExample;

public class Cat extends Animal{
    public String animalName;
    public String sound;

    public Cat(String animalName, String sound) {
        this.animalName = animalName;
        this.sound = sound;
    }

    @Override
    public String makesound() {
        System.out.println("meow");
        return super.makesound();
    }
}
