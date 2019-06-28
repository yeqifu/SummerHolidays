package Example0628;

public class Demo02 {
	public static void main(String[] args) {
		Cat cat=new Cat();
		cat.name="小花";
		cat.age=3;
		cat.eat();
		cat.work();
		
		Dog dog=new Dog();
		dog.name="小黑";
		dog.age=2;
		dog.eat();
		dog.work();
	}
}
abstract class Animal{
	String name;
	int age;
	public abstract void eat();
}
class Cat extends Animal{

	public void eat() {
		System.out.println(name+"吃鱼...");
	}
	public void work() {
		// TODO Auto-generated method stub
		System.out.println(name+"抓老鼠...");
	}
	
}
class Dog extends Animal{
	public void eat() {
		System.out.println(name+"吃骨头...");
	}
	public void work() {
		System.out.println(name+"看家...");
	}
}
