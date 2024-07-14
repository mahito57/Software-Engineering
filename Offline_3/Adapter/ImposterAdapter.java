package Adapter;

public class ImposterAdapter implements Passenger{

    Imposter imposter;

    ImposterAdapter(Imposter imposter){
        this.imposter=imposter;
    }

    @Override
    public void task1() {
        imposter.badtask1();
    }

    @Override
    public void task2() {
        imposter.badtask2();
    }
}
