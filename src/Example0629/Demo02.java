package Example0629;

public class Demo02 {
	public static void main(String[] args) {
		Outer.method().show();;
	}
}

interface Inter{
	void show();
}
class A implements Inter{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("HelloWorld");
	}
	
}
class Outer{
	//第一种写法
/*	public static A method() {
		return new A();
	}*/
	//第二种写法：接口指向匿名内部类对象
	//方法的返回类型是接口
	public static Inter method() {
		return new Inter() {

			@Override
			public void show() {
				// TODO Auto-generated method stub
				System.out.println("HelloWorld");
			}
			
		};
	}
	
}
