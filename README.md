# JAVA_TEXT2
## 实验内容:
  用类描述计算机中CPU的速度和硬盘的容量。要求Java应用程序有4个类，名字分别是PC、CPU、HardDisk和Test,其中Test是主类。
  
## 实验方法:
  ### CPU类:
    1.用setSpeed(int speed)方法将参数speed的值传给CPU中私有成员变量speed。
    2.用setMemory(int memory)方法将参数memory的值传给CPU中私有成员变量memory。
    3.用setModel(String model)方法将参数model的值传给CPU中私有成员变量model。
    4.用getSpeed()返回speed的值。
    5.用getMemory()返回memory的值。
    6.用getModel()返回model的值。
    7.用构造函数CPU(String name)方法降参数name的值穿给CPU中公有变量name。
  ### HardDisk类:
    1.用setAmount(int amount)方法将参数amount的值传给HardDisk中私有成员变量amount。
    2.用setPrice(int price)方法将参数price的值传给HardDisk中私有成员变量price。
    3.用setTrademark(int trademark)方法将参数trademark的值传给HardDisk中私有成员变量trademark。
    4.用getAmount()返回amount的值。
    5.用getPrice()返回price的值。
    6.用getTrademark()返回trademark的值。
    7.用构造函数HardDisk(String name)方法降参数name的值穿给HardDisk中公有变量name。
  ### PC类:
    1.用SetCPU(CPU cpu)将参数cpu赋值给cpu。
    2.用SetHardDisk(HardDisk HD)将参数HD赋值给HardDisk。
    3.用show()方法显示cpu的速度、内存、型号和硬盘的容量、价格、销量。
  ### Test类:
    1.main方法中创建一个CPU对象cpu,cpu将自己的speed设置为2200；将memoery设置为8；将model设置为a01。
    2.main方法中创建一个HardDisk对象HD，HD将自己的amount设计为200;将price设置为580;将trademark设置为hp。
    3.调用CPU和HardDisk的构造函数。
    
## 核心代码

   ### cpu核心代码:
'''
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
'''
   
   ### HardDisk核心代码:
'''
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

'''
  
   ### PC核心代码
'''
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
    
'''
    
   ### Test核心代码
'''
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
'''
   
## 实验结果
![result](https://raw.githubusercontent.com/Handsom123/java-project-/main/reslut.png)
    
## 实验感想 
    1.当用某个类在另外一个类中创建对象后，如果不希望该对象直接访问自己的变量，则通过"."运算符来操作自己的成员变量，就应当将该成员变量访问权限设置为private。
    2.类是Java程序的基本要素，一个Java应用程序就是由若干个类所构成的。
    3.在编程过程中要注意有良好的编程风格，使得代码具有可读性。
    
  
  
  
    
  
  


