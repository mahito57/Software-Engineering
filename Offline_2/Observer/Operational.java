package Observer;

import java.util.ArrayList;
import java.util.List;

public class Operational implements State{

    Subject subject;
    List<Observer> observers;
    public Operational(Subject subject) {
        this.subject=subject;
        observers=subject.getObservers();
    }

    @Override
    public void fullyfunctional() {
        System.out.println("System is already functional");
    }

    @Override
    public void partiallyfunctional() {
//        System.out.println("System is partially down");
        for (Observer o:observers){
            o.partialask();
        }
        subject.setState(subject.getpatial());
    }

    @Override
    public void notfunctinal() {
//        System.out.println("System is fully down");
        for (Observer o:observers){
            o.fullask();
        }
        subject.setState(subject.getdown());
    }
}
