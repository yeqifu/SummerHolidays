package Example0725;

public class Demo02 {
	public static void main(String[] args) {
		//自己处理异常
		/*
		 * try...catch
		 * ArithmeticException:算术异常
		 */
		/*try {
			int a=10/0;
		}catch (ArithmeticException e) {
			System.out.println("算术异常：除数不能为0");
		}*/
		try {
			int a=10/0;
		}catch (Exception e) {
			System.out.println(e.getClass());
			System.out.println(e.getMessage());
			System.out.println("算术异常：除数不能为0");
		}
	}
}
