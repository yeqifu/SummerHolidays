package Example0718;

import java.util.ArrayList;
import java.util.List;

public class Demo05 {
	
	public static void main(String[] args) {
		//增强for循环
		/*
		 * 增强for循环概述：简化数组和Collection集合的遍历
		 * 格式：
		 * for(元素数据类型 变量：数组或者Collection集合){
		 * 		使用变量即可，该变量就是元素
		 * }
		 */
		
		//1.基本数据类型的数组
		int[] arr= {25,69,21};
		for(int num:arr) {
			System.out.println(num);
		}
		
		//2.集合
		List<String> list=new ArrayList<String>();
		list.add("Scarlette Johansson");
		list.add("Elizabthe Olsan");
		list.add("Anne Hathaway");
		
		int i=0;
		for(String str:list) {
			i++;
			System.out.println("第"+i+"元素"+str);
		}
	}
}
