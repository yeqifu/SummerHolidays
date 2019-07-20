package Example0720;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Demo05 {
	public static void main(String[] args) {
		//案例：从键盘读取一行输入，去掉重复字符并打印
		
		//1.声明一个scanner对象
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入内容:");
		//2.声明一个set
		Set<Character> set=new HashSet<Character>();
		
		String s=scanner.nextLine();
		//将String转换成char
		char[] c=s.toCharArray();
		for(char d:c) {
			
			set.add(d);
		}
		
		System.out.println(set);
		
	}
}
