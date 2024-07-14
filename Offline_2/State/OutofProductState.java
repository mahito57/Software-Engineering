package State;

public class OutofProductState implements State{
    VendingMachine vendingMachine;
    public OutofProductState(VendingMachine vendingMachine) {
        this.vendingMachine=vendingMachine;
    }

    @Override
    public void insertCash(int x) {
        System.out.println("No product. Returning"+x+ " tk");
    }

    @Override
    public void order() {
        System.out.println("No product");
    }

    @Override
    public void deliver() {
        System.out.println("No product");
    }
}
