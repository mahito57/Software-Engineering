package Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers= new ArrayList<>();
    private int state;

    State operational;
    State partial;
    State down;

    State substate;

    Subject(){
        operational=new Operational(this);
        partial=new PartiallyDown(this);
        down= new FullyDown(this);

        substate=operational;
    }

    public void addobserver(Observer observer){
        observers.add(observer);
    }

    public List<Observer> getObservers(){
        return observers;
    }

    public State getState() {
        return substate;
    }

    public void setState(State newstate) {
        substate = newstate;
        notifyObservers();
    }
    public void fullyfunctional(){
        substate.fullyfunctional();
    }
    public void partialdown(){
        substate.partiallyfunctional();
    }
    public void fullydown(){
        substate.notfunctinal();
    }

    public State getfunctional(){
        return operational;
    }
    public State getpatial(){
        return partial;
    }
    public State getdown(){
        return down;
    }

    public void notifyObservers() {
        for (Observer o:observers){
            o.update();
        }
    }
    @Override
    public String toString(){
        String str;
       if(substate==operational) str="State changed to Operational";
       else if(substate==partial) str="State changed to partially down";
       else str="State changed to fully down";
       return str;
    }


}
