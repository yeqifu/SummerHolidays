package Example0725;

public class Demo11 {
	public static void main(String[] args) {
		/*
		 * 面试题：
		 * 如果catch里面有return语句，请问finally的代码还会执行吗？
		 * 如果会，请问是在return前还是return后
		 * 会执行， 在return前执行
		 */
	
		/*try {
			int a=10/0;
		}catch (ArithmeticException e) {
			
			System.out.println("算术异常");
			return;
		}finally {
			System.out.println("不知道会不会执行");
		}*/
		int a=getDiv(10, 0);
		System.out.println(a);
	}
	public static int getDiv(int a,int b) {
		int i=0;
		try {
			i=a/b;
			return i;
		}catch (Exception e) {
			System.out.println("算术异常");
			i=-1;
			return i;
		}finally {
			System.out.println("finally代码执行了");
			i=-2;
		}
	}	
}
