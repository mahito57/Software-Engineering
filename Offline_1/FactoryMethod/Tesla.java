package FactoryMethod;
public class Tesla extends Car{
    public Tesla(){
        model="Tesla";
        color= "White";
        manufacturer="US";
        fuel="Electric";
        drive_train="All wheels";

        }
        @Override
        void spec(){
         System.out.println("Car Model: "+model+"\n"+
                "Color: "+color+"\n"+
                "Manufacturer: "+manufacturer+"\n"+
                "Fuel: "+fuel+"\n"+
                "Drive Train: "+drive_train+"\n");
    }
}
