package Example0714;

public class Demo01 {
	public static void main(String[] args) {
		//计算1970年1月1日到现在多少天
		
//		the difference, measured in milliseconds, betweenthe current time and midnight, January 1, 1970 UTC.
		long time=System.currentTimeMillis();
		System.out.println(time);
		System.out.println(time/1000/60/60/24/365);
	}
}
