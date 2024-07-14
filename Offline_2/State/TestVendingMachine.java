package State;

import java.util.Scanner;

public class TestVendingMachine {
    public static void main(String[] args) {
        VendingMachine vendingMachine=new VendingMachine();
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("1. insert_cash");
            System.out.println("2. order");
            System.out.println("3. deliver");
            int x=sc.nextInt();
            if(x==1) {
                System.out.println("how much?");
                vendingMachine.insertCash(sc.nextInt());
            }
            else if(x==2){
                vendingMachine.order();
            }
            else if(x==3){
                vendingMachine.deliver();
            }
            else break;
        }
    }
}
