package Decorator;

public class CinnamonPowder extends ItemDecorator{
    CinnamonPowder(Coffee coffee) {
        super(coffee);
    }
    @Override
    public String getDescription() {
        return tempCoffee.getDescription() + ", cinnamon powder";
    }

    @Override
    public int getCost() {
        return tempCoffee.getCost()+50;
    }
}