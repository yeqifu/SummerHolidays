package Example0627;

public class Demo01 {
	public static void main(String[] args) {
		Father son=new Son();
		son.eat();
	}
}

class Father{
	public void eat() {
		System.out.println("吃海鲜...");
	}
}
class Son extends Father{
	public void eat() {
		System.out.println("吃野味...");
	}
}