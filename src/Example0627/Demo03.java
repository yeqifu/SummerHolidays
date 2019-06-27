package Example0627;

public class Demo03 {
	public static void main(String[] args) {
		Persons p=new SupperMans();
		p.fly();
		
		//有问题的写法
		Person p1=new Person();
		/*
		 * 向下转型注意：父类的真实对象必须是子类对象，否则会有问题
		 * 如果不是，会出现ClassCastException类型转换异常
		 * */
		SupperMan sm2 = (SupperMan)p1;
	}
}

class Persons{
	public void walk() {
		System.out.println("普遍人走...");
	}
	public void fly() {
		System.out.println("普通人不会飞...");
	}
}
class SupperMans extends Persons{
	public void fly() {
		System.out.println("超人，我会飞....");
	}
}
