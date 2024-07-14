package offline4;

public class ChompingCabbage extends ItemDecorator{
    ChompingCabbage(Potion coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return tempPotion.getDescription() + ", Chinese Chomping Cabbage";
    }

    @Override
    public int getCost() {
        return tempPotion.getCost()+10;
    }

    @Override
    public int penalty() {
        return tempPotion.penalty()+2;
    }
}