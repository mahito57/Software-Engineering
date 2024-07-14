package State;

public class VendingMachine {
    private State nomoney;
    private State hasmoney;
    private State equalmoney;
    private State greatermoney;
    private State lessermoney;
    private State outofproduct;

    private State currstate;

    private int price=100;
    public int getPrice() {
        return price;
    }
    int item=1;
    int currentmoney=0;

    VendingMachine(){
        nomoney= new NoMoneyState(this);
        hasmoney= new HasMoneyState(this);
        equalmoney=new EqualState(this);
        greatermoney=new GreaterThanState(this);
        lessermoney=new LessThanState(this);
        outofproduct=new OutofProductState(this);

        currstate=nomoney;
    }

    void setState(State newState){
        currstate=newState;
    }
    State getState(){
        return currstate;
    }

    void insertCash(int x){
        currstate.insertCash(x);
    }
    void order(){
        currstate.order();
    }
    void deliver(){
        currstate.deliver();
    }

    State getNomoney(){
        return nomoney;
    }
    State getHasmoney(){
        return hasmoney;
    }
    State getEqualmoney(){
        return equalmoney;
    }
    State getGreatermoney(){
        return greatermoney;
    }
    State getLessermoney(){
        return lessermoney;
    }
    State getOutofproduct(){
        return outofproduct;
    }

}
