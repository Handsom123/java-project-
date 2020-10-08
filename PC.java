package Test2;

public class PC {
    CPU cpu;
    HardDisk HD;   
    char type;   
    int sales;
    
    void setCPU(CPU cpu) {
        this.cpu = cpu;

    }

    void setHardDisk(HardDisk HD) {
        this.HD = HD;

    }

    void show(){
       System.out.println("CPU速度:"+cpu.getSpeed());
       System.out.println("CPU内存:"+cpu.getMemory());
       System.out.println("CPU型号:"+cpu.getModel());       
       System.out.println("硬盘容量:"+HD.getAmount());
       System.out.println("硬盘价格:"+HD.getPrice());
       System.out.println("硬盘牌子:"+HD.getTrademark());

    }

}
