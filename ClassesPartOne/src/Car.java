public class Car {
    private String manufacturer;
    private String model;
    private String color;
    private int doors;
    private boolean convertible;

    public void describeCar() {
        System.out.println(
                "Number of doors: " + doors + "\nColor: " + color + "\nManufacturer: " + manufacturer + "\nModel: "
                        + model
                        + "\nIs it Convertible:" +
                        (convertible ? " Yes" : " No"));
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        if (manufacturer == null)
            manufacturer = "unknown";
        String lowercase = manufacturer.toLowerCase();
        switch (lowercase) {
            case "porsche", "tesla", "lincoln" -> this.manufacturer = manufacturer;
            default -> this.manufacturer = "unsupported";
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

}
