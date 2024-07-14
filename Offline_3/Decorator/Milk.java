package Decorator;

public class Milk extends ItemDecorator{
    Milk(Coffee coffee) {
        super(coffee);
    }
    @Override
    public String getDescription() {
        return tempCoffee.getDescription() + ", milk";
    }

    @Override
    public int getCost() {
        return tempCoffee.getCost()+50;
    }
}
