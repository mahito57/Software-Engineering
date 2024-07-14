package FactoryMethod;
public class CarCreator {
    public Car getInstance(String loc){
        if(loc.equalsIgnoreCase("Asia")){
            return new Toyota();
        }
        if(loc.equalsIgnoreCase("Europe")){
            return new BMW();
        }
        if(loc.equalsIgnoreCase("US")){
            return new Tesla();
        }
        else return new dummy();
    }
}
