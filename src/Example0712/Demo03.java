package Example0712;

public class Demo03 {
	public static void main(String[] args) {
		/*
		 StringBuffer和String的相互转换
		 
		 String -> StringBuffer
		 1.通过构造方法
		 2.通过append()方法
		 
		 StringBuffer -> String
		 1.通过构造方法
		 2.通过toString()方法
		 3.通过subString(star);
		 
		 */
		test1();
		
		StringBuffer s=new StringBuffer("Hello,Scarlett Johansson");
		//1.通过构造方法
		String s1=new String(s);
		System.out.println(s1);
		
		//2.通过toString()方法
		String s2=s.toString();
		System.out.println(s2);
		
		//3.通过subString(start);
		String s3=s.substring(0);
		System.out.println(s3);
		
	}

	private static void test1() {
		String s="Hello,Scarlett Johansson";
		//1.通过构造方法
		StringBuffer s2=new StringBuffer(s);
		System.out.println(s2); 
		
		//2.通过append()方法
		StringBuffer s3=new StringBuffer();
		s3.append(s);
		System.out.println(s3);
	}
}
