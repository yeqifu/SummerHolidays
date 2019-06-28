package Example0628;


public class Demo01 {
	public static void main(String[] args) {
		Dog1 dog=new Dog1();
		dog.eatsss();
		//多态
		/**
		 * 叫法：
		 * 1.父类指向子类对象
		 * 2.抽象类指向子类对象
		 * 3.抽象类指向实现类对象
		 */
		Animals dog2=new Dog1();
		dog2.eatsss();
	}
}
abstract class Animals{
	public abstract void eatsss();
}
class Dog1 extends Animals{

	@Override
	public void eatsss() {
		System.out.println("吃骨头...");
	}
	
}
