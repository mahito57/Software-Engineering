package Builder;

 class Director{
    Processor ps;
    Specials ss;
    Ram ram;
    Gpu gpu;

    public Processor getPs() {
        return ps;
    }

    public Specials getSs() {
        return ss;
    }

    public Ram getRam() {
        return ram;
    }

    public Gpu getGpu() {
        return gpu;
    }

    public void setPs(Processor ps) {
        this.ps = ps;
    }

    public void setSs(Specials ss) {
        this.ss = ss;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public void setGpu(Gpu gpu) {
        this.gpu = gpu;
    }
    public Pc makepc(Processor ps,Specials ss,Ram ram, Gpu gpu){
        Pc newPc=new Pc(ps,ss,ram,gpu);
        return newPc;
    }
}
