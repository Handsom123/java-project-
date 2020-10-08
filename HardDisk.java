package Test2;

public class HardDisk {
	   private int amount; 
	   private int price;
	   private String trademark;
	   
	   public String name;
	   HardDisk(String name){
		   this.name = name;
	   }
	   
	   public int getAmount() {
	      return amount;

	   }
	   
	   public int getPrice() {
		      return price;

		   }
	   
	   public String getTrademark() {
		      return trademark;

		   }
	   
	   public void setAmount(int amount) {
	      this.amount = amount;

	   }
	   
	   public void setPrice(int price) {
		      this.price = price;

		   }
	   
	   public void setTrademark(String trademark) {
		      this.trademark = trademark;

		   }

	}