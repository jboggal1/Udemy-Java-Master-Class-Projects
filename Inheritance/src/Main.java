public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", "Huge", 400);
        doAnimalStuff(animal, "makes noise.", "15 km/h");

        Dog dog = new Dog();
        doAnimalStuff((dog), "barks.", "30 km/h");

        Dog yorkie = new Dog("Yorkie", 4.3);
        doAnimalStuff(yorkie, "Grunts.", "24 km/h");

        Dog labrador = new Dog("Labrador", 32, "Floppy", "Swimmer");
        doAnimalStuff(labrador, "Grumbles", "48 km/h");

        Dog wolf = new Dog("Wolf", 80);
        doAnimalStuff(wolf, "howl", "60 km/h");

        Fish goldie = new Fish("GoldFish", 0.25, 2, 3);
        doAnimalStuff(goldie, "bububuub", "fast");

    }

    public static void doAnimalStuff(Animal animal, String noise, String speed) {
        animal.makeNoise(noise);
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _ _");
    }
}
