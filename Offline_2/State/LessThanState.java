package State;

public class LessThanState implements State{
    VendingMachine vendingMachine;
    public LessThanState(VendingMachine vendingMachine) {
        this.vendingMachine=vendingMachine;
    }

    @Override
    public void insertCash(int x) {
        System.out.println("Please insert again");
        if(vendingMachine.currentmoney>0){
            vendingMachine.setState(vendingMachine.getHasmoney());
        }else vendingMachine.setState(vendingMachine.getNomoney());

    }

    @Override
    public void order() {
        System.out.println("Press Deliver");
    }

    @Override
    public void deliver() {
        System.out.println("You don't have enough money. Insert again");
        if(vendingMachine.currentmoney>0){
            vendingMachine.setState(vendingMachine.getHasmoney());
        }else vendingMachine.setState(vendingMachine.getNomoney());
    }
}
