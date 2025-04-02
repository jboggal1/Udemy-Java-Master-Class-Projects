public class Dog extends Animal {
    private String earShape;
    private String tailShape;

    public Dog() {
        super("Mutt", "Big", 50);
    }

    public Dog(String type, double weight) {
        this(type, weight, "Perky", "Curled");
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog [earShape=" + earShape + ", tailShape=" + tailShape + ", toString()=" + super.toString() + "]";
    }

    @Override
    public void makeNoise(String noise) {
        // TODO Auto-generated method stub
        super.makeNoise(noise);
        if (type.equals("Wolf")) {
            System.out.println("Ow Wooooo!");
        }
        bark();
        System.out.println();
    }

    @Override
    public void move(String speed) {
        // TODO Auto-generated method stub
        super.move(speed);
        if (speed.equals("24 km/h")) {
            walk();
            wagTail();
        } else {
            run();
            bark();
        }
        System.out.println();
    }

    private void bark() {
        System.out.print("Woof!");
    }

    private void run() {
        System.out.print("Dog is running.");
    }

    private void walk() {
        System.out.print("Dog is walking.");
    }

    private void wagTail() {
        System.out.print("Tail Wagging.");
    }
}
