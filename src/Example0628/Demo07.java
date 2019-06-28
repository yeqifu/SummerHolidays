package Example0628;

public class Demo07 {
	public static void main(String[] args) {
		//静态内部类的使用
		//1.创建静态内部类对象
		Outer.Inner inner=new Outer.Inner();
		inner.test2();
		
		//2.创建默认内部类对象语法：
		//	外部类名.内部类名 对象名=外部类对象.内部类对象
		//Outer.Inner inn=new Outer().new Inner();
		
		
		//3.调用内部类的静态方法
		Outer.Inner.test1();
	}
}
class Outer{
	static int a =10;
	//静态内部类
	static class Inner{
		public void test2() {
			//"内部类"可以直接访问"外部类"的成员，包括私有
			System.out.println("内部类访问外部类的成员a="+a);
		}
		public static void test1() {
			System.out.println(".......");
		}
	}
}