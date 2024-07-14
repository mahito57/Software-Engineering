package State;

public class EqualState implements State{
    VendingMachine vendingMachine;
    public EqualState(VendingMachine vendingMachine) {
        this.vendingMachine=vendingMachine;
    }

    @Override
    public void insertCash(int x) {
        System.out.println("No need to insert"+x+" tk");
    }

    @Override
    public void order() {
        System.out.println("Press Deliver");
    }

    @Override
    public void deliver() {
        if(vendingMachine.item==0){
            vendingMachine.setState(vendingMachine.getOutofproduct());
            System.out.println("No product");
        }else {
            System.out.println("Here's your drink");
            vendingMachine.currentmoney=0;
            vendingMachine.item--;
            vendingMachine.setState(vendingMachine.getNomoney());
        }

    }
}
