package Observer;

import java.util.Scanner;

public class RegularSubscriber implements Observer{
    String name;
    Subject sub;
    RegularSubscriber(String name,Subject sub){
        this.name=name;
        this.sub=sub;
    }

    Scanner sc=new Scanner(System.in);
    String ans="N";
    @Override
    public void update() {
        System.out.println(name+", "+sub);
    }

    @Override
    public void partialask() {
        System.out.println(name+ ", Do you want limited service or want to pay 20 dollars to get full service?Y/N");
        ans=sc.next();
    }

    @Override
    public void fullask() {
        System.out.println(name+ ", Do you want to pay 20 bucks to get full functionality?Y/N");
        ans= sc.next();
    }

    @Override
    public void billing() {
        if(ans.equalsIgnoreCase("y")){
            System.out.println(name+ ", Your total bill is 20 dollars");
        }
    }

    @Override
    public void prompt() {

    }
}
