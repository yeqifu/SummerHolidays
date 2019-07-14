package Example0713;

public class Demo04 {
	public static void main(String[] args) {
		//1.将a转换成String类型
		int a=50;
		//通过Integer的构造方法进行转换
		Integer b=new Integer(a);
		String c=b.toString();
		System.out.println(c);
		
		//2.Integer的静态属性
		System.out.println("int最小值："+Integer.MIN_VALUE);
		System.out.println("int最小值："+Integer.MAX_VALUE);
		
		//3.Integer的其它方法
		//3.1把int转成2进制的字符串
		System.out.println(Integer.toBinaryString(9));
		
		//3.2把int转成8进制的字符串
		System.out.println(Integer.toOctalString(9));
		
		//3.3把int转成16进制的字符串
		System.out.println(Integer.toHexString(16));
	}
}
