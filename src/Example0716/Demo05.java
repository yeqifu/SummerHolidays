package Example0716;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Demo05 {
	public static void main(String[] args) {
		/**
		 * ListIterator其它方法
		 * boolean hasNext()是否有下一个
		 * boolean hasPrevious()是否有上一个
		 * Object next()返回下一个元素
		 * Object prevous()返回上一个元素
		 */
		List list = new ArrayList();
		list.add("苹果");
		list.add("香蕉");
		list.add("葡萄");
		ListIterator li=list.listIterator();
		while(li.hasNext()) {
			Object o=li.next();
			String a=(String)o;
			System.out.println(a);
		}
		System.out.println("========================  ");
		while(li.hasPrevious()) {
			Object o=li.previous();
			String a=(String)o;
			System.out.println(a);
		}
	}
}
