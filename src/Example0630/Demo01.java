package Example0630;

public class Demo01 {
	public static void main(String[] args) {
		
		//Class这个类描述类的结构
		//Class描述一个类的类名、属性、方法、构造方法
		
		Animal dog = new Dog();
		Class cla=dog.getClass();
		
		System.out.println(cla);//输出  class  Example030.Dog
		System.out.println(cla.getName());//包名+类名
		System.out.println(cla.getSimpleName());//类名
		
		
		
		Animal cat=new Animal() {
			public void eat() {
				System.out.println("吃鱼...");
			}
		};
		Class cla2=cat.getClass();
		System.out.println(cla2);
		
		Ainterface a=new Ainterface() {
			
			@Override
			public void test1() {
				// TODO Auto-generated method stub
				System.out.println("a接口");
			}
		};
		Class cla3=a.getClass();
		System.out.println(cla3);
	}
}
 
interface Ainterface{
	public void test1();
}

abstract class Animal{
	public abstract void eat();
}
class Dog extends Animal{
	public void eat() {
		System.out.println("吃骨头");
	}
}