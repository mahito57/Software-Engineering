package offline4;

public class PlainPotion implements Potion {
    @Override
    public String getDescription() {
            return "white spirit, castor oil";
    }

    @Override
    public int getCost() {
        return 9;
    }

    @Override
    public int penalty() {
        return 2;
    }

}
