package Example0628;

public class Demo05 {
	public static void main(String[] args) {
		Catss cat=new Catss("小花", 2);
		cat.eat();
		cat.sleep();
		cat.jumpHeight();
		
		Dogss dog=new Dogss("小黑",3);
		dog.eat();
		dog.sleep();
		dog.jumpHeight();
		
		new Car("白色",4);
	}
}

abstract class Animalss{
	String name;
	int age;
	public Animalss(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public abstract void eat();
	public abstract void sleep();
}

interface trainInterface{
	public void jumpHeight();
}

class Catss extends Animalss implements trainInterface{

	public Catss(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println(name+"吃鱼...");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println(name+"趴着睡...");
	}
	public void jumpHeight() {
		System.out.println(name+"调高");
	}
}
class Dogss extends Animalss implements trainInterface{

	public Dogss(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println(name+"吃骨头..");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println(name+"躺着睡...");
	}
	public void jumpHeight() {
		System.out.println(name+"调高");
	}
}