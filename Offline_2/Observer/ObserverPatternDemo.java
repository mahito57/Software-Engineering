package Observer;

import java.util.Scanner;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject=new Subject();
        PremiumSubscriber obs1=new PremiumSubscriber("Sami",subject);
        RegularSubscriber obs2=new RegularSubscriber("Tomal",subject);

        subject.addobserver(obs1);
        subject.addobserver(obs2);

        Scanner sc=new Scanner(System.in);

        while (true){
            System.out.println("Give state (1-3)");
            int x=sc.nextInt();
            if(x==1){
                subject.fullyfunctional();
            }
            else if(x==2){
                subject.partialdown();
            }
            else if(x==3){
                subject.fullydown();
            }
            else{
                break;
            }
        }
    }
}
