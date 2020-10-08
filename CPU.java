package Test2;

public class CPU {
	   private int speed;
	   private int memory;
	   private String model;
	   
	   public String name;
	   CPU(String name){
		   this.name = name;
		   
	   }

	   public int getSpeed() {
	      return speed;

	   }
	   
	   public int getMemory() {
		      return memory;

		   }
	   
	   public String getModel() {
		      return model;

		   }
	   
	   public void setSpeed(int speed) {
		   	  this.speed = speed;

	   }
	   
	   public void setMemory(int memory) {
		      this.memory = memory;

		   }
	   
	   public void setModel(String model) {
		      this.model = model;

		   }
	}