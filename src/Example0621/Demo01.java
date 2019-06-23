package Example0621;

import java.util.Scanner;

public class Demo01 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
/*		String s;
		System.out.println("请输入一个字符串");
		s=scanner.nextLine();
		System.out.println(s);*/
		
		//求两个数的和
//		System.out.println("请输入第一个数:");
//		double a=scanner.nextDouble();
//		System.out.println("请输入第二个数:");
//		double b=scanner.nextDouble();
////		double sum=a+b;
//		System.out.println("两个数的和为:"+(a+b));
		
		//求两个数的最大值ֵ
//		System.out.println("请输入第一个数:");
//		double c=scanner.nextDouble();
//		System.out.println("请输入第二个数:");
//		double d=scanner.nextDouble();
//		double max=c>d?c:d;
//		System.out.println("最大数为"+max);
		
		//判断两个数是否相等
//		System.out.println("请输入第一个数:");
//		double e=scanner.nextDouble();
//		System.out.println("请输入第二个数:");
//		double f=scanner.nextDouble();
////		e==f?g="两个数相等":h="两个数不相等";
//		if(e==f) {
//			System.out.println("两个数相等");
//		}else {
//			System.out.println("两个数不相等");
//		}
		
		//�����������ȡ�������ֵ
		System.out.println("请输入第一个数:");
		double e=scanner.nextDouble();
		System.out.println("请输入第二个数:");
		double f=scanner.nextDouble();
		System.out.println("请输入第三个数:");
		double g=scanner.nextDouble();
		double max;
		if(e>f) {
			max=e;
		}else {
			max=f;
		}
		if(max>g) {
			max=max;
		}else {
			max=g;
		}
		System.out.println("最大数为"+max);
	}
}
