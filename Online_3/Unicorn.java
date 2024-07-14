package offline4;

public class Unicorn extends ItemDecorator{
    Unicorn(Potion coffee) {
        super(coffee);
    }
    @Override
    public String getDescription() {
        return tempPotion.getDescription() + ", unicorn horn";
    }

    @Override
    public int getCost() {
        return tempPotion.getCost()+15;
    }

    @Override
    public int penalty() {
        return tempPotion.penalty()+2;
    }
}