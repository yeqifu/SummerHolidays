package Example0723;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Demo06 {
	public static void main(String[] args) {
		//Collections工具类的概述和常见方法
		/*
		 * 1.Collection与Collections的区别
		 * 		Collection是一个接口
		 * 		Collections是一个类
		 * 2.Collections是针对集合操作的工具类
		 * 3.Collections成员方法
		 * 	 public static <T> void sort(List<T> list)
		 * 	 public static <T> int binarySearch(List<?> list,T key)  二分查找
		 * 	 public static <T> T max(Collection<T> coll)
		 * 	 public static <T> void reverse(List<?> list)
		 * 	 public static <T> void shuffle(List<?> list)
		 */
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(30);
		list.add(50);
		list.add(2);
		list.add(90);
		System.out.println(list);
		
		//1.给list集合进行排序
		Collections.sort(list);
		System.out.println(list);
		
		//2.二分查找
		int index=Collections.binarySearch(list, 50);
		System.out.println(index);
		
		//3.取集合的最大值
		int max=Collections.max(list);
		System.out.println(max);
		
		//4.reverse 反转
		Collections.reverse(list);
		System.out.println(list);
		
		//5.shuffle打乱顺序
		Collections.shuffle(list);
		System.out.println(list);
	}
}
