package Example0725;

import java.util.Scanner;

public class Demo14 {
	public static void main(String[] args) {
		/*
		 * 案例：键盘输入的用户名只能包含英文字符
		 * 		1.使用键盘获取用户录入内容，只能传入英文字符串，否则抛出非法字符异常
		 * 		2.非法字符的异常需要自定义
		 * 		3.异常定义为运行时异常
		 */
		
		//1.获取用户的输入
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入用户名:");
		String username=scanner.nextLine();
		
		//2.判断用户的输入只能包含英文字符
		for(int i=0;i<username.length();i++) {
			if((username.charAt(i)>='a'&&username.charAt(i)<='z')||(username.charAt(i)>='A'&&username.charAt(i)<='Z')) {
				System.out.println("输入合法");
				break;
			}else {
				throw new IllegalCharacterException("输入用户名非法");
			}
		}
	}
}
class IllegalCharacterException extends RuntimeException{

	public IllegalCharacterException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}