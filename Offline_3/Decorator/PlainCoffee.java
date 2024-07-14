package Decorator;

public class PlainCoffee implements Coffee{
    @Override
    public String getDescription() {
            return "Fancy Mug";
    }

    @Override
    public int getCost() {
        return 100;
    }
}
