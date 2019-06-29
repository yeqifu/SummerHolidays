package Example0629;

public class Demo01 {
	public static void main(String[] args) {
		//这是一个匿名内部类，也是一个匿名对象
/*		new Animal() {
			@Override
			public void jumpFireCircle() {
				// TODO Auto-generated method stub
				System.out.println("猫跳火圈");
			}
		}.jumpFireCircle();*/
		
		//这只是一个匿名内部类，不是匿名对象
		Animal cat=new Animal() {

			@Override
			public void jumpFireCircle() {
				// TODO Auto-generated method stub
				System.out.println("猫跳火圈");
			}
			
		};
		cat.jumpFireCircle();
	}
}
interface Animal{
	public void jumpFireCircle();
	
}
class Dog implements Animal{

	@Override
	public void jumpFireCircle() {
		// TODO Auto-generated method stub
		System.out.println("狗跳火圈");
	}
	
}