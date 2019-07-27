package Example0725;

import java.util.Random;

public class Demo01 {
	public static void main(String[] args) {
		//异常
		/*
		 * main函数收到异常时，会有两种处理方式：
		 * 	1.自己将该问题处理，然后继续运行  [try-catch]
		 *  2.自己没有针对的处理方式，只有交给调用main的jvm来处理
		 *
		 * jvm有一个默认的异常处理机制，将该异常的名称、异常的信息、异常出现的位置打印在控制台上，同时停止程序的运行
		 */
		
		//1.数组越界异常   [ArrayIndexOutOfBoundsException]
		int[] arr= {5,10,36,66};
		//System.out.println(arr[5]);
		
		//2.空指针异常    [NullPointerException]
		arr=null;
		//System.out.println(arr[0]);
		
		
		//3.类型转换异常    [ClassCastException]
		Object a="5";
		Random b=(Random)a;
		System.out.println(b);
		
		System.out.println(".........");
	}
}
