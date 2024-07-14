package offline4;

public class poisonIvy extends ItemDecorator{
    poisonIvy(Potion potion) {
        super(potion);
    }
    @Override
    public String getDescription() {
        return tempPotion.getDescription() + ", poison Ivy";
    }

    @Override
    public int getCost() {
        return tempPotion.getCost()+8;
    }

    @Override
    public int penalty() {
        return tempPotion.penalty()+2;
    }
}