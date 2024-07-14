package Adapter;

public class TestPassenger {
    public static void main(String[] args) {
        CrewMate cr1 = new CrewMate();
        Imposter imp1 = new Imposter();
        ImposterAdapter imAd=new ImposterAdapter(imp1);

        cr1.task1();
        imAd.task1();
        cr1.task2();
        imAd.task2();
    }
}
