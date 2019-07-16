package Example0715;

import java.util.ArrayList;
import java.util.Collection;

public class Demo02 {
	public static void main(String[] args) {
		//集合的遍历，将集合转换成数组
		
		//1.创建集合对象
		Collection coll=new ArrayList();
		
		//2.添加元素
		coll.add("apple");
		coll.add("banana");
		coll.add("orange");
		
		//3.集合的遍历
		Object[] objs=coll.toArray();	//将集合转换成数组
		for(int i=0;i<objs.length;i++) {
			Object o=objs[i];
			System.out.println(o);
			System.out.println(o.getClass());
		}
	}
}
