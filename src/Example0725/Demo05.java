package Example0725;

public class Demo05 {
	public static void main(String[] args) {
		/*多个异常处理是的一个注意事项：
		 * 多个异常时，不能把Exception异常放在最前面
		 * 相当于Exception是所有异常的父类，先由子类处理，子类不能处理时，再由父类处理
		 */
		try {
			int[] arr= {2,50,66};
			//System.out.println(arr[3]);
			
			//int a=10/0;
			//System.out.println(a);
			
			arr=null;
			System.out.println(arr[0]);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("数组越界异常");
		}catch (ArithmeticException e) {
			System.out.println("算术异常");
		}catch (Exception e) {
			System.out.println("其它异常");
		}
		
		System.out.println(".......");
	}
}
