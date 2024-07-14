package State;

import javax.lang.model.type.MirroredTypeException;

public class GreaterThanState implements State{
   VendingMachine vendingMachine;

    public GreaterThanState(VendingMachine vendingMachine) {
        this.vendingMachine=vendingMachine;
    }

    @Override
    public void insertCash(int x) {
        System.out.println("No need to insert. Returning: "+x+" tk");
    }

    @Override
    public void order() {
        System.out.println("Press Deliver");
    }

    @Override
    public void deliver() {
        if(vendingMachine.item<1){
            vendingMachine.setState(vendingMachine.getOutofproduct());
            System.out.println("No product");
        }else {
            int x=vendingMachine.currentmoney- vendingMachine.getPrice();
            System.out.println("Take your change: "+x+" tk");
            vendingMachine.currentmoney=0;
            System.out.println("Here's your drink");
            vendingMachine.item--;
            vendingMachine.setState(vendingMachine.getNomoney());
        }

    }
}
