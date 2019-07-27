package Example0725;

public class Demo04 {
	public static void main(String[] args) {
		//try...catch多个异常-另一种写法：把多个异常放在一个catch中，用|符号连接
		try {
			int[] arr= {2,50,66};
			//System.out.println(arr[3]);
			
			int a=10/0;
			System.out.println(a);
		}catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
			// TODO: handle exception
			System.out.println("数组越界异常或算术异常");
		}
		
		System.out.println(".......");
	}
}
