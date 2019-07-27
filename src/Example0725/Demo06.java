package Example0725;

import java.io.FileInputStream;

public class Demo06 {
	public static void main(String[] args) {
		/*
		 * Java中的异常被分为两大类：“编译时异常”和“运行时异常”
		 * 编译时异常和运行时异常的区别：
		 *   	>所有的RuntimeException类及其子类的实例被称为运行时异常
		 *   	>其它的异常就是编译时异常
		 *   
		 *  编译时异常
		 *  	Java程序必须显示处理，否则程序就会发生错误，无法通过编译
		 *  运行时异常
		 *  	无需显示处理，但也可以像编译时异常一样处理
		 *  	如数组越界，空指针等都是运行时异常
		 */
		
		//编译时异常
		//FileInputStream fis=new FileInputStream("a.txt");
		
		try {
			FileInputStream fis=new FileInputStream("a.txt");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("找不到文件");
		}
		
	
		
		//运行时异常
		ArithmeticException ae;
		NullPointerException npe;
		int a=10/0;
		
	}
}
