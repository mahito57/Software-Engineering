package FactoryMethod;

import java.util.Scanner;

public class factorymain {

    public static void main(String[] args) {
        String Continent="";
        CarCreator cr=new CarCreator();
        while (!Continent.equalsIgnoreCase("stop")){
            Scanner sc=new Scanner(System.in);
            System.out.println("Give continent");
            Continent=sc.nextLine();

            Car obj=cr.getInstance(Continent);
            obj.spec();
        }
    }
}
