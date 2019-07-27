package Example0725;

public class Demo03 {
	public static void main(String[] args) {
		/*
		 * try...catch多个异常
		 */
		try {
			int[] arr= {2,50,66};
			//System.out.println(arr[3]);
			
			int a=10/0;
			System.out.println(a);
		}catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("数组越界异常");
		}catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("算术异常");
		}
		
		System.out.println(".......");
	}
}
