package Example0725;

public class Demo09 {
	public static void main(String[] args) {
		/*
		 * finally关键字的特点及作用
		 * 1.finally的特点
		 * 	 finally的语句体一般情况下一定会执行
		 *   特殊情况：在执行到finally语句体之前jvm退出了(如：System.exit(0))
		 * 2.finally的作用
		 *   主要用于释放资源，在IO流操作和数据库操作中常见  
		 */
		try {
			int a=10/0;
		}catch (Exception e) {
			System.out.println("算术异常");
		}finally {
			System.out.println("会执行");
		}
	}
}
