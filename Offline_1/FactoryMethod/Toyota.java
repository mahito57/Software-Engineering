package FactoryMethod;

public class Toyota extends Car {


    public Toyota() {
        model = "Toyota";
        color = "Red";
        manufacturer = "Japan";
        fuel = "Hydrogen";
        drive_train = "Rear wheel";
    }

    @Override
    void spec() {
        System.out.println("Car Model: " + model + "\n" +
                "Color: " + color + "\n" +
                "Manufacturer: " + manufacturer + "\n" +
                "Fuel: " + fuel + "\n" +
                "Drive Train: " + drive_train + "\n");

    }
}