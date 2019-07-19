package Example0718;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo07 {
	public static void main(String[] args) {
		//三种迭代能否删除
		
		//1.普通for循环，可以删除，但是索引要（--减减）
		//test1();
		
		//2.迭代器，可以删除，但是必须使用迭代器自身的remove方法，否则会出现并发修改异常
		//test2();
		
		//3.增强for循环  不可以删除
		test3();
	}

	private static void test3() {
		//增强for循环无法实现删除
		//增强for循环内部的实现机制是迭代器
		List<String> list=new ArrayList<>();
		list.add("java");
		list.add("c");
		list.add("python");
		list.add("h5");
		list.add("h5");
		list.add("css");
		
		for(String a:list) {
			if(a.equals("h5")) {
				list.remove(a);	//报错！！！
			}
		}
		System.out.println(list);
	}

	private static void test2() {
		List<String> list=new ArrayList<>();
		list.add("java");
		list.add("c");
		list.add("python");
		list.add("h5");
		list.add("h5");
		list.add("css");
		
		Iterator<String> iterator=list.iterator();
		while(iterator.hasNext()) {
			String str=iterator.next();
			if(str.equals("h5")) {
				//list.remove("h5"); //错误，会出现并发修改异常
				iterator.remove();	//移除当前遍历的元素
			}
		}
		System.out.println(list);
	}

	private static void test1() {
		List<String> list=new ArrayList<>();
		list.add("java");
		list.add("c");
		list.add("python");
		list.add("h5");
		list.add("h5");
		list.add("css");
		
		for(int i=0;i<list.size();i++) {
			String s=list.get(i);
			if(s.equals("h5")) {
				list.remove(i);
				i--;
			}
		}
		System.out.println(list);
	}
}
