package Observer;

import java.util.Scanner;

public class PremiumSubscriber implements Observer{
    String name;
    Subject sub;
    PremiumSubscriber(String name,Subject sub){
        this.name=name;
        this.sub=sub;
    }

    Scanner sc=new Scanner(System.in);
    String ans;
    @Override
    public void update() {
        System.out.println(name+", "+sub);
    }

    @Override
    public void partialask(){
        System.out.println(name+ ", Do you want to use service from 2 servers? Y/N");
        ans=sc.next();
    }

    @Override
    public void fullask() {
        System.out.println(name+ ", The service is provided by the DEF company");
    }

    @Override
    public void billing() {

    }

    @Override
    public void prompt() {
        if(ans.equalsIgnoreCase("Y")){
            System.out.println(name+ ", your service is shifted to DEF company");
        }

    }

}
