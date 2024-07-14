package Observer;

import java.util.ArrayList;
import java.util.List;

public class PartiallyDown implements State{

    Subject subject;
    List<Observer> observers=new ArrayList<>();
    public PartiallyDown(Subject subject) {
        this.subject=subject;
        observers=subject.getObservers();
    }

    @Override
    public void fullyfunctional() {

        for (Observer o:observers){
            o.billing();
        }
        subject.setState(subject.getfunctional());
    }

    @Override
    public void partiallyfunctional() {
        System.out.println("System is already partially down");
    }

    @Override
    public void notfunctinal() {
//        System.out.println("System is fully down");
        for (Observer o:observers){
            o.prompt();
        }
        subject.setState(subject.getdown());
    }
}
