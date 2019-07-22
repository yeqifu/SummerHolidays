package Example0721;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Demo06 {
	//键盘录入学生信息按照总分排序后输出在控制台
	/*1.创建学生类
	 * 		添加3个科目（语文，数学，英语）的成绩属性
	 * 		添加名字属性
	 * 		在有参构造方法中把总分算好
	 * 2.把n个学生添加到TreeSet中
	 * 3.TreeSet要进行总分排序
	 * 4.键盘输入学生的信息格式为：【名字，89,98,99】
	 * 5.当键盘输入quit,代表学生的成绩录入完毕
	 */
	public static void main(String[] args) {
		//声明一个set存储学生对象
		Set<Students> set=new TreeSet<Students>();
		
//		set.add(new Students("刘备",80,80,80));
//		set.add(new Students("关羽",90,70,90));
//		set.add(new Students("张飞",70,60,60));
		
		//声明一个scanner对象
		Scanner scanner=new Scanner(System.in);
		System.out.println("请录入学生成绩，录入格式为：【名字,89,85,60】");
		System.out.println("如果录入完毕，请输入quit退出");
		while(true) {
			//录入学生成绩
			String str=scanner.nextLine();
			//判断是否为quit
			if(str.equals("quit")) {
				break;
			}
//			System.out.println("stu:"+str);
			//把固定格式的字符串解析成数组
			String[] stus=str.split(",");
			String name=stus[0];
			String chinese=stus[1];
			int chinese2=Integer.parseInt(chinese);
			String math=stus[2];
			int math2=Integer.parseInt(math);
			
			String english=stus[3];
			int english2=Integer.parseInt(english);
			
			set.add(new Students(name,chinese2,math2,english2));

			//System.out.println(Arrays.toString(stus));

		}

		for(Students stu:set) {
			System.out.println(stu);
		}
	}
}
