package offline4;

import java.util.Scanner;

public class PotionMaker {
    public static void main(String[] args) {
        Potion coffee;
        int x;
        int cost=0;
        int penalty = 0;
        int totalPenalty = 0;

        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("Choose your Potion");
            System.out.println("1. Polyjuice");
            System.out.println("2. Felix Felicis");
            System.out.println("3. Veritaserum");
            System.out.println("4. SKele-Gro");
            x=sc.nextInt();
            if(x==1){
                coffee = (new poisonIvy(new PlainPotion()));
            }else if(x==2){
                coffee = (new Unicorn(new PlainPotion()));
            }else if(x==3){
                coffee = (new DragonKidney(new PlainPotion()));
            }else if(x==4){
                coffee = (new ChompingCabbage(new PlainPotion()));
            }else {
                System.out.println("Wrong Input");
                continue;
            }

            cost += coffee.getCost();
            penalty += coffee.penalty();

            System.out.println("Ingredients: "+coffee.getDescription());
            System.out.println("This coffee costs "+coffee.getCost());

            System.out.println("IS penalty should be given?Y/N");
            if(sc.next().equalsIgnoreCase("Y")){
                System.out.println("total penalty: "+penalty);
                totalPenalty+= penalty;
                penalty = 0;
            }

            System.out.println("Do you want another coffee? Y/N");
            if(sc.next().equalsIgnoreCase("Y")){
                System.out.println("Current total cost: "+cost);
            }
            else {
                System.out.println("Total cost: "+cost);
                System.out.println("Total penalty: "+totalPenalty);
                break;
            }
        }
    }
}
