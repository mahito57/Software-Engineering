package offline4;

public class DragonKidney extends ItemDecorator{
    DragonKidney(Potion coffee) {
        super(coffee);
    }
    @Override
    public String getDescription() {
        return tempPotion.getDescription() + ", Dragon Kidney";
    }

    @Override
    public int getCost() {
        return tempPotion.getCost()+13;
    }

    @Override
    public int penalty() {
        return tempPotion.penalty()+2;
    }
}
