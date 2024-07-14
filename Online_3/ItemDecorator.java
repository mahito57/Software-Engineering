package offline4;

abstract class ItemDecorator implements Potion{
    protected Potion tempPotion;

    ItemDecorator(Potion potion){
        tempPotion=potion;
    }

    @Override
    public String getDescription() {
        return tempPotion.getDescription();
    }

    @Override
    public int getCost() {
        return tempPotion.getCost();
    }

    @Override
    public int penalty() {
        return tempPotion.penalty();
    }
}
