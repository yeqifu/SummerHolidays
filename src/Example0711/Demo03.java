package Example0711;

import java.util.Scanner;

public class Demo03 {
	public static void main(String[] args) {
		//字符串反转   abc-->cba
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入字符串：");
		String str=sc.nextLine();
		int len=str.length()-1;
		for(int i=len;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
		
	}
}
