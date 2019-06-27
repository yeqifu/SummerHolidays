package Example0627;

public class Demo04 {
	public static void main(String[] args) {
		Cat cat=new Cat();
		cat.name="小花猫";
		test(cat);
		Dog dog=new Dog();
		dog.name="小黑狗";
		test(dog);
	}
	//父类当作方法的参数
	public static void test(Animal animal) {
		animal.say();
	}
}
class Animal{
	String name;
	public void say() {
		System.out.println("我是一只小动物，叫"+name);
	}
}
class Cat extends Animal{
	
}
class Dog extends Animal{
	
}
