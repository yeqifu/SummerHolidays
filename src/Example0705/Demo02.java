package Example0705;

import java.util.Scanner;

public class Demo02 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
//		System.out.println("请输入两个数字:");
//		int a=s.nextInt();
//		int b=s.nextInt();
//		System.out.println("第一个数字为:"+a);
//		System.out.println("第二个数字为:"+b);
		
//		System.out.println("请输入第一句话:");
//		String c=s.nextLine();
//		System.out.println("请输入第二句话");
//		String d=s.nextLine();
//		System.out.println("第一个字符串的值为:"+c);
//		System.out.println("第二个字符串的值为:"+d);
		test1();
	}

	private static void test1() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入一个数字:");
//		int a=scanner.nextInt();
		String a=scanner.nextLine();//把数字当作字符串进行处理
		System.out.println("您输入的数字为:"+a);
		
		System.out.println("请输入一句话:");
		//nextLine方法遇到回车换行就结束了
		String c=scanner.nextLine();
		System.out.println("您输入的话为:"+c);
	}
}
