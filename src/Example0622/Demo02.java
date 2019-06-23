package Example0622;

import java.util.Scanner;

public class Demo02 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入第一个数：");
		int a=scanner.nextInt();
		System.out.println("请输入第二个数：");
		int b=scanner.nextInt();
		int c=add(a,b);
		System.out.println("两个数中的最大数为："+c);
	}
	public static int add(int a ,int b) {
		int max=a>b?a:b;
		return max;
	}
	
	
}
