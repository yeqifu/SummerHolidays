package Example0627;

public class Demo02 {
	public static void main(String[] args) {
		Person p=new SupperMan();
		p.fly();
	}
}

class Person{
	public void walk() {
		System.out.println("普遍人走...");
	}
	public void fly() {
		System.out.println("普通人不会飞...");
	}
}
class SupperMan extends Person{
	public void fly() {
		System.out.println("超人，我会飞....");
	}
}