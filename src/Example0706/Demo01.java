package Example0706;

import java.util.Scanner;

public class Demo01 {
	public static void main(String[] args) {
		login();
	}

	private static void login() {
		// TODO Auto-generated method stub
		for(int j=2;j<3;j--) {
			
			Scanner scanner=new Scanner(System.in);
			System.out.println("请输入用户名:");
			String userName=scanner.nextLine();
			System.out.println("请输入密码:");
			String password=scanner.nextLine();
			if(j==0) {
				System.out.println("您今天已经输错了三次，账号已冻结，请找相关工作人员解冻！");
				break;
			}else {
				if(userName.equals("admin")&&password.equals("admin")) {
					System.out.println("登陆成功！");
					break;
				}else {
					System.out.println("登陆失败！用户名或密码错误！"+"您还有"+j+"次机会");
				}
			}
		}
	}
}
