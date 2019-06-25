package Example0624;

public class Demo02 {
	public static void main(String[] args) {
		//匿名对象
		Computer cp=new Computer();
		cp.brand="huashuoFSV351";
		cp.runScore=10000;
		print(cp);
		new Computer().brand="ThinkPad S2";
		new Computer().runScore=12000;
		print(new Computer());
	}
	public static void print(Computer cp) {
		System.out.println(cp.brand+"的跑分为："+cp.runScore);
	}
}
class Computer{
	String brand;
	int runScore;
}
