package Builder;

import java.util.ArrayList;
import java.util.Scanner;

public class PcBuilder{

    public static void main(String[] args) {
        ArrayList<Processor> processorList=new ArrayList<>();
        ArrayList<Specials> spList=new ArrayList<>();
        ArrayList<Ram> ramList=new ArrayList<>();
        ArrayList<Gpu> gpuList=new ArrayList<>();

        processorList.add(new Processor("R7",28));
        processorList.add(new Processor("I5", 20));
        processorList.add(new Processor("I7",37));
        processorList.add(new Processor("I9",65));

        spList.add(new Specials("Cpu Cooler",36));
        spList.add(new Specials("Liquid Cooler",17));
        spList.add(new Specials("DVD",6));
        spList.add(new Specials("",0));

        ramList.add(new Ram("2666 MHz",2));
        ramList.add(new Ram("3200 Mhz",3));

        gpuList.add(new Gpu("2GB",6));
        gpuList.add(new Gpu("4GB",7));

        Scanner sc=new Scanner(System.in);
        String bool="";
        Director dr = new Director();
        int choice;
            while (true){
                bool= sc.next();
                if(bool.equalsIgnoreCase("O")) {
                    System.out.println("Which Processor you want?");
                    for (int i = 0; i < processorList.size(); i++) {
                        System.out.println(i + ". " + processorList.get(i).name);
                    }
                    choice=sc.nextInt();
                    dr.setPs(processorList.get(choice));
                    dr.setSs(spList.get(choice));
                    System.out.println("Which Ram you want?");
                    for (int i = 0; i < ramList.size(); i++) {
                        System.out.println(i + ". " + ramList.get(i).name);
                    }
                    choice= sc.nextInt();
                    dr.setRam(ramList.get(choice));
                    System.out.println("Which Gpu you want?");
                    for (int i = 0; i < gpuList.size(); i++) {
                        System.out.println(i + ". " + gpuList.get(i).name);
                    }
                    choice= sc.nextInt();
                    dr.setGpu(gpuList.get(choice));
                    System.out.println(dr.makepc(dr.getPs(),dr.getSs(),dr.getRam(),dr.getGpu()));
                }
                else if(bool.equalsIgnoreCase("E"))
                    break;
            }

    }
}
