package Test2;

public class Test {
	   public static void main(String args[]) {
	       CPU cpu = new CPU("abc");
	       HardDisk HD=new HardDisk("dce");
	       
	       cpu.setSpeed(2200);
	       cpu.setMemory(8);
	       cpu.setModel("a01");       
	       
	       HD.setAmount(200);
	       HD.setPrice(580);
	       HD.setTrademark("hp");
	       
	       PC pc =new PC();
	       pc.setCPU(cpu);
	       pc.setHardDisk(HD);
	       pc.show();

	    }

	}