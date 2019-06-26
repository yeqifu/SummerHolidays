package Example0626;

import java.util.Random;
import java.util.Scanner;

public class Demo01 {
	public static void main(String[] args) {
		Caiyicai c=new Caiyicai();
		int a=c.randomMath();
		System.out.println(a);
		System.out.println("请输入一个1-99之间的数：");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<100;i++) {
			int b=sc.nextInt();
			if(a==b) {
				System.out.println("恭喜你猜对了！");
				break;
			}else {
				System.out.println("请再次输入数字：");
			}
		}
		
	}
}
class Caiyicai{
	
	
	public int randomMath() {
		Random rd=new Random();
		int a=rd.nextInt(98);
		a=a+1;
		return a;
	}
	
	
}