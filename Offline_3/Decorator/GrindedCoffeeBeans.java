package Decorator;

public class GrindedCoffeeBeans extends ItemDecorator{
    GrindedCoffeeBeans(Coffee coffee) {
        super(coffee);
    }
    @Override
    public String getDescription() {
        return tempCoffee.getDescription() + ", grinded Coffee Beans";
    }

    @Override
    public int getCost() {
        return tempCoffee.getCost()+30;
    }
}
