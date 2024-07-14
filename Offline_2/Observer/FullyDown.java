package Observer;

import java.util.ArrayList;
import java.util.List;

public class FullyDown implements State
{

    Subject subject;
    List<Observer> observers=new ArrayList<>();
    public FullyDown(Subject subject) {
        this.subject=subject;
        observers=subject.getObservers();
    }

    @Override
    public void fullyfunctional() {
//        System.out.println("System is operational");
        for (Observer o:observers){
            o.billing();
        }
        subject.setState(subject.getfunctional());
    }

    @Override
    public void partiallyfunctional() {
//        System.out.println("System is partially down");
        subject.setState(subject.getpatial());
    }

    @Override
    public void notfunctinal() {
        System.out.println("System is already not functional");
    }
}
