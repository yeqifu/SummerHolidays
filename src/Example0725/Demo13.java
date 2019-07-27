package Example0725;

import java.util.Scanner;

/*
 * 什么时候方法后面不需要写throws?
 *		方法内throw的异常对象如果是一个运行时异常，方法后面就不会写throws
 */

public class Demo13 {
	public static void main(String[] args) {
		/*
		 * 案例：自定义一个登陆异常
		 * 需求：1.当用户名和密码不正确是抛出登陆异常
		 * 		 2.用户名admin,密码为123
		 * 		 3.用户名和密码通过键盘输入
		 */
		//1.获取用户的输入
		Scanner scanner=new Scanner(System.in);
		System.out.print("请输入用户名:");
		String username=scanner.nextLine();
		
		System.out.println("请输入密码");
		String password=scanner.nextLine();
		
		if("admin".equals(username)&&"123".equals(password)) {
			System.out.println("登陆成功!!");
		}else {
			throw new LoginException("用户名或者密码不正确");
		}
	}
}
