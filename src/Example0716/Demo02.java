package Example0716;

import java.util.ArrayList;
import java.util.List;

public class Demo02 {
	public static void main(String[] args) {
		//List集合的特有功能概述和测试
		/*
		 * void add(int index,E element)  //添加元素到指定索引的位置处
		 * E remove(int index)	//删除指定索引的元素
		 * E get(int index)		//获得指定索引的元素
		 * E set(int index,E element)	//替换指定索引的元素
		 */
		List list=new ArrayList();
		list.add("java");
		list.add("python");
		list.add("go");
		System.out.println("list:"+list);
		
		//在python后面增加c
		list.add(2, "c");
		System.out.println("list:"+list);
		
		//获得python
		Object s=list.get(1);
		System.out.println(s);
		
		//将go设置为r
		list.set(3, "r");
		System.out.println(list);
	}
}
