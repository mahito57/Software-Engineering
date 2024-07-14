package Decorator;

public class DairyCream extends ItemDecorator{
    DairyCream(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return tempCoffee.getDescription() + ", dairy cream";
    }

    @Override
    public int getCost() {
        return tempCoffee.getCost()+40;
    }
}