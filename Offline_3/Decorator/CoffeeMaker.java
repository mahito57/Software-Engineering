package Decorator;

import java.util.Scanner;

public class CoffeeMaker {
    public static void main(String[] args) {
        Coffee coffee;
        int x;
        int cost=0;

        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("Choose your Coffee");
            System.out.println("1. Americano");
            System.out.println("2. Espresso");
            System.out.println("3. Cappuccino");
            System.out.println("4. Mocha");
            x=sc.nextInt();
            if(x==1){
                coffee = new GrindedCoffeeBeans(new GrindedCoffeeBeans(new PlainCoffee()));
            }else if(x==2){
                coffee = new DairyCream(new GrindedCoffeeBeans(new PlainCoffee()));
            }else if(x==3){
                coffee = new CinnamonPowder(new Milk(new PlainCoffee()));
            }else if(x==4){
                coffee = new ChocolateSauce(new Milk(new PlainCoffee()));
            }else {
                System.out.println("Wrong Input");
                continue;
            }

            cost += coffee.getCost();

            System.out.println("Ingredients: "+coffee.getDescription());
            System.out.println("This coffee costs "+coffee.getCost());

            System.out.println("Do you want another coffee? Y/N");
            if(sc.next().equalsIgnoreCase("Y")){
                System.out.println("Current total cost: "+cost);
            }
            else {
                System.out.println("Total cost: "+cost);
                break;
            }
        }
    }
}
