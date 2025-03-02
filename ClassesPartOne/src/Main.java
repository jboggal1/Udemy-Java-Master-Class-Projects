public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        car.setColor("Gray");
        car.setConvertible(false);
        car.setDoors(4);
        car.setManufacturer("Porsche");
        car.setModel("Macan Turbo Electric");

        car.describeCar();

        Car targa = new Car();

        targa.setColor("Red");
        targa.setConvertible(false);
        targa.setDoors(4);
        targa.setManufacturer("Porsche");
        targa.setModel("Targa");

        targa.describeCar();
    }
}
