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
       System.out.println("CPU�ٶ�:"+cpu.getSpeed());
       System.out.println("CPU�ڴ�:"+cpu.getMemory());
       System.out.println("CPU�ͺ�:"+cpu.getModel());       
       System.out.println("Ӳ������:"+HD.getAmount());
       System.out.println("Ӳ�̼۸�:"+HD.getPrice());
       System.out.println("Ӳ������:"+HD.getTrademark());

    }

}
