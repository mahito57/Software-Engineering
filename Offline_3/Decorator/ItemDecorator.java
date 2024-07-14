package Decorator;

abstract class ItemDecorator implements Coffee{
    protected Coffee tempCoffee;

    ItemDecorator(Coffee coffee){
        tempCoffee=coffee;
    }

    @Override
    public String getDescription() {
        return tempCoffee.getDescription();
    }

    @Override
    public int getCost() {
        return tempCoffee.getCost();
    }
}
