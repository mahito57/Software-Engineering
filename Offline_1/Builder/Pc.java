package Builder;

class Pc {
    Processor ps;
    Specials ss;
    Ram ram;
    Gpu gpu;
    String motherboard;
    String hdd;
    int totalprice;

    public Pc(Processor ps,Specials ss,Ram ram,Gpu gpu){
        this.ps=ps;
        this.ss=ss;
        this.ram=ram;
        this.gpu=gpu;
        motherboard="default";
        hdd="1 TB";
        totalprice=ps.price+ss.price+ram.price+gpu.price;
    }

    @Override
    public String toString(){
        String str=" Processor: "+ps.name+"\n Special Item: "+ss.name+"\n Ram: "+ram.name+"\n Gpu: "+gpu.name+"\n Total Price: "+totalprice;
        return str;
    }
}

