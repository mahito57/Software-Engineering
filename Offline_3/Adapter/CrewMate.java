package Adapter;

public class CrewMate implements Passenger{
    @Override
    public void task1() {
        System.out.println("Studying Intersteller Object");
    }

    @Override
    public void task2() {
        System.out.println("Doing Maintenance");
    }
}
