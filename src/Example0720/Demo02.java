package Example0720;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Demo02 {
	public static void main(String[] args) {
		/*
		 * HashSet
		 * 1.此类实现Set接口
		 * 2.由哈希表（实际上是一个HashMap实例）支持。
		 * 3.它不保证set的迭代顺序，特别是它不保证该顺序恒久不变。
		 * 4.此类允许使用null元素
		 * 
		 * 面试：你在开发中经常使用java的哪些包?
		 * 1.java.util包，这个包有很多的集合框架:List/Set/Map
		 * 
		 */
		
		//Set遍历一、迭代器
		Set<String> set=new HashSet<String>();
		set.add("Scarlett Johansson");
		set.add("Elizabthe Olsan");
		set.add("Anne Hathaway");
		//声明一个迭代器对象
		Iterator<String> iterator=set.iterator();
		while(iterator.hasNext()) {
			String s=iterator.next();
			System.out.println(s);
		}
		
		
	}
	
}
