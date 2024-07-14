package Decorator;

public class ChocolateSauce extends ItemDecorator{
    ChocolateSauce(Coffee coffee) {
        super(coffee);
    }
    @Override
    public String getDescription() {
        return tempCoffee.getDescription() + ", chocolate sauce";
    }

    @Override
    public int getCost() {
        return tempCoffee.getCost()+60;
    }
}