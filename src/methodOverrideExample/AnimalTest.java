package methodOverrideExample;

public class AnimalTest {
    public static void main(String[] args) {
       Dog dog=new Dog("dog","bow");
       dog.makesound();
        System.out.println("dog making sound"+dog.makesound());

        Cat cat= new Cat("cat","meow");
        cat.makesound();
        System.out.println("cat making sound "+ cat.makesound());
    }
}
