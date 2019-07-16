package Example0715;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo03 {
	public static void main(String[] args) {
		//通过迭代器遍历集合
		
		//声明一个集合对象
		Collection coll=new ArrayList();
		coll.add("苹果");
		coll.add("香蕉");
		coll.add("葡萄");
		
		//获取迭代器对象
		Iterator iterator=coll.iterator();
		System.out.println(iterator.getClass());
		
		//遍历
		while(iterator.hasNext()) {	//判断是否有下一个元素
			Object o=iterator.next();	//获取下一个元素
			System.out.println(o);
		}
	}
}
