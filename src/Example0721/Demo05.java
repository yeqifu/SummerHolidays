package Example0721;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Demo05 {
	public static void main(String[] args) {
		/*
		 * 从键盘输入接收多个整数，直到输入quit时结束输入
		 * 把所有输入的整数倒序【由大到小】排列打印
		 */
		//1.声明一个存储整数的集合
		Set<Integer> set=new TreeSet<Integer>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2-o1; //由大到小
			}
		});
		
		//2.声明一个scanner对象
		Scanner scanner=new Scanner(System.in);
		System.out.println("请多次输入数字按回车，如果退出请输入quit");
		
		while(true) {
			String str=scanner.nextLine();
			if(str.equals("quit")) {
				break;
			}
			set.add(Integer.parseInt(str));//将字符串转成int类型
		}
		for(Integer num:set) {
			System.out.println(num);
		}
	}
}
