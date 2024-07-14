package FactoryMethod;

 class BMW extends Car {
    public BMW(){
        model="BMW";
        color= "Black";
        manufacturer="Germany";
        fuel="Electric";
        drive_train="Rear wheel";
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
