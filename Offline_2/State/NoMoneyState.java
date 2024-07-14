package State;

public class NoMoneyState implements State{
    VendingMachine vendingMachine;
    public NoMoneyState(VendingMachine vendingMachine) {
        this.vendingMachine=vendingMachine;
    }

    @Override
    public void insertCash(int x) {
        if(vendingMachine.item<1) {
            System.out.println("No product. Returning "+x+" tk");

            vendingMachine.setState(vendingMachine.getOutofproduct());
        }else{
            if(x>0){
                vendingMachine.currentmoney=vendingMachine.currentmoney+x;
                System.out.println("Your Balance: "+vendingMachine.currentmoney);
                vendingMachine.setState(vendingMachine.getHasmoney());
            }
        }

    }

    @Override
    public void order() {
        System.out.println("Please Insert Money");
    }

    @Override
    public void deliver() {
        System.out.println("Please Insert Money");
    }
}
