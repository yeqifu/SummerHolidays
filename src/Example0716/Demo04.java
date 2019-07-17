package Example0716;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * 1.ConcurrentModificationException:并发修改异常
 * 2.默认情况下，不能一边遍历元素，一边添加元素
 * 3.如果向一边遍历元素，一边添加元素，可以使用迭代器ListIterator
 * @author YQF
 *
 */
public class Demo04 {
	public static void main(String[] args) {
		//需求：有一个集合，判断里面有没有"word"这个元素，如果有，就添加一个"javaee"元素
		//1.声明集合对象
//		test1();
		test2();
	}

	private static void test2() {
		List list=new ArrayList();
		//2.添加元素
		list.add("java");
		list.add("word");
		list.add("hello");
		//3.遍历元素
		ListIterator li=list.listIterator();
		while(li.hasNext()) {
			//4.取元素
			Object obj=li.next();
			String str=(String)obj;//强制类型转换
			//5.添加元素
			if(str.equals("word")) {
				li.add("javaee");//通过迭代器添加元素
//				list.add("javaee");//不要用集合来添加元素
			}
		}
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}

	private static void test1() {
		test2();
	}
	
}
