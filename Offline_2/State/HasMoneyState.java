package State;

public class HasMoneyState implements State{
    VendingMachine vendingMachine;
    public HasMoneyState(VendingMachine vendingMachine) {
        this.vendingMachine=vendingMachine;
    }

    @Override
    public void insertCash(int x) {
        vendingMachine.currentmoney=vendingMachine.currentmoney+x;
        System.out.println("Your Balance: "+vendingMachine.currentmoney);
    }

    @Override
    public void order() {
        if(vendingMachine.currentmoney== vendingMachine.getPrice()) vendingMachine.setState(vendingMachine.getEqualmoney());
        else if(vendingMachine.currentmoney> vendingMachine.getPrice()) vendingMachine.setState(vendingMachine.getGreatermoney());
        else vendingMachine.setState(vendingMachine.getLessermoney());
        System.out.println("Press deliver to get item");
    }

    @Override
    public void deliver() {
        System.out.println("Please press order first");
    }
}
